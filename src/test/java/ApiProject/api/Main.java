package ApiProject.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import org.testng.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatePlace place=new CreatePlace();
		Location l=new Location();
		String[] type= {"Shoe Park","Shoes"};
		place.setAccuracy(50);
		place.setName("Frontline house");
		place.setPhone_number("(+91) 983 893 3937");
		place.setAddress("Vadgaonsheri-14");
		place.setTypes(type);
		place.setWebsite("https://google.com");
		place.setLanguage("French-IN");
		l.setLat(-38.383494);
		l.setLng(33.427362);
		place.setLocation(l);
		
		
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("key","qaclick123");
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response=given().queryParams(map).header("content-Type","application/json")
		.body(place).when().post("/maps/api/place/add/json").then().extract().response().asString();
		
		JsonPath js=new JsonPath(response);
		String id=js.getString("place_id");
		
		System.out.println(id);
		
		map.remove("key");
		
		map.put("place_id",id);
		map.put("address", "Vadgaonsheri-Pune");
		map.put("key","qaclick123");
		
		
		//Update the address of above Location.
		given().body(map).header("content-Type","application/json")
		.when().put("/maps/api/place/update/json")
		.then().assertThat().body("msg",equalTo("Address successfully updated"));
		
		//System.out.println(temp);
		
		String address=map.get("address");
		
		map.remove("address");
		
		
		//GetPlace and validate updated Address.
		String s=given().queryParams(map)
		.when().get("/maps/api/place/get/json")
		.then().extract().response().asString();
		
		js=new JsonPath(s);
		
		String updateAddress=js.getString("address");

		Assert.assertEquals(address,updateAddress);
		
		//Getting the size of Headless Array
		
		String newResponse=Payloads.headlessArray();
		
		JsonPath j=new JsonPath(newResponse);
		System.out.println(j.getInt("size()"));
		
		
	}

}

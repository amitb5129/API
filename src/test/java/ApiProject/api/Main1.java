package ApiProject.api;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JsonPath js=new JsonPath(Payloads.complex_json());
		
		JSONArray a=new JSONArray(Payloads.arrayJson());
		
		String response=a.get(0).toString();
		
		JSONObject js=new JSONObject(response);
		
		JSONObject js1=new JSONObject(js.get("sendingReqDataSet").toString());
		
		//System.out.println(js1.toString());
		
		JSONArray array=new JSONArray(js1.get("contacts").toString());
		
		JSONObject object=new JSONObject(array.get(0).toString());
		
		//System.out.println(object.toString());
		
		System.out.println(object.get("request_by"));
		

	}

}

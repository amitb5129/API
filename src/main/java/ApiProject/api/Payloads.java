package ApiProject.api;

public class Payloads {

	public static String addPlaces() {
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Amits House\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://toolsqa.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";
	}

	public static String complex_json() {
		return "{\r\n" + "\r\n" + "\"dashboard\": {\r\n" + "\r\n" + "\"purchaseAmount\": 910,\r\n" + "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n" + "\r\n" + "},\r\n" + "\r\n" + "\"courses\": [\r\n"
				+ "\r\n" + "{\r\n" + "\r\n" + "\"title\": \"Selenium Python\",\r\n" + "\r\n" + "\"price\": 50,\r\n"
				+ "\r\n" + "\"copies\": 6\r\n" + "\r\n" + "},\r\n" + "\r\n" + "{\r\n" + "\r\n"
				+ "\"title\": \"Cypress\",\r\n" + "\r\n" + "\"price\": 40,\r\n" + "\r\n" + "\"copies\": 4\r\n" + "\r\n"
				+ "},\r\n" + "\r\n" + "{\r\n" + "\r\n" + "\"title\": \"RPA\",\r\n" + "\r\n" + "\"price\": 45,\r\n"
				+ "\r\n" + "\"copies\": 10\r\n" + "\r\n" + "}\r\n" + "\r\n" + "]\r\n" + "\r\n" + "}";
	}

	public static String headlessArray() {
		return "[\r\n" + "    {\r\n" + "        \"book_name\": \"Automation with Java\",\r\n"
				+ "        \"isbn\": \"AB\",\r\n" + "        \"aisle\": \"0\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "        \"book_name\": \"Automation with Java\",\r\n" + "        \"isbn\": \"AB\",\r\n"
				+ "        \"aisle\": \"0\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "        \"book_name\": \"Automation with Java\",\r\n" + "        \"isbn\": \"AA\",\r\n"
				+ "        \"aisle\": \"10\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "        \"book_name\": \"Automation with Java\",\r\n" + "        \"isbn\": \"BB\",\r\n"
				+ "        \"aisle\": \"20\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "        \"book_name\": \"Varun Novel\",\r\n" + "        \"isbn\": \"V\",\r\n"
				+ "        \"aisle\": \"7\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "        \"book_name\": \"Learn Appium Automation with Java\",\r\n"
				+ "        \"isbn\": \"israel\",\r\n" + "        \"aisle\": \"0\"\r\n" + "    }\r\n" + "]";
	}

	public static String arrayJson() {
		return "[\r\n" + "{\r\n" + "\"sendingReqDataSet\": {\r\n" + "\"totalCount\": 1,\r\n" + "\"limit\": 50,\r\n"
				+ "\"offset\": 0,\r\n" + "\"status_code\": true,\r\n" + "\"contacts\": [\r\n" + "{\r\n"
				+ "\"id\": 1,\r\n" + "\"request_to\": \"Shehla_kiran\",\r\n" + "\"request_by\": \"ayesha\",\r\n"
				+ "\"product_name\": \"Dead Space\",\r\n" + "\"schedule_date_time\": \"2016-09-21 00:00:00\",\r\n"
				+ "\"place\": \"lhr\",\r\n" + "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n"
				+ "},\r\n" + "{\r\n" + "\"id\": 2,\r\n" + "\"request_to\": \"muqadas\",\r\n"
				+ "\"request_by\": \"muqadas\",\r\n" + "\"product_name\": \"battleField\",\r\n"
				+ "\"schedule_date_time\": \"2016-09-22 00:00:00\",\r\n" + "\"place\": \"lhr\",\r\n"
				+ "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"id\": 3,\r\n" + "\"request_to\": \"Shehla_kiran\",\r\n" + "\"request_by\": \"Shehla_kiran\",\r\n"
				+ "\"product_name\": \"Mario\",\r\n" + "\"schedule_date_time\": \"2016-09-12 00:00:00\",\r\n"
				+ "\"place\": \"Lahore\",\r\n" + "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n"
				+ "},\r\n" + "{\r\n" + "\"id\": 4,\r\n" + "\"request_to\": \"Shehla_kiran\",\r\n"
				+ "\"request_by\": \"Mari\",\r\n" + "\"product_name\": \"Mario\",\r\n"
				+ "\"schedule_date_time\": \"0000-00-00 00:00:00\",\r\n" + "\"place\": \"\",\r\n"
				+ "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"id\": 5,\r\n" + "\"request_to\": \"Shehla_kiran\",\r\n" + "\"request_by\": \"Faisal Ali\",\r\n"
				+ "\"product_name\": \"Dead Space\",\r\n" + "\"schedule_date_time\": \"2016-10-28 00:00:00\",\r\n"
				+ "\"place\": \"lahore\",\r\n" + "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n"
				+ "},\r\n" + "{\r\n" + "\"id\": 6,\r\n" + "\"request_to\": \"muqadas\",\r\n"
				+ "\"request_by\": \"Faisal Ali\",\r\n" + "\"product_name\": \"battleField\",\r\n"
				+ "\"schedule_date_time\": \"2016-10-25 00:00:00\",\r\n" + "\"place\": \"Canal\",\r\n"
				+ "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"id\": 7,\r\n" + "\"request_to\": \"Shehla_kiran\",\r\n" + "\"request_by\": \"Shehla_kiran\",\r\n"
				+ "\"product_name\": \"Dead Space\",\r\n" + "\"schedule_date_time\": \"2016-10-17 00:00:00\",\r\n"
				+ "\"place\": \"Lahore\",\r\n" + "\"request_type\": \"Swap\",\r\n" + "\"status\": \"Pending\"\r\n"
				+ "}\r\n" + "]\r\n" + "}\r\n" + "}\r\n" + "]";
	}

}

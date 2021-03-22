package RestAssured;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

@Test
public class Test_Put {

public void test_1_put() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		map.put("Name", "Neelesh");
//		map.put("Job", "Teacher");
//		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("Name", "Neelesh");
		request.put("Job", "Tester");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		       header("content-type" , "application/json").
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).
		       body(request.toJSONString()).
		when().
		       put("https://reqres.in/api/users/2").
		then().
		       statusCode(200).
		       log().all();
	}

	
}

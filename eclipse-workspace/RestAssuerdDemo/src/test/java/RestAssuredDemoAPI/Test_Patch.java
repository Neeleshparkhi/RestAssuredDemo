package RestAssuredDemoAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Patch {

	@Test
	public void test01_patch()
	{
		
		JSONObject request = new JSONObject();

		baseURI = "http://localhost:3000/";
		
		request.put("lastName", "Mark");
		
		given().
		 		contentType(ContentType.JSON).
		 		accept(ContentType.JSON).
		 		header("content-type" , "application/json").
		     	body(request.toJSONString()).
		when().
				patch("/users/3").
		then().
				statusCode(200).
				log().all();
		
	}
	
}

package RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

@Test
public class Test_Patch {

	public void test01_patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("Name", "Neelesh");
		request.put("Job", "Tester");
		
		given().
		       header("context-type" , "application/json") .
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).
		       body(request.toJSONString()).
		when().
		       patch("https://reqres.in/api/users/2").
		then().
		       statusCode(200).
		       log().all();
		
	}
}

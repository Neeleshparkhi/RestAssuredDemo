package RestAssuredDemoAPI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Post {

	@Test
	public void test01_Post() {
		
		JSONObject request = new JSONObject();
		
		baseURI = "http://localhost:3000/";
		
		request.put("firstName", "Tom");
		request.put("lastName", "cooper");
		request.put("subjectId", 2);
		
		given().
		     	contentType(ContentType.JSON).
		     	accept(ContentType.JSON).
		     	header("content-type" , "application/json").
		     	body(request.toJSONString()).
		when().
		        post("/users").
		then().
				statusCode(201).
				log().all();
		
	}
	
}

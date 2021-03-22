package RestAssuredDemoAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Put {
	
	@Test
	public void test01_put()
	{
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Walter");
		request.put("lastName", "Max");
		request.put("subjectId", 3);
		
		baseURI = "http://localhost:3000/";
		
		given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("content-type" , "application/json").
				body(request.toJSONString()).
		when().
				put("/users/3").
		then().
				statusCode(200).
				log().all();
	}

}

package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class Test_Delete {

	public void test01_delete() {
		
		JSONObject request = new JSONObject();
		
		given().
		        header("context-type" , "application/json") .
	            contentType(ContentType.JSON).
	            accept(ContentType.JSON).
	            body(request.toJSONString()).
	    when().
	            delete("https://reqres.in/api/users/2").
	    then().
	            statusCode(204);
		
		
		
	}
	
}

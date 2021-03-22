package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//NOTE:- if i write this import as Static, then i no need to create the object of Responce. 
//I can directly call the methods
//import static io.restassured.RestAssured.*

public class Test01_GET {
	
	@Test
	void test_01() {
		
		Response response =  get("https://reqres.in/api/users?page=2");
		
	   System.out.println(response.statusCode());
	   System.out.println(response.getBody().asString());
	   System.out.println(response.asString());
	   System.out.println(response.getStatusLine());
	   System.out.println(response.getHeader("content-type"));
	   System.out.println(response.getTime());
	   
	   int statusCode = response.getStatusCode();
	   
	   Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test
	void test_02() {
		
	   given()
	          .get("https://reqres.in/api/users?page=2").
	   then()
	           .statusCode(200)
	           .body("data.id[0]" , equalTo(7));
	   
	}

}

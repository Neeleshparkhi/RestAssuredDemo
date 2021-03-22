package RestAssuredDemoAPI;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test_GET {
	
	//@Test
	public void test_Get()
	{
		
		baseURI = "http://localhost:3000/";
		
		given().
		       get("/users").
		then().
		       statusCode(200).
		       log().all();
		
	}
	
	@Test
	public void test01_Get()
	{
		baseURI = "http://localhost:3000/";
		
		given().
		       param("name", "Automation").
		       get("/subjects").
		then().
		       statusCode(200).
		       log().all();
	}

}

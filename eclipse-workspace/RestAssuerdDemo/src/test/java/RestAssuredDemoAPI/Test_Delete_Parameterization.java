package RestAssuredDemoAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Delete_Parameterization {
	
	@Parameters({"userid"})
	@Test
	public void test01_delete(int userid)
	{
		
		System.out.println("Value for userid is " + userid);
		baseURI = "http://localhost:3000/";
		
		when().
				delete("/users/"+userid).
		then().
				statusCode(200).
				log().all();
	}

}

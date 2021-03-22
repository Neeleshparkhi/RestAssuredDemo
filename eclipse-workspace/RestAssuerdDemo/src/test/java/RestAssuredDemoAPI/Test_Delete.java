package RestAssuredDemoAPI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test_Delete {

	@Test
	public void test01_delete()
	{
		
		baseURI = "http://localhost:3000/";
		
		when().
				delete("/users/1").
		then().
				statusCode(200).
				log().all();
		
	}
	
}

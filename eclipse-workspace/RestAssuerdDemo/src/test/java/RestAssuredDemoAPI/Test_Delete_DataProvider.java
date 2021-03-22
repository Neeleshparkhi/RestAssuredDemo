package RestAssuredDemoAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Delete_DataProvider {
	
	@DataProvider(name = "DeleteData")
	public Object[] dataforDelete()
	{
		return new Object [] {
			 5,6,7,8
		};
	}
	
	@Test(dataProvider = "DeleteData")
	public void test01_delete(int userid)
	{
		
		baseURI = "http://localhost:3000/";
		
		when().
				delete("/users/"+userid).
		then().
				statusCode(200).
				log().all();
	}

}

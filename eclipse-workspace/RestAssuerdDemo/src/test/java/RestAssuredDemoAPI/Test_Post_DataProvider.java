package RestAssuredDemoAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Post_DataProvider {
	
	
	@DataProvider(name = "DataProvider")
	public Object[][] data_Provider()
	{
		
//		Object[][] data = new Object[2][3];
//		
//		data[0][0] = "Albert";
//		data[0][1] = "Einstine";
//		data[0][2] = 2;
//		
//		data[1][0] = "Williom";
//		data[1][1] = "Jacod";
//		data[1][2] = 1;
//		
//		return data;
		
		return new Object[][] {
			{"Graham" , "Beli" , 1},
			{"Henry" , "Ford" , 2}
		};
	}

	@Test(dataProvider = "DataProvider")
	public void test01_Post(String firstName, String  lastName, int subjectId) {
		
		JSONObject request = new JSONObject();
		
		baseURI = "http://localhost:3000/";
		
		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);
		
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

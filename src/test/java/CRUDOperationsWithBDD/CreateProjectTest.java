package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		JSONObject jObject= new JSONObject();
		jObject.put("createdBy", "Harish");
		jObject.put("projectName", "zoho1");
		jObject.put("status", "Created");
		jObject.put("teamSize", 10);
		
		given()   //preconditions
		   .contentType(ContentType.JSON)
		   .body(jObject)
		.when()   //Actions
		   .post("http://localhost:8084/addProject")
		   
		   
		.then()   //validations
		   
		   .assertThat().statusCode(201)
		   .log().all();
		   
	}
}

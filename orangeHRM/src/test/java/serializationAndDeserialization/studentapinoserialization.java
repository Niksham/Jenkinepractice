/*
 * package serializationAndDeserialization;
 * 
 * import org.testng.annotations.Test;
 * 
 * import io.restassured.http.ContentType;
 * 
 * import static io.restassured.RestAssured.*; import static
 * org.hamcrest.Matcher.*; import java.util.ArrayList; import java.util.HashMap;
 * 
 * public class studentapinoserialization {
 * 
 * public HashMap map = new HashMap();
 * 
 * // post request create new student record
 * 
 * @Test(priority = 1) public void createnewstudent() { map.put("id", 122);
 * map.put("firstname", "nikhil"); map.put("lastname", "sharma");
 * map.put("email", "hdfhj@gkhsdf.dfg"); map.put("programme", "sdet");
 * 
 * 
 * 
 * ArrayList<String> courselist = new ArrayList<String>();
 * courselist.add("java"); courselist.add("selenium");
 * 
 * map.put("course", courselist);
 * 
 * given().contentType(ContentType.JSON).body(map)
 * 
 * .when().post("http://localhost:8085/student")
 * 
 * .then().statusCode(201)
 * 
 * .body("msg", equals("student added")); } //get request to retrive student
 * details
 * 
 * @Test(priority = 1) void getstudentrecord() {
 * 
 * given().when().get("http://localhost:8085/student/101")
 * 
 * .then().statusCode(200).assertThat().body("id", equals(101));
 * 
 * } }
 */
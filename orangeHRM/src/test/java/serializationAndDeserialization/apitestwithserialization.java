package serializationAndDeserialization;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class apitestwithserialization {
	
	@Test(priority = 1)
	public void createnewstudentserialization() {
		
		ArrayList<String> courseslist = new ArrayList<String>();
		courseslist.add("java");
		courseslist.add("selenium");
		
		api API =new api();
		API.setSID(111);
		API.setfirstname("Nikhil");
		API.setlastname("XJFG");
		API.setemail("xyz");
		API.setprogramme("CSE");
		API.setcourses(courseslist);
				
	}

}

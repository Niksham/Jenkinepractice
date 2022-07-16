package serializationAndDeserialization;

import java.util.List;

public class api {

	public Integer id;
	public String firstname;
	public String lastname;
	public String email;
	public String programme;

	List<String> courses;

	public int getSID() {
		return id;
	}

	public void setSID(Integer id) {

		this.id = id;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return firstname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getprogramme() {
		return firstname;
	}

	public void setprogramme(String programme) {
		this.programme = programme;
	}

	public List<String> getcourses() {
		return courses;
	}

	public void setcourses(List<String> courses) {
		this.courses = courses;

	}
	
	public String getStudentRecord() {
		
		return(this.id+""+this.firstname+""+this.lastname+""+this.email+""+this.programme+""+this.courses);
	}
}

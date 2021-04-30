package kampOdev2;

public class Instructor extends User {
	
	private String courseName;
	
	public Instructor(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


}

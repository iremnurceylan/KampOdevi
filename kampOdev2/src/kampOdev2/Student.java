package kampOdev2;

public class Student extends User {
	
	 private String studentNumber;
	 private String courseDetails;
	 
	 public Student(String studentNumber, String courseDetails) {
		super();
		this.studentNumber = studentNumber;
		this.courseDetails = courseDetails;
	}
	 
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	
   
}

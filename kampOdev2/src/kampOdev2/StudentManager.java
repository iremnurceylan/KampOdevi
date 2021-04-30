package kampOdev2;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " +  student.getLastName() + " " + student.getCourseDetails()  + " kursuna eklendi");
	}
	
	public void uploadHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Yap�lan �dev sisteme basar�yla y�klendi");
	}

}

package kampOdev2;

public class InstructorManager extends UserManager {
	
	public void Login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getCourseName() + " Kurs sistemine giris yapildi");
	}
}

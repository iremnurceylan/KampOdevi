package kampOdev;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------KURSLAR-----------");
		Course course1 = new Course(1," JAVA ","Yazilim Gelistrici Kampi(JAVA + REACT) " , "-> ENGIN DEMIROG");
		Course course2 = new Course(2," C# ","Yazilim Gelistirici Kampi (C# + ANGULAR) ", "->  ENGIN DEMIROG");
		
		Course[] courses = {course1,course2};	
		for(Course course : courses) {
			System.out.println(course.id + course.courseName + course.courseDetails+course.instructorName);
		}
		System.out.println("--------- EGITMENLER---------------------");
		Instructor instructor1 = new Instructor(1," Engin Demirog");		
		Instructor instructor2 = new Instructor (2," Omer Ceylan");
		Instructor instructor3 = new Instructor (3," Irem Ceylan");
		
		Instructor[] instructors = {instructor1,instructor2,instructor3};
		for (Instructor instructor:instructors) {
			System.out.println(instructor.id+instructor.name);
		}
	 System.out.println();
	 CourseManager courseManager = new CourseManager();
	 InstructorManager instructorManager = new InstructorManager();
	 courseManager.delete(course2);
	 courseManager.add(course1);
	 instructorManager.delete(instructor3);
    
	}

}

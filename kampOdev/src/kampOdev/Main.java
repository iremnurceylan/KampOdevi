package kampOdev;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------KURSLAR-----------");
		Course course1 = new Course(1," JAVA ","Yaz�l�m Geli�trici Kamp�(JAVA+REACT) " , "-> ENG�N DEM�RO�");
		Course course2 = new Course(2," C# ","Yaz�l�m Geli�tirici Kamp� (C#+ANGULAR) ", "->  ENG�N DEM�RO�");
		
		Course[] courses = {course1,course2};	
		for(Course course : courses) {
			System.out.println(course.id + course.courseName + course.courseDetails+course.instructorName);
		}
		System.out.println("--------- E��TMENLER---------------------");
		Instructor instructor1 = new Instructor(1," Engin Demiro�");		
		Instructor instructor2 = new Instructor (2," �mer Ceylan");
		Instructor instructor3 = new Instructor (3," �rem Ceylan");
		
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

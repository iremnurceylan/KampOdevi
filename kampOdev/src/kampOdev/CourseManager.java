package kampOdev;

public class CourseManager {

 public void add(Course course) {
	 System.out.println(course.courseName + "E�itmeni:"+course.instructorName + ",�simli kurs sisteme EKLEND�.." );
 }
 
 public void delete(Course course) {
	 System.out.println(course.courseName + course.courseDetails + ",kursu sistemden S�L�ND�!!") ;
 }
}

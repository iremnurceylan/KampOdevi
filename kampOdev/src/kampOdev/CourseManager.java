package kampOdev;

public class CourseManager {

 public void add(Course course) {
	 System.out.println(course.courseName + "E�itmeni:"+course.instructorName + ",Isimli kurs sisteme EKLENDI.." );
 }
 
 public void delete(Course course) {
	 System.out.println(course.courseName + course.courseDetails + ",kursu sistemden SILINDI!!") ;
 }
}

package kampOdev;

public class CourseManager {

 public void add(Course course) {
	 System.out.println(course.courseName + "Eðitmeni:"+course.instructorName + ",Ýsimli kurs sisteme EKLENDÝ.." );
 }
 
 public void delete(Course course) {
	 System.out.println(course.courseName + course.courseDetails + ",kursu sistemden SÝLÝNDÝ!!") ;
 }
}

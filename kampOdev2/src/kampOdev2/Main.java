package kampOdev2;

public class Main {

	public static void main(String[] args) {
	  StudentManager studentManager = new StudentManager();
	  Student student1 = new Student("12345" , "Java");
	  student1.setId(1);
	  student1.setFirstName("Irem");
	  student1.setLastName("Ceylan");
	  student1.setStudentNumber("265");
	  student1.setEmail("irem@irem.com");
	  student1.setPassword("12345");
	  student1.setCourseDetails("Yazilim Gelistirici kampi Java + react");
	  studentManager.singIn(student1);
	  studentManager.add(student1);
	  studentManager.uploadHomework(student1);
	  
	  Student student2 = new Student("43565" , "Java");
	  student2.setId(2);
	  student2.setFirstName("Elif");
	  student2.setLastName("Atagul");
	  student2.setEmail("elif@elif.com");
	  student2.setPassword("6545");
	  student2.setCourseDetails("Yazilim Gelistirici kampi Java + react");
	  studentManager.singIn(student2);
	  studentManager.delete(student2);
	  
	  Student student3 = new Student("34565" , "C#");
	  student3.setId(3);
	  student3.setFirstName("Sevval");
	  student3.setLastName("Binici");
	  student3.setEmail("sevval@sevval.com");
	  student3.setPassword("234545");
	  student3.setCourseDetails("C# + Angular");
	  studentManager.singIn(student3);
	  studentManager.update(student3);
	  studentManager.add(student3);
	  
	  System.out.println("------------ EGITMENLER -----------------");
	  
	  InstructorManager instructorManager = new InstructorManager();
	  Instructor instructor1 = new Instructor("Java");
	  instructor1.setId(1);
	  instructor1.setFirstName("Engin ");
	  instructor1.setLastName("Demirog");
	  instructor1.setPassword("000000");
	  instructor1.setEmail("engin@engin.com");
	  instructor1.setCourseName("JAVA");
	  instructorManager.Login(instructor1);
	  
	  Instructor instructor2 = new Instructor("C#");
	  instructor2.setId(2);
	  instructor2.setFirstName("Omer");
	  instructor2.setLastName("Ceylan");
	  instructor2.setPassword("45660");
	  instructor2.setEmail("omer@omer.com");
	  instructor2.setCourseName("C#");
	  instructorManager.singIn(instructor2);
	  instructorManager.Login(instructor2);
	  instructorManager.update(instructor2);
	  
	  Instructor instructor3 = new Instructor("C++");
	  instructor3.setId(3);
	  instructor3.setFirstName("Ayse");
	  instructor3.setLastName("Gunduz");
	  instructor3.setPassword("ayse12344");
	  instructor3.setEmail("ayse@ayse.com");
	  instructorManager.delete(instructor3);
	  
	  
	  
	}

}

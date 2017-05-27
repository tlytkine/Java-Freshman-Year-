public class Test {
public static void main(String[]args) { 
// Test for student class
Student student1 = new Student();
student1.StudentName("Timothy","Lytkine");
student1.GWID("G37173537");
student1.ContactInfo("1900 F Street NW, Washington DC 20052","347-440-9142");
Student student2 = new Student();
student2.StudentName("George","Washington");
student2.GWID("G99999999");
student2.ContactInfo("1900 F Street NW, Washington DC 20052","999-999-9999");
Student student3 = new Student();
student3.StudentName("Thomas","Jefferson");
student3.GWID("G77777777");
student3.ContactInfo("1900 F Street NW, Washington DC 20052","777-777-7777");
Student student4 = new Student();
student4.StudentName("Barack","Obama");
student4.GWID("G33333333");
student4.ContactInfo("1900 F Street NW, Washington DC 20052","333-333-3333");

student1.printName();
student1.printContactInfo();
student2.printName();
student2.printContactInfo();

// Test for Course class
Course Calculus = new Course();
Course Biology = new Course();
Course Writing = new Course();
// Calculus
Calculus.setCourseInfo("MATH",1231);
Calculus.setCourseDescription("Single Variable Calculus I");
Calculus.addStudent(student1.FullName());
Calculus.addStudent(student2.FullName());
Calculus.addStudent(student3.FullName());
Calculus.addStudent(student4.FullName());
Calculus.deleteStudent(student4.FullName());
Calculus.printCourseDescription();
Calculus.printNames();
// Biology
Biology.setCourseInfo("BISC",1112);
Biology.setCourseDescription("Introductory Biology");
Biology.addStudent(student1.FullName());
Biology.addStudent(student2.FullName());
Biology.addStudent(student3.FullName());
Biology.addStudent(student4.FullName());
Biology.deleteStudent(student4.FullName());
Biology.printCourseDescription();
Biology.printNames();
// Writing
Writing.setCourseInfo("UW",1020);
Writing.setCourseDescription("University Writing");
Writing.addStudent(student1.FullName());
Writing.addStudent(student2.FullName());
Writing.addStudent(student3.FullName());
Writing.addStudent(student4.FullName());
Writing.deleteStudent(student4.FullName());
Writing.printCourseDescription();
Writing.printNames();


/*
● Define a method to delete an existing course based on the course number
● Update the Test class to create an university, add the previously 3 courses
created, and test the above methods functionality
*/
University GWU = new University();
GWU.createNewUniversity("The George Washington University","2121 I St NW, Washington, DC 20052","George Washington");
GWU.changeDeansName("George");
GWU.addCourse(Calculus.courseName(),Calculus.courseNumber());
GWU.addCourse(Biology.courseName(),Biology.courseNumber());
GWU.addCourse(Writing.courseName(),Writing.courseNumber());
GWU.deleteCourse(1020);
GWU.addCourse(Writing.courseName(),Writing.courseNumber());
GWU.coursesOffered();



}

}
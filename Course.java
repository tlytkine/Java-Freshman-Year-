public class Course {

private String[] Students = new String[20];
private int[] StudentGrades = new int[4];
private String CourseDescription;
private int courseNumber;
private String courseName;
public String FullName;


public void setCourseInfo(String name, int number) {
courseName = name;
courseNumber = number;
return;
}
public int courseNumber(){
return courseNumber;
}
public String courseName(){
return courseName;
}

public void setCourseDescription(String x) {
CourseDescription = x;
return;
}

public void printNames(){
System.out.println("Registered Students: ");
for(int i=0; i<Students.length; i++) {
if (Students[i]!=null) {
System.out.println((i+1) + ": " + Students[i]);
}
}
}

public void printCourseDescription(){
System.out.println(CourseDescription);
}
public String CourseDescription(){
return CourseDescription;
}
public void addStudent(String FullName){
for(int i=0; i<Students.length; i++) {
if (Students[i]==null){
Students[i] = FullName;
break;
}
}
}
public void deleteStudent(String x) {
for (int i=0; i<Students.length; i++) {
String y = null;
if (Students[i]!=null) {
y = Students[i];
if (y.contains(x)){
Students[i] = null;
}
}
}
}
public void addNewGrade (int grade) {
for(int i=0; i<StudentGrades.length; i++) {
if (StudentGrades[i]==0) {
StudentGrades[i]=grade;
break;
}
}
}

}

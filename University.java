public class University{
private String UniversityName;
private String UniversityAddress;
private String DeansName = " ";
private String[] Courses = new String[20];
private int [] CourseNum = new int[20];

public void createNewUniversity(String name, String address, String nameofdean){
UniversityName = name;
UniversityAddress = address;
DeansName = nameofdean;
return;
}


public void addCourse(String k, int coursenumber){
for(int i=0; i<Courses.length; i++) {
if (Courses[i]==null){
Courses[i] = k;
CourseNum[i]=coursenumber;
break;
}
}
}
public void changeDeansName(String x){
DeansName = x;
}
public void deleteCourse(int x){
for(int i=0; i<Courses.length; i++) {
if(x == CourseNum[i]){
Courses[i]=null;
CourseNum[i]=0;
}
}
}
public void coursesOffered() {
for(int i=0; i<Courses.length; i++) {
if (Courses[i]!=null) {
System.out.println(Courses[i] + " " + CourseNum[i]);
}
}
}





}



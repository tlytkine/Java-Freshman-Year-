// class constructor to intialize fields
public class Student {
   private String FirstName;
   private String LastName;
   private String GWID;
   private String FullName;
   private String Address;
   private String Phone;
   public void StudentName(String First, String Last){
   FirstName = First;
   LastName = Last;
   return;
   }
   public String FullName(){
   FullName = FirstName + " " + LastName;
   return FullName;
   }
   public void GWID(String id) {
   GWID = id;
   return;
   }
   public void ContactInfo(String x, String y){
   Address = x;
   Phone = y; 
   }
   public void printName() {
      System.out.println(FirstName + " " + LastName);
      return;
   }  
   public void printContactInfo(){
   System.out.println(Address);
   System.out.println(Phone);
   return;
   }
   
  }

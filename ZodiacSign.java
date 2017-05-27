import java.util.Scanner;

public class ZodiacSign{

   public static void main(String[] args){
   
   Scanner in = new Scanner(System.in );
   
   System.out.println("Please input the month you were born as a number.");
   int Month;
   Month = in.nextInt();
   
   
   System.out.println("Please input the day you were born as a number.");
   int Day;
   Day = in.nextInt();
   
   if (Month == 3 && Day >= 21 && Day <= 31) {
      System.out.println("Aries");
      }
   else if (Month == 4 && Day >= 1 && Day <= 19) {
      System.out.println("Aries");
      }
      
      
   else if (Month == 4 && Day >= 20 && Day <= 30) {
      System.out.println("Taurus");
      }
   else if (Month == 5 && Day >= 1 && Day <=20) {
      System.out.println("Taurus");
      }
      
      
   else if (Month == 5 && Day >= 21 && Day <= 31) {
      System.out.println("Gemini");
      }
   else if (Month == 6 && Day >= 1 && Day <= 20) {
      System.out.println("Gemini");
      }
      
      
   else if (Month == 6 && Day >= 21 && Day <= 30) {
      System.out.println("Cancer");
      }
   else if (Month == 7 && Day >= 01 && Day <= 22) {
      System.out.println("Cancer");
      }
      
      
   else if (Month == 7 && Day >= 23 && Day <= 31) {
      System.out.println("Leo");
      }
   else if (Month == 8 && Day >= 1 && Day <= 22) {
      System.out.println("Leo");
      }
      
      
   else if (Month == 8 && Day >= 23 && Day <= 31) {
      System.out.println("Virgo");
      }
   else if (Month == 9 && Day >= 1 && Day <= 22) {
      System.out.println("Virgo");
      }
      
      
   else if (Month == 9 && Day >= 23 && Day <= 30) {
      System.out.println("Libra");
      }
   else if (Month == 10 && Day >= 1 && Day <= 22) {
      System.out.println("Libra");
      }
      
      
   else if (Month == 10 && Day >= 23 && Day <= 31) {
      System.out.println("Scorpio");
      }
   else if (Month == 11 && Day >= 1 && Day <= 21) {
      System.out.println("Scorpio");
      }
      
      
   else if (Month == 11 && Day >= 22 && Day <= 30) {
      System.out.println("Sagittarius");
      }
   else if (Month == 12 && Day >= 1 && Day <= 21) {
      System.out.println("Sagittarius");
      }
      
      
   else if (Month == 12 && Day >= 22 && Day <= 31) {
      System.out.println("Capricorn");
      }
   else if (Month == 1 && Day >= 1 && Day <= 19) {
      System.out.println("Capricorn");
      }
      
      
   else if (Month == 1 && Day >= 20 && Day <= 31) {
      System.out.println("Aquarius");
      }
   else if (Month == 2 && Day >= 1 && Day <= 18) {
      System.out.println("Aquarius");
      }
      
      
   else if (Month == 2 && Day >= 19 && Day <= 29) {
      System.out.println("Pisces");
      }
   else if (Month == 3 && Day >= 1 && Day <= 20) {
      System.out.println("Pisces");
      }
   
   
}
   }
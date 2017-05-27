public class Break {
public static void main(String[] args) {
for (int i = 0; i < 20; i += 3) {
   if (i % 2 == 0) {
      continue;
      
      } else if (i == 16) {
         break;
         }
         System.out.println(i);
         }
         System.out.println("Done.");
}
}


import java.util.Scanner;
public class MinElement {
public static int minVal(int[] arrVals) {
int i = 0;
int min = arrVals[0];
for (i = 0; i < arrVals.length; ++i) {
if( (arrVals[i] <= min ) ) {
min = arrVals[i];
}
 }
return min;
 }

public static void main(String[] args) {
int[] A = {11, 22, 3, 44, 55};
int sizeA = A.length;
int i = 0;

int minA = minVal( A );
System.out.print("Array A: ");
for (i = 0; i < sizeA; ++i) {
System.out.print(" " + A[i]);
}
System.out.print(", min = " + minA + "\n\n" );

return; }
 }
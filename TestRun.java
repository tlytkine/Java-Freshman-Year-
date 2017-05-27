public class TestRun {
public static int[] ExE(int[] myArray){
int i = 0;
int temp = myArray[0];
for (i=0; i<myArray.length/2; i++) {
myArray[i] = myArray[myArray.length-1-i];
}
myArray[myArray.length-1] = temp;
return myArray;
}
public static void main(String[]args) {
int [] myArray = {1,2,3,4,5};

int [] newArray = ExE(myArray);
int x = 0;
for (x=0; x<newArray.length; x++) {
System.out.print(newArray[x] + " ");
}

}
}
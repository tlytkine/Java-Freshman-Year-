import java.util.Scanner; // to enable user input
public class ProjectOne { //Performs symbolic computations (addition, multiplication,subtraction and division) on a 2D integer array with length n that are 
// stored in a character array of length n-1 (+,*,-,/) and outputs the results in fraction form (numerator/denominator) simplified to its lowest terms


// Finds Greatest Common Divisor
public static int GCD(int x,int y) { 
int tempGCD = 0; 
int gcd = 0;
while (y!=0) { 
tempGCD = y;
y = x % y;
x = tempGCD;
}
gcd = x;
return gcd;
} 

// Finds the Least Common Multiple  
public static int LCM(int x,int y) {  
return (x*y)/(GCD(x,y));  //uses GCD method to help find LCM
}  
 
// Adds fractions 

// returns numerator
public static int AddFractionsN(int[][] Fractions, int i,int tNumerator, int tDenominator) {
int tempNumerator = (tNumerator*Fractions[1][i+1]) + (tDenominator*Fractions[0][i+1]);
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempNumerator;
}
// returns denominator
public static int AddFractionsD(int[][] Fractions, int i, int tNumerator, int tDenominator) {
int tempNumerator = (tNumerator*Fractions[1][i+1]) + (tDenominator*Fractions[0][i+1]);
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempDenominator;
}

// Subtracts fractions

// returns numerator 
public static int SubtractFractionsN(int[][] Fractions, int i,int tNumerator, int tDenominator) {
int tempNumerator = (tNumerator*Fractions[1][i+1]) - (tDenominator*Fractions[0][i+1]);
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempNumerator;
}
// returns denominator
public static int SubtractFractionsD(int[][] Fractions, int i,int tNumerator, int tDenominator) {
int tempNumerator = (tNumerator*Fractions[1][i+1]) - (tDenominator*Fractions[0][i+1]);
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempDenominator;
}

// Multiplies fractions
 
// returns numerator
public static int MultiplyFractionsN(int[][] Fractions, int i, int tNumerator, int tDenominator) {
int tempNumerator = tNumerator*Fractions[0][i+1];
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempNumerator;
}
// returns denominator
public static int MultiplyFractionsD(int[][] Fractions, int i, int tNumerator, int tDenominator) {
int tempNumerator = tNumerator*Fractions[0][i+1];
int tempDenominator = tDenominator*Fractions[1][i+1];
return tempDenominator;
}

// Divides fractions

// returns numerator
public static int DivideFractionsN(int[][] Fractions, int i, int tNumerator, int tDenominator) {
int tempNumerator = tNumerator*Fractions[1][i+1];
int tempDenominator = tDenominator*Fractions[0][i+1];
return tempNumerator;
}
// returns denominator
public static int DivideFractionsD(int[][] Fractions, int i, int tNumerator, int tDenominator) {
int tempNumerator = tNumerator*Fractions[1][i+1];
int tempDenominator = tDenominator*Fractions[0][i+1];
return tempDenominator;
}
// Prints final simplified result (Numerator / Denominator)
public static void printSimplified(int a, int b){
int x = GCD(a,b);
int NumeratorOutput = a / x;
int DenominatorOutput = b / x;
System.out.print("Output of Symbolic Computation: ");
System.out.println(NumeratorOutput + "/" + DenominatorOutput);
return;
}




public static void main(String[] args) {

Scanner scnr = new Scanner(System.in);
// intializes variables 
int NumeratorOutput = 0; //Output of numerator of fraction after symbolic operation
int DenominatorOutput = 0;//Output of denominator of fraction after symbolic operation
int n = 0; //number of columns in 2D array fractions
int i = 0; //variable i to iterate through array
int tempDenominator = 0;   
int tempNumerator = 0;
int tempDenominatorResult = 0;//Denominator that is the result of each operation 
int tempNumeratorResult = 0;//Numerator that is the result of each operation


// Allows user to input n fractions in the Fractions Array 
System.out.println("Please enter the amount of fractions you would like in the 2D array fractions."); 
n = scnr.nextInt();
if (n<2) {
while (n<2) {
System.out.println("There must be more than one fraction.");
System.out.println("Please enter the amount of fractions you would like in the 2D array fractions.");
n = scnr.nextInt();
}
}
int[][] Fractions = new int[2][n]; //2D array 'Fractions' with n columns and 2 rows 
System.out.println("Please enter the numerator and then the denominator of " + n + " fractions in the array.");
System.out.println("DENOMINATORS CAN NOT BE ZERO");
for (i=0; i<n; i++) {
System.out.print("Numerator " + (i+1) + ":");
Fractions[0][i] = scnr.nextInt();
System.out.print("Denominator " + (i+1) + ":");
Fractions[1][i] = scnr.nextInt();
}
char[] Operators = new char[n-1];
int OperatorsNum = n-1;
System.out.println("Please enter " + OperatorsNum + " mathematical operation signs.");
System.out.println("+ for Addition");
System.out.println("- for Subtraction");
System.out.println("* for Multiplication");
System.out.println("/ for  Division");
for (i=0; i<n-1; i++) {
System.out.print("Sign " + (i+1) + ":");
Operators[i] = scnr.next().charAt(0);
}
int tNumerator = Fractions[0][0]; //intializes first numerator value
int tDenominator = Fractions[1][0]; // initializes first denominator value

for (i=0; i<Operators.length; i++) { //iterates through Operators array and checks to see which symbolic operation to perform
// Addition
if (Operators[i] == '+') {
tempNumeratorResult = AddFractionsN(Fractions,i,tNumerator,tDenominator);
tempDenominatorResult = AddFractionsD(Fractions,i,tNumerator,tDenominator);
}
//Multiplication
if (Operators[i] == '*') { 
tempNumeratorResult = MultiplyFractionsN(Fractions, i, tNumerator,tDenominator); 
tempDenominatorResult = MultiplyFractionsD(Fractions, i, tNumerator,tDenominator); 
}
//Subtraction
if (Operators[i] == '-') { 
tempNumeratorResult = SubtractFractionsN(Fractions, i,tNumerator,tDenominator);
tempDenominatorResult = SubtractFractionsD(Fractions, i,tNumerator,tDenominator);
}
//Division 
if (Operators[i] == '/'){ 
tempNumeratorResult = DivideFractionsN(Fractions, i, tNumerator, tDenominator);
tempDenominatorResult = DivideFractionsD(Fractions, i, tNumerator, tDenominator);
}


int x = tempNumeratorResult;//variable to hold numerator result 
int y = tempDenominatorResult;//variable to hold denominator result
tNumerator = x; //sets tNumerator equal to numerator result of above operation for next computation
tDenominator = y;//sets tDenominator equal to denominator result of above operation for next computation
NumeratorOutput = tempNumeratorResult;  
DenominatorOutput = tempDenominatorResult;
}
//after for loop iterates through all possible operations outputs final denominator
// Makes sure that if there is a negative sign, it is in the numerator. If it is in the denominator, it will be moved to the numerator.
if (DenominatorOutput < 0) {
DenominatorOutput = DenominatorOutput * -1;
NumeratorOutput = NumeratorOutput * -1;
}
if (DenominatorOutput != 0) {
printSimplified(NumeratorOutput,DenominatorOutput);
}
else {
System.out.println("A zero was entered as a value in the denominator so the answer is undefined and will not be printed.");
}

}
   }
   
   






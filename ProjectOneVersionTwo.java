public class ProjectOneVersionTwo {
public static int GCD(int x,int y) {  // Method that finds the Greatest Common Divisor of integer inputs x and y 
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
public static int LCM(int x,int y) {  // Method that finds the Least Common Multiple of integer inputs x and y 

return (x*y)/(GCD(x,y));  
 }  


public static void main(String[] args) {

int NumeratorOutput = 0; //Output of numerator of fraction after symbolic operation
int DenominatorOutput = 0;//Output of denominator of fraction after symbolic operation
int n = 0; //number of columns in 2D array fractions
int i = 0; //variable i to iterate through array
int tempDenominator = 0;//common denominator / LCM of two denominators
int tempNumeratorOne = 0;//numerator 
int tempNumerator = 0;
int finDenominator = 0;
int tempDenominatorResult = 0;//Denominator that is the result of each operation
int tempNumeratorTwo = 0;//second fractions numerator that the operation is being performed on 
int tempNumeratorResult = 0;//Numerator that is the result of each operation
int temp = 0;//to divide or multiply to achieve equal fractions


int[][] Fractions = {{3,1,4,-5,3},{2,-2,3,6,4}}; //2D array 'Fractions' with n columns and 2 rows 
char[] Operators ={'+', '*', '-','/'}; //1D array 'Operators' with n-1 length


for (i=0; i<Operators.length; i++) { //iterates through Operators array and checks to see which symbolic operation to perform
int tNumerator = tempNumeratorResult;
int tDenominator = tempDenominatorResult;
//Addition 
if (Operators[i] == '+') { 

finDenominator = LCM(Fractions[1][i],Fractions[1][i+1]); //finds LCM of two denominators
// First Fraction
if (Fractions[1][i] != tempDenominator) { //If the denominator of the fraction does not equal to the LCM
temp = finDenominator / Fractions[1][i]; //sets a temporary variable to the LCM of the result divided by the fractions numerator
tempDenominator = Fractions[1][i]; //sets the fractions denominator equal to the LCM 
tempNumeratorOne = Fractions[0][i] * temp;//multiplies the temporary variable by the numerator of the fraction to make it equal to the original fraction
}
else {
tempNumeratorOne = Fractions[0][i];
}
//Second Fraction
if (Fractions[1][i+1] != tempDenominator) {//same process as above comments 
temp = finDenominator / (Fractions[1][i+1]);
tempDenominator = Fractions[1][i+1];
tempNumeratorTwo = Fractions[0][i+1] * temp;

}
else {
tempNumeratorTwo = Fractions[0][i+1];
}
tempNumeratorResult = tempNumeratorOne + tempNumeratorTwo;
if (tempDenominator > 0) {
tempDenominatorResult = tempDenominator;
}
else {
tempDenominatorResult = tempDenominator * -1;
}
}
if (Operators[i] == '*') { //multiplication
tempNumerator = tNumerator * Fractions[0][i+1];
tempDenominator = tDenominator * Fractions[1][i+1];

temp = GCD(tempNumerator,tempDenominator);
tempNumeratorResult = tempNumerator/temp;
tempDenominatorResult = tempDenominator/temp;

   




}

if (Operators[i] == '-') { //subtraction
finDenominator = LCM(tDenominator,Fractions[1][i]); //finds LCM of two denominators
// First Fraction
if (Fractions[1][i] != tempDenominator) { //If the denominator of the fraction does not equal the LCM
temp = tempDenominator / (Fractions[1][i]); //sets a temporary variable to the LCM of the result divided by the fractions numeraotr
finDenominator = Fractions[1][i]; //sets the fractions denominator equal to the LCM 
tempNumeratorOne = Fractions[0][i] * temp;//multiplies the temporary variable by the numerator of the fraction to make it equal to the original fraction
}
else {
tempNumeratorOne = Fractions[0][1];
}
//Second Fraction
if (Fractions[1][i+1] != tempDenominator) {//same process as above comments 
temp = tempDenominator / (Fractions[1][i+1]);
tempDenominator = Fractions[1][i+1];
Fractions[0][i+1] = Fractions[0][i+1] * temp;
tempNumeratorTwo = Fractions[0][i+1];
}
else {
tempNumeratorTwo = Fractions[0][i+1];
}
tempNumeratorResult = tempNumeratorOne - tempNumeratorTwo;
tempDenominatorResult = tempDenominator;
}
if (Operators[i] == '/'){ //division 
tempNumerator = tNumerator * Fractions[1][i+1];
tempDenominator = tDenominator * Fractions[0][i+1];
temp = GCD(tempNumerator,tempDenominator);
tempNumeratorResult = tempNumerator/temp;
tempDenominatorResult = tempDenominator/temp;

}
NumeratorOutput = tempNumeratorResult;  //after for loop iterates through all possible operations outputs final numerator
DenominatorOutput = tempDenominatorResult;
}
//after for loop iterates through all possible operations outputs final denominator
if (DenominatorOutput < 0) {
DenominatorOutput = DenominatorOutput * -1;
NumeratorOutput = NumeratorOutput * -1;
}
System.out.println(NumeratorOutput + "/" + DenominatorOutput);

}
   }
   






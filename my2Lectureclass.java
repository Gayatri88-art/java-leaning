public class my2Lectureclass{
  public static void main(String args[]){
    byte age = 81; // ✅ Correct, byte can store -128 to 127
    int year = 4; // ✅ Correct
    long value = 134553333333333L; // ✅ Correct, note the L at the end for long
    float pi = 3.14f; // ✅ Correct, note the f at the end for float
    short years = 2004; // ✅ Correct, short can store -32768 to 32767
    char name = 'A'; // ✅ Correct, single character in single quotes
    boolean isJavaCool = true; // ✅ Correct
    String village = "my village name is jalgaon"; // ✅ Correct, double quotes for String
    double number = 345644444444d; // ⚠ Partially: This literal is very big for precise representation in double. Java will accept it, but precision may be lost.


    System.out.println(isJavaCool);



    int num1,num2,num3,sum ,diff; //we can initialise multiple variable at a one time 
    num1=1;
    num2=2;
    num3=3;
    sum= num1 +num2;
    diff = num3-num2;
    
    System.out.println("sum of numbers:"+sum);
    System.out.println("diff of numbers:"+diff);


    String name1,name2,name3;
    name1="gayatri";
    name2="laxmi";
    name3="laxmikant";

    System.out.println(name2);

    //implicite casting {Smaller type → bigger type automatically}
    int mynum1 = 8;
    double mydouble = mynum1;
    System.out.println(mydouble);

    //explicite casting{Bigger type → smaller type manually}
     double mydoubless = 8.0;
     int mynum = (int)mydoubless;
     System.out.println(mynum);





 
 
 
 
 
     /*Problem Statement
Imagine you have a shape-shifting variable named shapeValue. This variable can transform into different forms based on your command. Implement a Java program that allows you to:

✅ Define an initial shapeValue as a double. ✅ Transform shapeValue into different types (int, long, and float). ✅ Display the transformed values dynamically. ✅ Understand how type casting affects numeric precision.*/
//Step-by-Step Implementation
// Step 1: Define the Initial shapeValue
//Start by initializing shapeValue as a double to store a decimal value.

// Define the initial shapeValue (double)
double shapeValue = 42.75;

//📝 Step 2: Display the Initial Shape
//Print the original value of shapeValue before any transformations occur.

// Display initial shape
System.out.println("Current Shape (double): " + shapeValue);


//📝 Step 3: Transform shapeValue into Different Types
//Use explicit type casting to convert shapeValue into int, long, and float values.

// Transform into different shapes
System.out.println("Transforming shapes...");

// Convert to int (decimal part is truncated)
int intShape = (int) shapeValue;
System.out.println("Transformed into int: " + intShape);

// Convert to long (similar truncation occurs)
long longShape = (long) shapeValue;
System.out.println("Transformed into long: " + longShape);

// Convert to float (preserves decimal precision but may introduce rounding errors)
float floatShape = (float) shapeValue;
System.out.println("Transformed into float: " + floatShape);



  }
}

public class mySecondLecture{
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


  }
}

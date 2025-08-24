import java.util.Scanner;
public class my3Lecture {
  
  public static void main(String[] args) {


  Scanner scanner = new Scanner(System.in);
  
  /*System.out.println("enter the name:"); //user input for string
  String name =scanner.nextLine(); ==>for string
  System.out.println("welcome to club:-"+ name);*/

  System.out.println("enter your age:-"); //user input for number
  int age =scanner.nextInt(); //==>>for number
  System.out.println("your age is-"+age);
  scanner.close();



  
  int a = 10, b = 3;

            // Arithmetic Operators
            System.out.println("a + b = " + (a + b)); // Addition
            System.out.println("a - b = " + (a - b)); // Subtraction
            System.out.println("a * b = " + (a * b)); // Multiplication
            System.out.println("a / b = " + (a / b)); // Division (integer division)
            System.out.println("a % b = " + (a % b)); // Modulus

            // Unary Operators
            System.out.println("Unary plus of a: " + (+a));
            System.out.println("Unary minus of a: " + (-a));
            System.out.println("Post-increment a++: " + (a++)); // prints a then increments
            System.out.println("After post-increment, a = " + a);
            System.out.println("Pre-increment ++a: " + (++a)); // increments then prints
            System.out.println("Post-decrement a--: " + (a--)); // prints a then decrements
            System.out.println("After post-decrement, a = " + a);
            System.out.println("Pre-decrement --a: " + (--a)); // decrements then prints

            // Relational Operators
            System.out.println("a == b? " + (a == b));
            System.out.println("a != b? " + (a != b));
            System.out.println("a > b? " + (a > b));
            System.out.println("a < b? " + (a < b));
            System.out.println("a >= b? " + (a >= b));
            System.out.println("a <= b? " + (a <= b));

            // Logical Operators
            boolean x = true, y = false;
            System.out.println("(x && y) = " + (x && y));
            System.out.println("(x || y) = " + (x || y));
            System.out.println("!x = " + (!x));

            
            // Assignment Operators
            a = 10;
            System.out.println("Initial a = " + a);
            a += 5; // a = a + 5
            System.out.println("a += 5 => " + a);
            a -= 3; // a = a - 3
            System.out.println("a -= 3 => " + a);
            a *= 2; // a = a * 2
            System.out.println("a *= 2 => " + a);
            a /= 4; // a = a / 4
            System.out.println("a /= 4 => " + a);
            a %= 3; // a = a % 3
            System.out.println("a %= 3 => " + a);
        

        

  }
  
}

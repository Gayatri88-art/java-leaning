import java.util.Scanner;
public class my4Lecture {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
//##string creation 
    String goodmorning = "good morning guyzzzzzzzz";
    System.out.println(goodmorning);

    String goodnight = new String("goodnight gyuss");//string is immutable we can ovverride it.
    goodnight = "bad night";


//##contatination
    int age = 21;
    String firstname = "gayatri";
    String secoundname = "varade";
    String fullname = firstname + " "+ secoundname;
    System.out.println( "my name is " + fullname +" "+ "and i am "+age +"yr old");

//##string length
    String Quote = "to be or not to be";
    int length = Quote.length();//it will count space also
    System.out.println(length);
    char firstchar = Quote.charAt(0);
    char tenthchar = Quote.charAt(9);
    System.out.println(firstchar);
    System.out.println(tenthchar);

//###comparing string using ==,equals,equalsIgnoreCase
        // == checks if two references point to the same object.
        //equals() compares the contents of the strings (case-sensitive).
        //equalsIgnoreCase() compares the contents ignoring case differences.
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        // Using ==
        System.out.println("Using == :");
        System.out.println("str1 == str2 : " + (str1 == str2)); // true, same literal pool reference
        System.out.println("str1 == str3 : " + (str1 == str3)); // false, different objects

        // Using equals()
        System.out.println("\nUsing equals() :");
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true, contents are same
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true, contents are same
        System.out.println("str1.equals(str4) : " + str1.equals(str4)); // false, case-sensitive

        // Using equalsIgnoreCase()
        System.out.println("\nUsing equalsIgnoreCase() :");
        System.out.println("str1.equalsIgnoreCase(str4) : " + str1.equalsIgnoreCase(str4)); // true, ignores case


//##comparing loxicographic using compairTo
        String a = "Apple";
        String b = "Banana";
        String c = "apple";

        // Case-sensitive comparison
        System.out.println("a.compareTo(b): " + a.compareTo(b));       // Negative (Apple < Banana)
        System.out.println("a.compareTo(c): " + a.compareTo(c));       // Negative (uppercase < lowercase)
        System.out.println("b.compareTo(a): " + b.compareTo(a));       // Positive (Banana > Apple)

        // Case-insensitive comparison
        System.out.println("a.compareToIgnoreCase(c): " + a.compareToIgnoreCase(c)); // 0 (equal ignoring case)


//##cutting string using substring()
        String text = "Hello, World!";

        // From index 7 to end
        String part1 = text.substring(7);
        System.out.println("Substring from index 7: " + part1);  // "World!"

        // From index 0 to 5 (not including 5)
        String part2 = text.substring(0, 5);
        System.out.println("Substring from 0 to 5: " + part2);   // "Hello"

        // From index 7 to 12
        String part3 = text.substring(7, 12);
        System.out.println("Substring from 7 to 12: " + part3);  // "World" 
        
        
//##string replace,touppercase(),tolowercase()      

      String original = "Hello World";

        // Convert to uppercase
        String upper = original.toUpperCase();
        System.out.println("Uppercase: " + upper);  // HELLO WORLD

        // Convert to lowercase
        String lower = original.toLowerCase();
        System.out.println("Lowercase: " + lower);  // hello world

        // Replace 'o' with 'x'
        String replacedChar = original.replace('o', 'x');
        System.out.println("Replaced 'o' with 'x': " + replacedChar);  // Hellx Wxrld

        // Replace "World" with "Java"
        String replacedWord = original.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedWord);  // Hello Java




//$##string formating
        String name = "Alice";
        int agee = 23;
        double marks = 87.456;
        char grade = 'A';
        double percentage = 87.456;

        System.out.printf("Your score: %.2f%%%n", percentage);


        //String formattedString = String.format("Student: %s, Age: %d, Grade: %c, Marks: %.2f%%", name, age, grade, marks);
        //System.out.println("Using String.format():");
        //System.out.println(formattedString);
                                      //or

        System.out.println("Using System.out.printf():");
        System.out.printf("Student: %s, Age: %d, Grade: %c, Marks: %.2f%%%n", name, agee, grade, marks);



//operator precedence
           
     int d = 5, e = 10, f = 3;

        // Postfix (++ / --) - highest precedence
        int postfixResult = d++; // d = 5, then becomes 6
        System.out.println("Postfix: " + postfixResult); // 5

        // Unary (++ / -- / + / - / !) - right to left
        int unaryResult = -++d + +--e;  // d = 7, e = 9 → -7 + 9 = 2
        System.out.println("Unary: " + unaryResult);

        // Multiplicative (* / %) - left to right
        int multiplicativeResult = e * f % 4; // 9 * 3 = 27 → 27 % 4 = 3
        System.out.println("Multiplicative: " + multiplicativeResult);

        // Additive (+ -) - left to right
        int additiveResult = d + e - f; // 7 + 9 - 3 = 13
        System.out.println("Additive: " + additiveResult);

        // Relational (< > <= >= instanceof) - left to right
        boolean relationalCheck = d + e > f * 2; // 7 + 9 > 6 → 16 > 6 = true
        System.out.println("Relational: " + relationalCheck);

        // Equality (== !=) - left to right
        boolean equalityCheck = (d == e); // 7 == 9 → false
        System.out.println("Equality: " + equalityCheck);

        // Logical AND (&&) - left to right
        boolean logicalAnd = (d < e && e < 20); // true && true = true
        System.out.println("Logical AND: " + logicalAnd);

        // Logical OR (||) - left to right
        boolean logicalOr = (d > e || e > 5); // false || true = true
        System.out.println("Logical OR: " + logicalOr);

        // Ternary (? :) - right to left
        String gradee = (d + e > 15) ? "Pass" : "Fail"; // 7 + 9 > 15 → true → "Pass"
        System.out.println("Ternary: " + gradee);

        // Assignment (= += -= *= /= %= etc.) - right to left
        int g = 10;
        g += 5; // 15
        g *= 2; // 30
        g %= 7; // 2
        System.out.println("Assignment chain result: " + g);  
        
        


/*//##Exercise Instructions
1️⃣ Declare variables for principal amount, interest rate, and time period using double.
2️⃣ Use Scanner to read input from the user.
3️⃣ Perform the simple interest calculation using the formula.
4️⃣ Display the result in a user-friendly format.
5️⃣ Close the Scanner object after input handling.
📝 Starter Code: Try It Yourself!
Use the following template and complete the missing parts:*/


        // Step 1: Create a Scanner object
        

        // Step 2: Prompt user for inputs
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        // Step 3: Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Step 4: Display the result
        System.out.println("Simple Interest: $" + interest);
        
        // Step 5: Close the Scanner object
        scanner.close();
    }
}

        
    



    
  
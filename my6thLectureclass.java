import java.util.Scanner;

public class my6thLectureclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

     //if else-conditional statement
        if (age > 18) {
            System.out.println("You can vote");
        } else if (age < 18) {
            System.out.println("You can't vote");
        } else {
            System.out.println("You just turned 18. You can vote!");
        }


     //nested if
     System.out.print("Enter your age: ");
        int agee = scanner.nextInt();

        System.out.print("Enter your citizenship (yes/no): ");
        String citizenship = scanner.next();

        if (agee >= 18) {
            if (citizenship.equalsIgnoreCase("yes")) { //Ignore the anotherString: part — it’s only a visual helper, not real code.
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote due to citizenship.");
            }
        } else {
            System.out.println("You are not eligible to vote due to age.");
        }

    //nested else
    int score = 75;

    if (score >= 90) {
        System.out.println("Grade: A");
    } else {
        // Nested else
        if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }
    }
     
    // else if 

    System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


//ternary operators
     System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Using ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);



        /* Objective
In this exercise, you will build a Simple Chatbot in Java that interacts with users by recognizing basic greetings, well-being inquiries, weather-related questions, and farewells. If the chatbot does not recognize the input, it will respond with a default message.
By completing this exercise, you will practice:
✅ Reading user input using Scanner
✅ Using conditional statements (if-else) to process input
✅ Applying string operations to handle user queries effectively
✅ Developing a simple interactive program
This chatbot will introduce you to basic decision-making logic in Java!

Problem Statement
Create a Java chatbot program that: 1️⃣ Prompts the user for input 2️⃣ Recognizes the following inputs and responds accordingly:
Greetings (hello, hi → "Hello! How can I help you today?")
Well-being inquiries (how are you, how’s it going → "I'm just a bot, but I'm here to help you!")
Weather questions (what’s the weather like, weather → "I don’t have real-time weather data, but it's always sunny in the digital world!")
Farewells (bye, goodbye → "Goodbye! Have a great day!") 3️⃣ Responds with a default message if the input is unrecognized.

 */

 System.out.println("Please enter something: ");
 String userInput = scanner.nextLine();
 
 if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
     System.out.println("Chatbot: Hello! How can I help you today?");
 } else if (userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how's it going")) {
     System.out.println("Chatbot: I'm just a bot, but I'm here to help you!");
 } else if (userInput.equalsIgnoreCase("what's the weather like") || userInput.equalsIgnoreCase("weather")) {
     System.out.println("Chatbot: I don’t have real-time weather data, but it's always sunny in the digital world!");
 } else if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
     System.out.println("Chatbot: Goodbye! Have a great day!");
 } else {
     System.out.println("Chatbot: I'm sorry, I don't understand that.");
 }

        scanner.close();
    }
}

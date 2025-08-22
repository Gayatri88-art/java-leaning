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

  }
  
}

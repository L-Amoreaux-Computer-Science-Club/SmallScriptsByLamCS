// This is a finished project written by Arianne Rull
// Under the code review of Alexa Liaskovski
// For the purpose of teaching L'Amoreaux Computer Science Club about the syntax of Java

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      // Getting user's name
      System.out.print("Enter your name: ");
      String myString = input.next();
      System.out.print("Hello world, " + myString);

      // Getting user's option choice
      System.out.print("\n What would you like to do? (add/subtract/divide/multiply) \n Press 1 for addition \n Press 2 for subtraction \n Press 3 for division \n Press 4 for multiplication \n");
      int myChoice = input.nextInt();
      System.out.print("You chose " + myChoice + "\n");

      // Getting the two numbers for calculation
      System.out.println("Enter the two integers to calculate: ");
      Scanner in = new Scanner(System.in);
      int a, b, c;
      a = in.nextInt();
      b = in.nextInt();

      // Calculating
      if (myChoice == 1){ // it's better to use == in this case since you know exactly what to expect from the user. what you had before worked, but if another engineer was reading your code, this would make it easier to understand what the purpose of this code is.
        c = a + b;
        System.out.println("Sum of the integers = " + c);
      } else if (myChoice == 2){
        c = a - b;
        System.out.println("Difference of the integers = " + c);
      } else if (myChoice == 3){
        c = a/b;
        System.out.println("Quotient of the integers = " + c);
      } else if (myChoice == 4){
        c = a*b;
        System.out.println("Product of the integers = " + c);
      } else { // its also good to include edge cases, such as if the user provides invalid input.
        System.out.println("You made an invalid choice!");
      }
    }
}

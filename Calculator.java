// This is an ongoing project written by Arianne Rull
// For the purpose of teaching L'Amoreaux Computer Science Club about the syntax of Java

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
      // Getting user's name
      System.out.print("Enter your name: ");
      String myString = input.next();
      System.out.print("Hello world, " + myString);

      System.out.print("\n What would you like to do? (add/subtract/divide/multiply) \n Press 1 for addition \n Press 2 for subtraction \n Press 3 for division \n Press 4 for multiplication");
      int myChoice = input.nextInt();
      System.out.print("You chose" + myChoice);

      if (myChoice < 2){
        System.out.println(myString + "chose to add numbers");
      }

    }
}

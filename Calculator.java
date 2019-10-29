// This is a finished project written by Arianne Rull
// Under the code review of Alexa L.
// For the purpose of teaching L'Amoreaux Computer Science Club about the syntax of Java

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
    	
    Scanner input = new Scanner(System.in);
    	
      // Getting user's name
      System.out.print("Enter your name: ");
      String myString = input.next();
      System.out.print("Hello world, " + myString);

      System.out.print("\n What would you like to do? (add/subtract/divide/multiply) \n Press 1 for addition \n Press 2 for subtraction \n Press 3 for division \n Press 4 for multiplication \n");
      int myChoice = input.nextInt();
      System.out.print("You chose" + myChoice + "\n");

      // Addition
      if (myChoice < 2){
        int a, b, c;

        System.out.println("Enter the two integers to calculate their sum: ");
        Scanner in = new Scanner(System.in);
     
        a = in.nextInt();
        b = in.nextInt();
        c = a + b;
     
        System.out.println("Sum of the integers = " + c);

      } else if (myChoice < 3){
        System.out.println(myString + "chose to subtract numbers");

        int d, e, f;

        System.out.println("Enter the two integers to calculate their sum: ");
        Scanner in = new Scanner(System.in);
     
        d = in.nextInt();
        e = in.nextInt();
        f = d + e;
     
        System.out.println("Difference of the integers = " + f);
      } else if (myChoice < 4){
        System.out.println(myString + "chose to divide numbers");

        int g, h, i;

        System.out.println("Enter the two integers to calculate their sum: ");
        Scanner in = new Scanner(System.in);
     
        g = in.nextInt();
        h = in.nextInt();
        i = g/h;
     
        System.out.println("Quotient of the integers = " + i);
      } else if (myChoice < 5){
        System.out.println(myString + "chose to multiply numbers");

        int j, k, l;

        System.out.println("Enter the two integers to calculate their sum: ");
        Scanner in = new Scanner(System.in);
     
        j = in.nextInt();
        k = in.nextInt();
        l = j/k;
     
        System.out.println("Product of the integers = " + l);
      }
    }
}

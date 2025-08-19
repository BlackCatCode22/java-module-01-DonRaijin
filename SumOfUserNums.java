// SumOfUserNums.java
// db 8/19/25

// References;
// This is what I used to learn user input
// https://www.w3schools.com/java/java_user_input.asp


// I need to import the Scanner class from the
// java.util package - this is how I do that.
import java.util.Scanner;
import java.util.stream.StreamSupport;


public class SumOfUserNums {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Sum of user program...\n");
        // Get 3 ints from the user and output the ints .


        // Create the variables needed
        int num1 = 22;
        System.out.println("\n The value of num1 is " + num1 + "\n");


        int num2 = 0;
        int num3 = 0;
        int sumOfTheInts = 0;


        // get user input
        // Create a Scanner object named scanner
        Scanner scanner = new Scanner(System.in);
        // Get the first int.
        System.out.println("\n Enter an integer for num1: ");
        num1 = scanner.nextInt();
        // Get the second int.
        num2 = scanner.nextInt();
        // Get the third int.
        num3 = scanner.nextInt();

        // Test it
        System.out.println("\n num1 is: " + num1);
        System.out.println("\n num2 is: " + num2);
        System.out.println("\n num3 is: " + num3);

        // add them up!
        sumOfTheInts = num1 + num2 + num3;

        // Test it!

        System.out.println("\n The sum of the ints is: " + sumOfTheInts);

        System.out.println("\n This is the end of my program.");

    }
}
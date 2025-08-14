// FunWithVariables.java
// dB 8/14/2025
//
 //References:
//https://www.w3schools.com/java/java_user_input.asp

// import statements are at the top of the program

// Import the Scanner class
import java.util.Scanner;

public class FunWithVariables {
    public static void main(String[] args) {
        System.out.println("\n\n *** Welcome to my fun with Variables Programs! \n\n");
        // Create a String variable named anything.
        String anything = " something else ";
        System.out.println(anything);


        // Create a Scanner object named scanner.
        Scanner scans = new Scanner(System.in);
        String gamerTag;

        // Enter username and press Enter
        System.out.println("\n Enter gameTag: ");
        gamerTag = scans.nextLine();

        // Prove that you got am imt from the user.
        System.out.println("Gamertag is: " + gamerTag);
        }
    }

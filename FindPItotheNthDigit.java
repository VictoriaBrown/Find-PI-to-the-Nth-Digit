/*
FindPItotheNthDigit.java
Programmer:     Victoria Brown
Date:           July 2016

Purpose of class:
Enter a number and have the program generate PI up to that many decimal places.
Keep a limit to how far the program will go
*/

// Import statement:
import java.util.Scanner;     // Scanner to accept user input


public class FindPItotheNthDigit {
  
  public static void main(String[] args) {

    // Scanner object to obtain number from user.
    Scanner input = new Scanner(System.in);

    int num;    // Variable to save number in.
    double pi = Math.PI;

    // Prompt user for input:
    System.out.print("Please enter a number for which to cut PI off at: ");
    num = input.nextInt();

    // Return PI rounded to nth decimal.
    System.out.println( );
    System.out.println("PI rounded to the " + num + " decimal: ");
    System.out.printf("%." + num + "f", pi);
  }
}
/*
 * Using Basic Java Concepts Assignment
 * Assignment 1, Program 4: An applicatio that ask the user to enter 2 integers,
 * obtains them from the user and prints their sum, product, and quotient.
 *
 * <Citations if necessary> -- citations are required
 * for any references you used (outside of your book, 
 * the website associated with your book, or references
 * provided in class/Canvas).
 *
 * Liberty University 
 * CSIS 212: Object-Oriented Programming (B02)
 * 
 * author: Joshua Reese
 */
package Program4;
import java.util.Scanner;

public class program4 {
    /**
    * @param args the command line arguments
    */    
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 1\n");
        
	try (Scanner input = new Scanner(System.in)) {
		int num1;
		int num2;
		int sum;
		int product;
		int difference;
		int quotient;
			
		System.out.print("Enter first integer: ");
		num1 = input.nextInt();	// read first number from user
			
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();	// read second number from user
			
		sum	= num1 + num2;      // add numbers
		product	= num1 * num2;      // multiply numbers
		difference = num1 - num2;   // difference of numbers
		quotient = num1 / num2;     // division of numbers
			
		System.out.printf("Sum is %d\n", +sum);                 // display sum
		System.out.printf("Product is %d\n", +product);         // display product
		System.out.printf("Difference is %d\n", +difference);   // display difference
		System.out.printf("Quotient is %d\n", +quotient);	// display quotient
	}
    }   
}

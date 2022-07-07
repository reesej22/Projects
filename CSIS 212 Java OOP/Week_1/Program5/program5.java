/*
 * Using Basic Java Concepts Assignment
 * Assignment 1, Program 5: An application that reads 2 integers, determines 
 * whether the first is a multiple of the second and prints the result. 
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
package Program5;
import java.util.Scanner;

public class program5 {
    /**
    * @param args the command line arguments
    */    
    public static void main(String[] args) {
        
        System.out.println("Joshua Reese - Assignment 1\n");
        
        try (Scanner input = new Scanner(System.in)) {
			int firstNum;
			int secondNum;
			
			// accept inputs from users
			System.out.print("Enter first number: ");
			firstNum = input.nextInt();
			
			System.out.print("Enter second number: ");
			secondNum = input.nextInt();
			
			// determine whether firstNumber is a multiple of secondNumber
			if (firstNum % secondNum == 0) {
			    System.out.printf("%d is a multiple of %d\n", firstNum, secondNum);
			}
			if ( firstNum % secondNum !=0 ) {
			    System.out.printf("%d is not a multiple of %d\n", firstNum, secondNum);
			}
		}
    }
}

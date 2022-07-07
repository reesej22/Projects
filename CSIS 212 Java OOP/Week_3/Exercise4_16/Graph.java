/*
 * Using Basic Java Concepts Assignment
 * Assignment 3, Exercise 4.16: Write an application that reads 5 numbers
 * between 1 and 30. For each number that is read, the program will display
 * the same number of adjacent asterisks.
 *
 * <Citations if necessary> -- citations are required
 * for any references you used (outside of your book, 
 * the website associated with your book, or references
 * provided in class/Canvas).
 *
 * Liberty University 
 * CSIS 212: Object-Oriented Programming (B02)
 */
package Exercise4_16;
import java.util.Scanner;
/**
 *
 * @author Joshua Reese
 */
public class Graph {
    
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 3\n");
    try (// TODO code application logic here
		Scanner input = new Scanner(System.in)) {
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int n4 = 0;
			int n5 = 0;
			int i = 1;

			System.out.print("Enter a number between 1 and 30: ");
			n1 = input.nextInt();

			System.out.print("Enter a number between 1 and 30: ");
			n2 = input.nextInt();

			System.out.print("Enter a number between 1 and 30: ");
			n3 = input.nextInt();

			System.out.print("Enter a number between 1 and 30: ");
			n4 = input.nextInt();

			System.out.print("Enter a number between 1 and 30: ");
			n5 = input.nextInt();

			for(i = 1; i <= n1; i++) {
			    System.out.print("*");
			}
			System.out.println();

			for(i = 1; i <= n2; i++) {
			    System.out.print("*");
			}
			System.out.println();

			for(i = 1; i <= n3; i++) {
			    System.out.print("*");
			}
			System.out.println();

			for(i = 1; i <= n4; i++) {
			    System.out.print("*");
			}
			System.out.println();

			for(i = 1; i <= n5; i++) {
			    System.out.print("*");
			}
			System.out.println(); 

			input.close();
		}
    }
}
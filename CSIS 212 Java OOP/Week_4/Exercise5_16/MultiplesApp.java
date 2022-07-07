/*
 * Using Basic Java Concepts Assignment
 * Assignment 4, Exercise 5.16: Write a method isMultiple that determines, for
 * a pair of integers, whether the second integer is a multiple of the first.
 *
 * <Citations if necessary> -- citations are required
 * for any references you used (outside of your book, 
 * the website associated with your book, or references
 * provided in class/Canvas).
 *
 * Liberty University 
 * CSIS 212: Object-Oriented Programming (B02)
 * 
 */
package Exercise5_16;

import java.util.Scanner;
/**
 *
 * @author Joshua Reese
 */
public class MultiplesApp {
    
      public static Boolean isMultiple(int n1,int n2) {
    Boolean result;
    int quotient = n2%n1;
    result = quotient == 0;
      return result;
  }// end method isMultiple
    
  public static void main(String [] args) {
    System.out.println("Joshua Reese - Assignment 4\n"); 
    try (//create Scanner for input
	Scanner input = new Scanner (System.in)) {
		System.out.print("Enter two integer values separated by spaces: ");
		  int n1= input.nextInt();
		  int n2= input.nextInt();
		  input.close();
		 
		//determine whether the second number is a multiple of the first
		 
		Boolean result = isMultiple(n1,n2);     
		
		System.out.printf("%S ", result);
	}
     
    //prompt for and input two integer numbers

  }// end of main

}//end class
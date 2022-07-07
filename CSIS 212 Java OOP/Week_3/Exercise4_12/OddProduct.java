/*
 * Using Basic Java Concepts Assignment
 * Assignment 3, Exercise 4.12: Write an application that calculates the
 * product of the odd integers from 1 to 15.
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
package Exercise4_12;
/**
 *
 * @author Joshua Reese
 */
public class OddProduct {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 3\n");
        // TODO code application logic here
        int product = 1;
        for (int i = 1; i <= 15; i++)
            if (i % 2 == 1) {
               product *= i; 
            } 
        System.out.println("Product of the odd integers from 1 to 15 is: " + product);
    }
    
}

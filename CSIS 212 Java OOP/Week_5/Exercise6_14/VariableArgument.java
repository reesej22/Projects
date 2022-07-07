/*
 * Using Basic Java Concepts Assignment
 * Assignment 5, Exercise 6.14: Write an application that calculates the
 * product of a series of integers that are passed to method product using a
 * variable-length argument list. Test your method with several calls, each 
 * with a different number of arguments.
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
package Exercise6_14;

/**
 *
 * @author Joshua Reese
 */
public class VariableArgument {
    
    public static int product(int... numbers) {
        int total = 1;
        
        if (numbers.length == 0) {
            return 0;
        }
        
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 5\n");
        System.out.println(product());
        System.out.println(product(2, 50));
        System.out.println(product(25, 80));
        System.out.println(product(100, 6, 100));
        System.out.println(product(10, 10, 8, 1000)); 
    }
    
}

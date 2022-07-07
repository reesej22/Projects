/*
 * Using Basic Java Concepts Assignment
 * Assignment 4, Exercise 5.20: Write an application that prompts the user for
 * the radius of a circle and uses a method called circleArea to calculate the 
 * area of the circle
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
package Exercise5_20;

import java.util.Scanner;

/**
 *
 * @author Joshua Reese
 */
public class CircleAreaApp {
    
        public static double circleArea(double x) {
        double y;
        
        y = (Math.PI * (2 * x));
        return y;
    }
    
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 4\n");
        
        double a;
        double b;
        
        System.out.print("Enter the radious of the circle: ");
        try (Scanner scan = new Scanner(System.in)) {
			a = scan.nextDouble();
			scan.close();
		}
        b = circleArea(a);
        
        System.out.printf("The area of the circle is: %.2f%n", b);   
    }
}

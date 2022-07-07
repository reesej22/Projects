/*
 * Using Basic Java Concepts Assignment
 * Assignment 6, Exercise 7.13: Create a class called Date that includes 3
 * instance variables, a month, day, and year. Provide a constructor that 
 * initializes the 3 instance variables and assumes the values are correct.
 * Provide a set and get method for each instance variable. Provide a method
 * displayDate that displays the month, day and year separated by (/).
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
package Exercise7_13;
/**
 *
 * @author Joshua Reese
 */
public class DateTest {

    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 6\n");
        Date today = new Date();
        
        today.setMonth(06);
        today.setDay(20);
        today.setYear(2022);
        
        today.displayDate();
    }
    
}

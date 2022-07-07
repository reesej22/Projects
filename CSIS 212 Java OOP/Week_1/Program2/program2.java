/*
 * Using Basic Java Concepts Assignment
 * Assignment 1, Program 2: A program which includes an Input Box (Dialog Boxes 
 * and the JoptionPane) that requests the user's name and displays the 
 * Scripture of the Day.
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
package Program2;
import javax.swing.JOptionPane;

public class program2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Joshua Reese - Assignment 1\n");
        
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
    
        JOptionPane.showMessageDialog(null, "Welcome, " + name + ", To The Liberty University Website!\nThe Scripture for the day is: Matthew 6:11");
    }
}

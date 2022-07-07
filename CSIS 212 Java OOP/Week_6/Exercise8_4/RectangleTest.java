/*
 * Using Basic Java Concepts Assignment
 * Assignment 6, Exercise 8.4: Create a class Rectangle with attributes length
 * and width, each of which defaults to 1. Provide methods that calculates the
 * rectangle's perimeter and area.
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
package Exercise8_4;

import java.util.Scanner;
/**
 *
 * @author Joshua Reese
 */
public class RectangleTest{
	
    public static Scanner input = new Scanner(System.in);
	
    public static void main(String args[]){
        System.out.println("Joshua Reese - Assignment 6");

        Rectangle rec = new Rectangle();
        int choice = getMenu();
        
        while(choice != 3){
            try{
                switch(choice){
                    case 1 -> {
                        System.out.print("\nEnter length: ");
                        rec.setLength(input.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("\nEnter width: ");
                        rec.setWidth(input.nextDouble());
                    }
                    default -> {
                        System.out.print("\nEnter a valid menu option.\n");
                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(rec.toPrinter());
            choice = getMenu();
        }input.close();
    }
    private static int getMenu(){
        System.out.print("\n1. Set Length\n2. Set Width\n3. Exit\nChoice:");
        return input.nextInt();
    }
}
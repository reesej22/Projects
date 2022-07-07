/*
 * Using Basic Java Concepts Assignment
 * Assignment 8, Part 1: Write an application containing three parallel arrays
 * that hold 10 elements each. Use dialog boxes to accept a student ID number
 * and display the student's first name and grade point average.
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
package part2;

import java.awt.HeadlessException;
import java.util.Scanner;

/**
 *
 * @author Joshua Reese
 */

public class HoursApp {

	public static void main(String[] args) {
		System.out.println("Joshua Reese Assignment 8\n");

		System.out.println("Please enter the number that corresponds \nto the weekday you would like to display.\n");

		try (Scanner input = new Scanner(System.in)) {
			for (Hours days : Hours.values())
				System.out.printf("%-2d%s%n", days.getDay(), days);

			boolean done = false;

			do {
				System.out.print("\nEnter the number here: ");
				int weekDay = input.nextInt();

				for (Hours hours : Hours.values()) {
					if (weekDay == hours.getDay()) {
						System.out.printf("%-10s%s%n", hours, hours.getHours());
						done = true;
					}
				}
			} while (!done);
		} catch (HeadlessException e) {
			e.printStackTrace();
		}
	}
}
/*
 * Using Basic Java Concepts Assignment
 * Assignment 8, Part 2: Create an application that contains an enumeration
 * that represents the days of the week. Display a list of the days, then 
 * prompt the user for a day. Display business hours for the chose day.
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
package part1;

import javax.swing.JOptionPane;

/**
 *
 * @author Joshua Reese
 */

public class AppMain {

	public static void main(String[] args) {
		System.out.println("Joshua Reese Assignment 8\n");

		int[] ID = { 100, 101, 102, 103, 104, 105, 106, 107, 107, 108 };
		String[] NAME = { "Matthew", "Mark", "Luke", "John", "Paul", "Timothy", "Peter", "Simon", "Thomas", "James",
				"Philip" };
		double[] GPA = { 4.0, 3.8, 2.9, 3.7, 3.5, 3.8, 3.1, 3.5, 2.7, 3.0 };

		boolean done = false;

		do {
			String stringStudentID = JOptionPane.showInputDialog("Enter the student's three digit ID# ");
			double StudentID = Integer.parseInt(stringStudentID);

			if (StudentID == ID[0]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[0], GPA[0]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[1]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[1], GPA[1]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[2]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[2], GPA[2]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[3]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[3], GPA[3]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[4]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[4], GPA[4]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[5]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[5], GPA[5]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[6]) {
				JOptionPane.showMessageDialog(null, String.format("Name:%s\n\nG.P.A:%.1f", NAME[6], GPA[6]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[7]) {
				JOptionPane.showMessageDialog(null, String.format("Name:    %s\n\nG.P.A:    %.1f", NAME[7], GPA[7]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[8]) {
				JOptionPane.showMessageDialog(null, String.format("Name:    %s\n\nG.P.A:    %.1f", NAME[8], GPA[8]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else if (StudentID == ID[9]) {
				JOptionPane.showMessageDialog(null, String.format("Name:    %s\n\nG.P.A:    %.1f", NAME[9], GPA[9]),
						"Student GPA App", JOptionPane.INFORMATION_MESSAGE);
				done = true;
			} else {
				JOptionPane.showMessageDialog(null, String
						.format(" %.0f is not a valid ID#.\n " + "Please enter a valid\nthree digit ID#.", StudentID),
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!done);
	}
}

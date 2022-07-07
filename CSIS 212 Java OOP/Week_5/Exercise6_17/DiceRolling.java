/*
 * Using Basic Java Concepts Assignment
 * Assignment 5, Exercise 6.17: Write an application to simulate the rolling
 * of two dice. The application should use an object of class Random once to
 * roll the first die and again to roll the second die. The sum of the two 
 * values should then be calculated. Your application should roll the dice
 * 36,00 times. Use a one-dimensional array to tally the number of times each
 * possible sum appears. Display the results in a tabular format.
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
package Exercise6_17;

import java.util.Random;

/**
 *
 * @author Joshua Reese
 */
public class DiceRolling {

    public static void main(String[] args) {
    
        System.out.println("Joshua Reese - Assignment 5\n");

    	Random randomNumbers = new Random(); 
    	int dice1; 
    	int dice2;
    	int frequency = 13; 
        int rolls = 36000;
    	int total [] = new int [frequency];
        
    	for ( int i = 0; i < frequency; i++) {
            total[i] = 0;
            }
    	
    	for ( int j = 0; j <= rolls; j++ ) {
    		dice1 = randomNumbers.nextInt(6) + 1; 
    		dice2 = randomNumbers.nextInt(6) + 1;
    		total[dice1 + dice2]++;
		}

        System.out.println("Results after " + rolls + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");
        
        for (int sum = 2; sum < frequency; sum++ ) {
            System.out.printf("%d\t%d\n" , sum, total[sum]);
        }   
    }
}


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
public class Date {
    
    private int month;
    private int day;
    private int year;
    
    public Date(){
        this.month = 01;
        this.day = 01;
        this.year = 2022;
    }
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public void displayDate(){
        System.out.println("Today's date is: " + month + "/" 
                + day + "/" + year);
    }
}

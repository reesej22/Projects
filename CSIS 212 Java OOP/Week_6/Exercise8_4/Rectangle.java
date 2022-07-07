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
/**
 *
 * @author Joshua Reese
 */
public class Rectangle{  
    private double length;
    private double width;
    
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    public void setLength(double l) throws Exception{
        if(l<0 || l > 20){
            throw new Exception("\nEnter a length larger than 0.0 but less that 20.0");
        }
        length = (l>0 && l<20.0 ? l : 1.0);
    }
    public void setWidth(double w) throws Exception{
       if(w<0 || w > 20){
            throw new Exception("\nEnter a length larger than 0.0 but less that 20.0");
        }
        width = (w>0 && w<20 ? w : 1.0);
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double perimeter(){
        return 2 * length + 2 * width;
    } 
    public double area(){
        return length * width;
    }
    public String toPrinter(){
        return String.format("%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
            "Length", length, "Width", width,
            "Perimeter", perimeter(), "Area", area());
    }  
}
package Exercise3_20;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Joshua Reese
 */
public class SalaryCalculator { 
    
    public static void main(String[] args) {
        try (// TODO code application logic here
		Scanner sc = new Scanner(System.in)) {
			SalaryCalc sCalc = new SalaryCalc();
			    
			System.out.println("Joshua Reese - Assignment 1\n");

			for(int i=1; i<4; i++){
			    System.out.printf("Enter the hourly rate: ", i);
			    sCalc.setHourlyPay(sc.nextDouble());

			    System.out.printf("Enter the hours worked: ", i);
			    sCalc.setHours(sc.nextDouble());

			    System.out.printf("Pay for employee %d is: %.2f\n", i, sCalc.calcPay());
			    }
		}
        }

    public static class SalaryCalc {
        /**
         * @param args the command line arguments
         */
        double baseHours = 40.0;
        double overTime = 1.5;

        double hours, pay;

        public void setHours(double hours){
            this.hours = hours;
        }
        public void setHourlyPay(double pay){
            this.pay = pay;
        }
        public double calcPay(){
            return hours > 40 ?
                (pay * baseHours) + ((pay * overTime) * (hours - baseHours)) :
                hours * pay;
        }
    }
}

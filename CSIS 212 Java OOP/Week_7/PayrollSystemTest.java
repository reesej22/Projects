/*
 * Using Basic Java Concepts Assignment
 * Assignment 7, Exercise 10.12: Payroll Modification, modify the payroll
 * system of Figs 10.4 - 10.9 to include private instance variable birthdate
 * in class Employee. Use class Date of Fig 8.7 to represent an employee's 
 * birthday. Add get methods to class Date. Assume that payroll is processed 
 * once per month. Create an array of Employee variables to store references to
 * the various employee objects. 
 *
 * Fig. 10.9: PayrollSystemTest.java
 * Employee hierarchy test program.
 *
 * Liberty University 
 * CSIS 212: Object-Oriented Programming (B02)
 *
 * @author Joshua Reese
 */
public class PayrollSystemTest {

    public static void main(String[] args) {

        Date date = new Date(6, 23, 2022);

        // create four element Employee array
        Employee[] employees = new Employee[4];

        // initialise array with Employees
        employees[0] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.0f, 6, 3, 1990);
        employees[1] = new HourlyEmployee(
                "Karen", "Price", "222-22-2222", 16.75f, 40.0f, 5, 6, 1995);
        employees[2] = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000.0f, .06f, 9, 13, 1999);
        employees[3] = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-4444",
                5000.0f, .04f, 300.0f, 1, 12, 2000);
        System.out.println("\nJoshua Reese - Assignment 7");
        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {
                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary() * 1.10f);
                employee.setBaseSalary(1.10f * employee.getBaseSalary());
            } else if (currentEmployee.getBirthday().getMonth() == date.getMonth()) {
                System.out.printf(
                        "earned: $%, .2f with Birthday Bonus%n%n",
                        currentEmployee.earnings() + 100.0f);
            } else {
                System.out.printf("earned: $%, .2f %n%n",
                        currentEmployee.earnings());
            }
        }
        System.out.println("");
        // get type name of each object in employee array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}

/**
 * ************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 * ***********************************************************************
 */

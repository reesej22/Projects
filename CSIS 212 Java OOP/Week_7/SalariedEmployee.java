// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    // constructor
    public SalariedEmployee(String first, String last, String ssn, double salary,
            int month, int day, int year){
        // pass to Employee constructor
        super(first, last, ssn, month, day, year);
        setWeeklySalary(salary);
    }
    // SETTERS
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    // GETTERS
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
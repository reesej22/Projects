// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    // constructor
    public CommissionEmployee(String first, String last, String ssn,
            double sales, double rate, int month, int day, int year){
        super(first, last, ssn, month, day, year);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    // SETTERS
    public void setCommissionRate(double rate){
        if(rate > 0.0f && rate < 1.0f)
            this.commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    public void setGrossSales(double sales){
        if(sales >= 0.0f)
            this.grossSales = sales;
        else
            throw new IllegalArgumentException
                ("Gross sales muse be >= 0.0f");
    }
    // GETTERS
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
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
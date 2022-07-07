// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.

public abstract class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;
    // constructor
    public Employee(String first, String last, String ssn,
            int month, int day, int year){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        this.birthDay = new Date(month, day, year);
    }
    // SETTERS
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }
    public void setBirthday(int month, int day, int year) {
        this.birthDay = new Date(month, day, year);
    }
    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public Date getBirthday(){
        return this.birthDay;
    }
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    // ABSTRACT METHODS
    // not implemented here
    public abstract double earnings();
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
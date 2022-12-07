/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Employee - Developed for the Flight Booking System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */

package ie.lyit.flight;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//INHERITANCE - Employee IS-A Person, and CAN-DO Payable methods
public class Employee extends Person implements Payable {
    private Date startDate;	// Employee has name&dateOfBirth from Person		
    private double salary;	// AND startdate,salary, & number
    private int number;

	private static int nextNumber=1000;	// static for unique number - starts off at 1000    

	private final double MAX_SALARY = 150000.00;
	
   // Default Constructor
	// Called when object is created like this ==> 
	// Employee eObj = new Employee();	
    public Employee(){
    	super();
    	startDate=new Date();
 		salary=0.0;
		// Set number to static nextNumber before incrementing nextNumber
 		number=nextNumber++;
    }

   // Initialization Constructor
	// Called when object is created like this ==>
	//  Employee e1 = new Employee(new Name("Mr","Joe","Doe"),
	//                             new Date(25,12,1970),
	//							          55000.00,
	//							          new Date(10,11,2009));
	public Employee(Name nameIn,Date dobIn,double salary,Date startDate) {
	   // Call super class constructor - Passing parameters required by Person ONLY!		
	   super(nameIn,dobIn);
	   // And then initialise Employees own instance variables
	   this.startDate=startDate;	// Set instance variable to parameter
	   this.salary=salary;
	   
	   // Set number to static nextNumber before incrementing nextNumber
	   number = nextNumber++;						
	}

	// OVERRIDING the Person toString() method to make it more specific to Employee
	@Override
    public String toString(){
		return number + " " + name + " €" +  salary;
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(e1.equals(e2))				
	// ==> Probably sufficient to compare customer numbers as they're unique
	@Override
	public boolean equals(Object obj){
		Employee eObject;
		if (obj instanceof Employee)
		   eObject = (Employee)obj;
		else
		   return false;
		   
	    return(this.number==eObject.number);
	}

   // get() methods
	public Date getStartDate(){
		return startDate;
	}	
	public double getSalary(){
		return salary;
	}
	public int getNumber(){
		return number;
	}	

   // set() methods
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public void setStartDate(Date startDate){
		this.startDate=startDate;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	public double calculateWage(double taxPercentage) {
		// calculate and return the wage as salary/12 less taxPercentage
		double wage=salary/12;
		wage -= (wage * (taxPercentage/100));
		return wage;
	}

	public double incrementSalary(double incrementAmount) {
		// add incrementAmount to, and return the new salary
		// salary should not go over a maximum salary of €150,000
		salary += incrementAmount;
		
		if(salary > MAX_SALARY)
			salary = MAX_SALARY;
		
		return salary;
	}

		 public void read(){
		    //  JTextField txtNumber = new JTextField();
		    //  txtNumber.setText("" + this.getNumber());
		    ////  JTextField txtName = new JTextField();
		   //   txtName.requestFocus();
		   //   JTextField txtIsnbNumber = new JTextField();
		    

		    //  Object[] message = {
		      //    "Employee Number:", txtNumber,
		      //    "Employee Name:", txtName,
		      //    "Start Date:", txtIsnbNumber,
		        
		    //  };
		      
		    //  JDialog dialog = new JDialog();
		    //  dialog.setAlwaysOnTop(true);    
		   //   int option = JOptionPane.showConfirmDialog(dialog, message, "Enter Employee details", JOptionPane.OK_CANCEL_OPTION);

		    //  if (option == JOptionPane.OK_OPTION){
		       //   this.name = txtName.getText();
		        //  this.isbnNumber = txtIsnbNumber.getText();
		          
		    //  }   
	}
}

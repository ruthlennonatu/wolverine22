/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Employee class
 * Date: dd/mm/yyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import ie.lyit.flight.*;
import java.util.ArrayList;

public class EmployeeTester {

	public static void main(String[] args) {
		// Create a Employee object called employeeA
		Employee employeeA = new Employee();
							
		// display employeeA's details on screen
		System.out.println(employeeA);
					
		// set employeeA's details
		employeeA.setName(new Name("Mr","Homer","Simpson"));
		employeeA.setDateOfBirth(new Date(12, 2, 1999));
		employeeA.setSalary(60000);		
		employeeA.setStartDate(new Date(12, 2, 2015));
							
		// display employeeA's details on screen
		System.out.println(employeeA);

	    // Create a Employee object called employeeB with initial values
		Employee employeeB = new Employee(new Name("Ms","Lisa","Simpson"),
					                         new Date(20,12,1999),
					                         25000.00,
					                         new Date(1,2,2019));

		// display employeeB's details on screen
		System.out.println(employeeB);

		// check if employeeA is the same as employeeB
		if(employeeA.equals(employeeB))
			System.out.println(employeeA + " is the same employee as " + employeeB);
		else
			System.out.println(employeeA + " is not the same employee as " + employeeB);

		// check if employeeA is female
		if(employeeA.getName().isFemale())		// OR	if(personA.isFemale()==true)
			System.out.println(employeeA + " is female.");			
		else
			System.out.println(employeeA + " is male.");	
		
		// calculateWage() for employeeA
		System.out.println(employeeA + " Wage="+ employeeA.calculateWage(22));
      
	   // incrementSalary of employeeA by €5000.00
		employeeA.incrementSalary(5000.00);
		// display employeeA's details on screen
		System.out.println(employeeA);


		// Polymorphic ArrayList
		ArrayList<Person> allPersons = new ArrayList<Person>();
		
		allPersons.add(employeeA);
		allPersons.add(employeeB);
		allPersons.add(new Passenger(new Name("Miss","Lucy","Lee"),
				                       new Date(25,6,2014),
				                       1,true)); 
		allPersons.add(new Passenger(new Name("Mrs","Ann","Lee"),
                                   new Date(20,9,1978),
                                   1,true)); 

		// Polymorphism means 'many forms'
		// tmpPerson is taking on Employee objects and Passenger objects
		// The toString() from either Employee or Passenger will get called
		for(Person tmpPerson : allPersons)
			System.out.println(tmpPerson);	

		if(personSearch(employeeB, allPersons))
		    System.out.println("FOUND!");
		else
		    System.out.println("NOT FOUND!");
	}	
	
	public static boolean personSearch(Person p,ArrayList<Person> listOfPersons) {
       return listOfPersons.contains(p);
    }
}

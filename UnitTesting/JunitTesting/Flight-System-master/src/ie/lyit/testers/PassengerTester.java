/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tests the Passenger class by constructing Passenger objects and calling Passenger methods
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import java.util.ArrayList;
import ie.lyit.flight.*;

class PassengerTester{
   public static void main(String[] args){
	   // Create a Passenger object called passengerA
		Passenger passengerA = new Passenger();
							
		// display passengerA's details on screen
		System.out.println(passengerA);
					
		// set passengerA's details
		passengerA.setName(new Name("Ms","Lisa","Simpson"));
		passengerA.setDateOfBirth(new Date(1,6,1990));
		passengerA.setNoBags(6);				
		passengerA.setPriorityBoarding(false);				
							
		// display passengerA's details on screen
		System.out.println(passengerA);
					
	   // Create a Passenger object called passengerB with initial values
	   Passenger passengerB = new Passenger(new Name("Mr","Bart","Simpson"),
				                               new Date(15,7,1987),
				                               1,
				                               false);
							
		// display passengerB's details on screen
		System.out.println(passengerB);
							
	   // Create a Passenger object called passengerC with initial values
		Passenger passengerC = new Passenger(new Name("Mr","Homer","Simpson"), 
                                           new Date(25,10,1965),
                                           2,
                                           true);
					
		// check if passengerA is the same as passengerB
		if(passengerA.equals(passengerB))
		   System.out.println(passengerA + " is the same passenger as " + passengerB);
		else
		   System.out.println(passengerA + " is not the same passenger as " + passengerB);
					
		// check if passengerA is female
		if(passengerA.getName().isFemale())		// OR	if(personA.isFemale()==true)
		   System.out.println(passengerA + " is female.");			
		else
		   System.out.println(passengerA + " is male.");	
							
		// Create an ArrayList of Passenger objects called passengers
	   ArrayList<Passenger> passengers = new ArrayList<Passenger>();
		// Add 4 Passenger objects to names
	   passengers.add(new Passenger(new Name("Mrs","Marge","Simpson"),new Date(18,12,1968),4,true));	   
	   passengers.add(passengerA);
	   passengers.add(passengerB);
	   passengers.add(passengerC);	   
		// trim the capacity of names to be names current size
 		passengers.trimToSize();	
							
		// print every element in passengers
		System.out.println("\nArrayList contains ==>");
	    for(Passenger tempPassenger:passengers)
 	       System.out.println(tempPassenger);
	}
}
					

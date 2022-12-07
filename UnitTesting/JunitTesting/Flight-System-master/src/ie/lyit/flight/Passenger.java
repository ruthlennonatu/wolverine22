/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Passenger - Developed for the Flight Booking System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.lyit.flight;

public class Passenger extends Person{ //INHERITANCE-Passenger IS-A Person
	private int noBags;				 // Passenger has name & dateOfBirth from Person
	private boolean priorityBoarding;// AND noBags & priorityBoarding

	// Default Constructor
	// Called when object is created like this ==> 
	// Passenger prObj = new Passenger();
	public Passenger(){
		// The super() constructor will get called automatically!
		super(); // You don't need to put in, but you can!
	 	noBags = 0;
		priorityBoarding = false;
	}

	// Initialization Constructor
	// Called when object is created like this ==>
	//    Passenger prObj = new Passenger("Mr", "Joe", "Doe", 25, 12, 1985, 2, true);
	public Passenger(Name nameIn,Date dobIn,int noBagsIn,boolean pB){
		// Call super class constructor - Passing parameters required by Person ONLY!
	   super(nameIn,dobIn);
		// And then initialise Passengers own instance variables
	   noBags=noBagsIn;
	   priorityBoarding=pB;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding additional bits
	@Override
	public String toString(){
	   // Display Passenger as follows:
	   // Ms Lisa Simpson, 2 bags, no Priority Boarding
	   String pb="";
	   if(priorityBoarding)
		   pb="Priority Boarding";
	   else
		   pb="no Priority Boarding";
	   
	   return name + ", " + noBags + " bags, " + pb;
   }

	// OVERRIDING the Person equals() method!
	// ==> Called when comparing an object with another object, e.g. - 
	//       if(pr1.equals(pr2))										
	// Calling Persons equals() method, and adding additional bits
	@Override
	public boolean equals(Object obj){
	   Passenger pObject;
	   if (obj instanceof Passenger)
		   pObject = (Passenger)obj;
	   else
	       return false;
	 
	   return super.equals(pObject)
	          && this.noBags == pObject.noBags
	          && this.priorityBoarding == pObject.priorityBoarding;
	}	

	// set() and get() methods
	public void setNoBags(int noBagsIn){
		if(noBagsIn > 3)
			noBags=3;
		else
			noBags=noBagsIn;
	}
   public int getNoBags(){
      return noBags;
   }
					
   public void setPriorityBoarding(boolean priorityBoardingIn){
      priorityBoarding=priorityBoardingIn;
   }
   public boolean getPriorityBoarding(){
      return priorityBoarding;
   }	
}

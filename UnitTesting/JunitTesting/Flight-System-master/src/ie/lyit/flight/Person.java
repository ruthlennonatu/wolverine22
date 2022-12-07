/**
* Class: Software Implementation
* Instructor: Maria Boyle
* Description: Class Person - Developed for the Flight Booking System
* Date: dd/mm/yyyy
* @author Software Implementation Students
* @version 1.0
*/

package ie.lyit.flight;

public abstract class Person {
	protected Name name;		// COMPOSITION - Person HAS-A name
	protected Date dateOfBirth;	// COMPOSITION - Person HAS-A dateOfBirth

    // Default Constructor
	// Called when object is created like this 
	//   ==> Person pObj = new Person();
	//   NOTE-This won't work because Person is abstract	
	public Person(){
		name = new Name();
		dateOfBirth = new Date();
	}
	
	// Overloaded Initialisation Constructor
	// Called when object would have been created like this (not possible cos Abstract!)
	//    ==> Person pObj = new Person(new Name("Mr","Joe","Doe"), 
	//                                 new Date(25, 12, 1985));
	//    NOTE-This won't work because Person is abstract!
    public Person(Name nameIn, Date dobIn){
		name=nameIn;
		dateOfBirth=dobIn;
	}
    
	// toString() method
	// ==> Calls Name's toString() to display name, and
	//		       Date's toString() to display dateOfBirth
	@Override  // Overrides Object toString()
    public String toString(){
	   return name.toString() + "," + dateOfBirth;
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(p1.equals(p2))				
	// ==> Calls Name's equals() to compare name to personIn's name, and
	//		compares phoneNumber to personIn's phoneNumber
	@Override  // Overrides Object equals()
	public boolean equals(Object obj){
	   Person pObject;
	   if (obj instanceof Person)
	      pObject = (Person)obj;
	   else
	      return false;
	   
       return(this.name.equals(pObject.name) &&
    		     this.dateOfBirth.equals(pObject.dateOfBirth));
	}
	
	// set() and get() methods
	public void setName(Name nameIn){
		name = nameIn;
	}
	public Name getName(){
		return name;
	}
	public void setDateOfBirth(Date dateOfBirthIn){
		dateOfBirth = dateOfBirthIn;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}	
}

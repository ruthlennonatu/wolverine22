package ie.lyit.serialize;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import ie.lyit.flight.*;

//Employee(Name nameIn,Date dobIn,double salary,Date startDate)
public class EmployeeSerializer {
	private ArrayList<Employee> employees;
	
	final String FILENAME = "employees.ser";	
	
	// Default Constructor
	public EmployeeSerializer(){
		// Construct bookList ArrayList
	employees = new ArrayList<Employee>();
	}
		

	/////////////////////////////////////////////////////////
	// Method Name : add()								   //
	// Return Type : void								   //
	// Parameters : None								   //
	// Purpose : Reads one Book record from the user       //
	//           and adds it to the ArrayList called books //
	/////////////////////////////////////////////////////////
	public void add(){
		// Create a Book object
		Employee employee = new Employee();
		// Read its details
		employee.read();	
		// And add it to the books ArrayList
		employees.add(employee);
	}

	///////////////////////////////////////////////
	// Method Name : list()						 //
	// Return Type : void					   	 //
	// Parameters : None						 //
	// Purpose : Lists all Book records in books //
	///////////////////////////////////////////////		
	public void list(){
		// for every Book object in books
        for(Employee tmpEmployee:employees)
			// display it
			System.out.println(tmpEmployee);
	}	
	
	////////////////////////////////////////////////////////////
	// Method Name : view()									  //
	// Return Type : Book								      //
	// Parameters : None								      //
	// Purpose : Displays the required Book record on screen  //
	//         : And returns it, or null if not found         //   
	////////////////////////////////////////////////////////////	
	public Employee view(){
		Scanner keyboard = new Scanner(System.in);		

		// Read the number of the book to be viewed from the user
		System.out.println("ENTER EMPLOYEE NUMBER OF EMPLOYEE : ");
		int bookToView=keyboard.nextInt();
		
		// for every Book object in books
        for(Employee tmpEmployee:employees) {
 		   // if it's number equals the number of the bookToView
 		   if(tmpEmployee.getNumber() == bookToView){
 		      // display it and...
 			  System.out.println(tmpEmployee);
 			  // return it
 			  return tmpEmployee;
 		   }
        }
	    // if we reach this code the book was not found so return null
	    return null;		
	}
	
	///////////////////////////////////////////////////////////
	// Method Name : delete()								 //
	// Return Type : void									 //
	// Parameters : None									 //
	// Purpose : Deletes the required Book record from books //
	///////////////////////////////////////////////////////////	
	public void delete(){	
		// Call view() to find, display, & return the book to delete
		Employee tempEmployee = view();

		// If the book != null, i.e. it was found then...
	    if(tempEmployee != null)
		   // ...remove it from books
	    	employees.remove(tempEmployee);		
	}

	///////////////////////////////////////////////////////////
	// Method Name : edit()			  					     //
	// Return Type : void									 //
	// Parameters : None									 //
	// Purpose : Edits the required Book record in books     //
	///////////////////////////////////////////////////////////	
	public void edit(){	
		// Call view() to find, display, & return the book to edit
		Employee tempEmployee = view();

		// If the book != null, i.e. it was found then...
	    if(tempEmployee != null){
		   // get it's index
		   int index=employees.indexOf(tempEmployee);
		   // read in a new book and...
		   tempEmployee.read();
		   // reset the object in books
		   employees.set(index, tempEmployee);
	    }
	}
	
	// This method will serialize the books ArrayList when called, 
	// i.e. it will write it to a file called books.ser
	public void serializeBooks(){
		ObjectOutputStream os=null;
		try {
			// Serialize the ArrayList...
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
		
			os = new ObjectOutputStream(fileStream);
				
			os.writeObject(employees);
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store books.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		finally {
			try {
				os.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}

	// This method will deserialize the books ArrayList when called, 
	// i.e. it will restore the ArrayList from the file books.ser
	public void deserializeBooks(){
		ObjectInputStream is=null;
		
		try {
			// Deserialize the ArrayList...
			FileInputStream fileStream = new FileInputStream(FILENAME);
		
			is = new ObjectInputStream(fileStream);
				
			employees = (ArrayList<Employee >)is.readObject();
			
			// get size of books
			
			// get the number of the last element (size - 1)
			
			// set static to that number + 1
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store employee number.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			try {
				is.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}
}

package ie.lyit.testers;

import ie.lyit.flight.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExceptionHandlerDemo {

	public static void main(String[] args) {
		// ArrayList of type Passenger called passengers
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();

	    Name n1 = new Name("Mr","Mark","Harkin");
	    Passenger p1 = new Passenger(n1,new Date(11,4,1980),2,true);	

	    Name n2 = new Name("Mrs","Sarah","Coyle");
	    Passenger p2 = new Passenger(n2,new Date(15,6,1984),1,true);
	    
	    passengers.add(p1);
	    passengers.add(p2);
	    passengers.add(new Passenger(new Name("Ms","Ella","Harkin"),
	    		                     new Date(3,5,2016),0,true)); 
	    passengers.add(new Passenger(new Name("Mr","Billy","Harkin"),
                                     new Date(6,8,2018),0,true)); 
	    boolean goodInput=false;
	    do {
		    try {
			    String numberAsString=
			    	JOptionPane.showInputDialog(null,
			    	"Enter Passenger to View ("+1+" to"+ passengers.size()+")");
			    int numberToView=Integer.parseInt(numberAsString);
			    JOptionPane.showMessageDialog(null,passengers.get(numberToView-1));
			    goodInput=true;
		    }
		    catch(NumberFormatException nfe) {
		    	JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
		    }
		    catch(IndexOutOfBoundsException iobe) {
		    	JOptionPane.showMessageDialog(null,
		    	 "Enter number between 1 and "+passengers.size());	    	
		    }
		    catch(Exception e) {
		    	JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
		    }
	    }while(!goodInput);
	}
}

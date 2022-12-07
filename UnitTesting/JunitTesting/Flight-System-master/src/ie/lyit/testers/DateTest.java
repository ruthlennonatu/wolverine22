package ie.lyit.testers;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ie.lyit.flight.Date;


class DateTest {
	private Date date;
	
	@BeforeEach
	void setUp() throws Exception {
		date =new Date();
	}

	
	@Test
	void testDate() {
		assertEquals(1, date.getDay());
		assertEquals("Month should be 1",1, date.getMonth());
		assertEquals("Year should be 1900",1900, date.getYear());
		
		
	}

	
	
	@Test
	void testDateIntIntInt() {
		date=new Date(5,6,2020);
		assertEquals(5, date.getDay());
		assertEquals("Month should be 6",6, date.getMonth());
		assertEquals("Year should be 2020",2020, date.getYear());
		
	}
	
	@Test
	void testDateIntIntIntForException() {
		date=new Date(33,12,2020);	
	}
	
	@Test
	void testToString() {
		assertTrue("expected 1/1/1990,got "+date.toString(),"1/1/1900"==date.toString());
		
	}

	
	
	@Test
	void testSetDay() {
		date.setDay(15);
		assertEquals("Day should be 15",15, date.getDay());
		
	}

	//@Test(expected = IllegalArgumentException.class)
	// void testSetDayForException() {
		//date.setDay(55);
		
	//}

	
	
	@Test
	void testSetMonth() {
		date.setMonth(1);
		assertEquals("Month should be 1",1==date.getMonth());
		//or
		assertTrue("Month should be 1",1==date.getMonth());
	}

	
	@Test
	void testSetYear() {
		date.setYear(1999);
		assertTrue("Year should be 1999",1999==date.getYear());
	}

}

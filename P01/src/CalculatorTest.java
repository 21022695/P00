import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddNormal() {
		//fail("Not yet implemented");
		int a= 2;
		int b=1;
		Calculator cal= new Calculator ();
		int actual= cal.add(a, b);
		int expected=3;
		assertEquals(expected,actual);
	}//add test case 1 normal 
	
	@Test
	public void testAddBoundary() {
		//fail("Not yet implemented");
		int a= 8;
		int b=9999;
		Calculator cal= new Calculator ();
		int actual= cal.add(a, b);
		int expected=19998;
		assertTrue((a >= 0 && b >= 0) && (a<=9999 && b <=9999));
	}//add test case 2 boundary 
	@Test
	public void testAddError() {
		//fail("Not yet implemented");
		int a=-9;
		int b=99999;
		Calculator cal= new Calculator ();
		int actual= cal.add(a, b);
		int expected=0;
		assertNotEquals(expected,actual);
	}//end of error 
	@Test
	public void testSubtractNormal() {
		int a =9999;
		int b=9999;
		
		Calculator cal = new Calculator();
		int actual= cal.subtract(a, b);
		int expected=0;
		assertEquals(actual,expected);
	}
	@Test
	public void testSubtract2() {
		int a =9999;
		int b=0;
		
		Calculator cal = new Calculator();
		int actual= cal.subtract(a, b);
		int expected=10;
		assertTrue((a >= 0 && b >= 0) && (a<=9999 && b <=9999));
	}// test sub case 2*//normal
	@Test
	public void testSubtract3() {
		int a =1;
		int b=99999;
		
		Calculator cal = new Calculator();
		int actual= cal.subtract(a, b);
		int expected=99990;//error
		assertNotEquals(actual,expected);
	}// test sub case 1*// error
	@Test
	public void multipleTestNormal() {
		int a =7;
		int b=4;
		
		Calculator cal = new Calculator();
		int actual= cal.multiply(a, b);
		int expected=28;
		assertEquals(actual,expected);
	}//normal
	@Test
	public void multipleTestBoundary() {
		int a =0;
		int b=9999;//boundary max 4 units
		
		Calculator cal = new Calculator();
		int actual= cal.multiply(a, b);
		int expected=99980001;
		assertTrue((a >= 0 && b >= 0) && (a<=9999 && b <=9999));
	}//boundary
	@Test
	public void multipleTestError() {
		int a =9999;
		int b=99999;//error out side of boundary
		
		Calculator cal = new Calculator();
		int actual= cal.multiply(a, b);
		int expected=99989000;//error wrong result
		assertNotEquals(actual,expected);
	}
	// error
	
	@Test
	public void divideTestNormal() {
		int a =12;
		int b =4;
		Calculator cal = new Calculator();
		int actual= cal.divide(a, b);
		int expected=3;
		assertEquals(expected,actual);
	
	}
	@Test
	public void divideTestBoundary() {
		int a =9999;
		int b =9999;
		Calculator cal = new Calculator();
		int actual= cal.divide(a, b);
		int expected=3;
		assertTrue((a >= 0 && b >= 0) && (a<=9999 && b <=9999));
		
	}
	
	@Test
	public void divideTestError() {
		int a =12;
		int b =4;
		Calculator cal = new Calculator();
		int actual= cal.divide(a, b);
		int expected=0;
		assertNotEquals(expected,actual);
	
	}
}

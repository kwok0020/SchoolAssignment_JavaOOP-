package Junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is to test the method in class YourPurchases by using JUnit.
 * If the test pass, the JUnit tool will shows a green bar otherwise it will
 * show it red.
 * @author Rebecca, Sze Man Kwok
 * @see YourPurchases
 *
 */
public class YourPurchasesTest {
	
	   private static final double EPSILON = 1E-12;


	@Test public void twoPurchases() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 0.25;
		Assert.assertEquals(expected, register.giveChange(), EPSILON);
	}
	
	   // YOUR TASKS ARE STATED HERE: 
	   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR 
	   // WHILE YOU DEMO, MODIFY THIS TEST CASE SUITE TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY ADDING JUST ONE MORE TEST CASE (NOT ALREADY STATED IN THIS CODE)
	   // RUN AND DEMO YOUR NEW TEST CASE SUITE 
	   
	   // ADD NEW TEST CASES HERE!!!
	   // USE A DIFFERENT ASSERTION (NOT assertEquals) IN AT LEAST ONE OF YOUR TESTS.  
	
	/**
	 * Set up the test by using a assertion of asserNotSame.
	 */
	@Test 
	public void testZeroBalance() {
		YourPurchases register= new YourPurchases();
		register.recordPurchase(2.25);
		register.recordPurchase(19.25);
		register.receivePayment(21, 2, 0, 0, 0);
		Assert.assertNotSame("", register.giveChange(), EPSILON);
	}
}

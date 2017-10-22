package com.jeromejaglale.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
* The CarTest program is a part of the test driven development.
* The test cases are written first and later the functionality is written.
* @author  Gaurav Shukla
* @version 1.0
* @since   2017-10-23 
*/

public class CarTest {
	static Car car =null;
	/**
	 * Called before the class is picked up by junit framework
	 * @result car object is created with it's name as tata safari and price as 20000 $
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		car = new Car();
		car.setName("Tata Safari");
		car.setPrice(new BigDecimal(20000));
		
	}
	/**
	 * Called after the Junit class is torn apart
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/**
	 * This method is written for setting any thing for Junit test
	 */
	@Before
	public void setUp() throws Exception {
	}
	/**
	 * At the time of Junit being torn down, this method is called
	 */
	@After
	public void tearDown() throws Exception {
	}
	/**
	 * test method for the car's name
	 * @result checks if the car's name is being retrieved or not.
	 */
	@Test
	public void testGetName() {
		assertEquals(car.getName(),"Tata Safari");
	}
	/**
	 * test method for the car's name
	 * @result checks if the car's name is set properly.
	 */

	@Test
	public void testSetName() {
		car.setName("Tata Safari Strome");
		assertEquals(car.getName(),"Tata Safari Strome");
	}
	/**
	 * test method for the car's price
	 * @result checks if the car's name is being retrieved or not.
	 */

	@Test
	public void testGetPrice() {
		assertEquals(car.getPrice(),new BigDecimal(20000));
	}
	/**
	 * test method for the car's price is being set of not
	 * @result checks if the car's name is set.
	 */

	@Test
	public void testSetPrice() {
		car.setPrice(new BigDecimal(25000));
		assertEquals(car.getPrice(),new BigDecimal(25000));
	}
	/**
	 * test method for the car's image name
	 * @result checks if the car's image name is set or not.
	 */
	
	@Test
	public void testSetImageName() {
		car.setImageName("NewMercedesImage.img");
		assertEquals(car.getImageName(),"NewMercedesImage.img");
	}
	/**
	 * test method for the car's image name is getting retrieved or not
	 * @result checks if the car's imagename is retrieved or not.
	 */
	
	@Test
	public void testGetImageName() {
		assertEquals(car.getImageName(),null);
	}

}

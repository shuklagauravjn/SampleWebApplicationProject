package com.jeromejaglale.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	static Car car =null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		car = new Car();
		car.setName("Tata Safari");
		car.setPrice(new BigDecimal(20000));
		
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
	public void testGetName() {
		assertEquals(car.getName(),"Tata Safari");
	}

	@Test
	public void testSetName() {
		car.setName("Tata Safari Strome");
		assertEquals(car.getName(),"Tata Safari Strome");
	}

	@Test
	public void testGetPrice() {
		assertEquals(car.getPrice(),new BigDecimal(20000));
	}

	@Test
	public void testSetPrice() {
		car.setPrice(new BigDecimal(25000));
		assertEquals(car.getPrice(),new BigDecimal(25000));
	}
	@Test
	public void testSetImageName() {
		car.setImageName("Mercedes.img");
		assertEquals(car.getImageName(),"Mercedes.img");
	}
	@Test
	public void testGetImageName() {
		assertEquals(car.getImageName(),null);
	}

}

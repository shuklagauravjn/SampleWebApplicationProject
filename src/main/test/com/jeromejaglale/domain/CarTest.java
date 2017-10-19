package com.jeromejaglale.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	Car car =null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		car = new Car();
		car.setName("Tata Safari");
		car.setPrice(20000);
		
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
		assert(car.getName(),"Tata Safari");
	}

	@Test
	public void testSetName() {
		car.setName("Tata Safari Strome");
		assert(car.getName(),"Tata Safari Strome");
	}

	@Test
	public void testGetPrice() {
		assert(car.getPrice(),20000);
	}

	@Test
	public void testSetPrice() {
		car.setPrice(25000);
		assert(car.getPrice(),25000);
	}

}

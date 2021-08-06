package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerAccountTest {
	
	@Before
	public void setUp() {
		CustomerAccount acc = new CustomerAccount();
		acc.setUsername("Viet");
		acc.setPassword("6513002363");
		acc.setEmail("vqn1999@gmail.com");
		acc.setPhone(0906670887);
		acc.setAddress("Vinhomes Central Park, Park 6A, Binh Thanh");
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testAccountConstructor() {
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

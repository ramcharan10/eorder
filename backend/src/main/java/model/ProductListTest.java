package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductListTest {
	
	@Before
	public void setUp() {
		ProductList productList = new ProductList();
		productList.setName("Laptop");
		productList.setPicture("Picture of a Laptop");
		productList.setPrice(15.00);
		productList.setDescription("A portable computer.");
	}

	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testProductListConstructor() {
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

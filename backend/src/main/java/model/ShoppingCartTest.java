package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	@Before
	public void setUp() {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setCustomerAccount("Nguyen Manh Quoc Viet");
		shoppingCart.setId(1);
		shoppingCart.setShoppingDetails(null);
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

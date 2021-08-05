package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingDetailTest {
	
	@Before
	public void setUp() {
		ShoppingDetail shoppingDetail = new ShoppingDetail();
		shoppingDetail.setId(1);
		shoppingDetail.setProductList(null, null);
		shoppingDetail.setQuantity(0);
		shoppingDetail.setShoppingCart(null);
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

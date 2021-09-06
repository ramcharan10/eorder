package FoodOrderingApp.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import FoodOrderingApp.DAO.ProductDAO;
import FoodOrderingApp.model.Product;

public class ProductJUnitTest {
	
	static ProductDAO productDAO;
	
	@BeforeClass
	
	public static void ExecuteFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("FoodOrderingApp");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	@Test
	public void addProductTest() {
		Product product = new Product();
		product.setProductName("Apple");
		product.setProductDescription("A red and round fruit that is sweet, juicy and crispy.");
		product.setPrice(10.00);
		product.setStock(45);
		product.setCategoryId(1);
		product.setSupplierId(1);
		
		assertTrue("Problem in adding a product", productDAO.addProduct(product));
	}
}

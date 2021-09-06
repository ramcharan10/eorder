package FoodOrderingApp.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import FoodOrderingApp.DAO.SupplierDAO;
import FoodOrderingApp.model.Supplier;

public class SupplierJUnitTest {

	static SupplierDAO supplierDAO;
	
	@BeforeClass
	
	public static void ExecuteFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("FoodOrderingApp");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}
	
	@Test
	public void addSupplierTest() 
	{
		Supplier supplier = new Supplier();
		supplier.setSupplierId(1);
		supplier.setSupplierAddress("New York");
		supplier.setSupplierName("Echo International Co.");
		
		assertTrue("Problem in adding a supplier", supplierDAO.addSupplier(supplier));
	}
}

package FoodOrderingApp.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import FoodOrderingApp.DAO.CategoryDAO;
import FoodOrderingApp.model.Category;

public class CategoryJUnitTest {
	
	static CategoryDAO categoryDAO;
	
	@BeforeClass
	
	public static void ExecuteFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("FoodOrderingApp");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void addCategoryTest()
	{
		Category category = new Category();
		
		category.setCategoryName("Fruit");
		category.setCategoryDesc("All variety of fruits.");
		
		assertTrue("Problem in adding a category", categoryDAO.addCategory(category));
	}

}

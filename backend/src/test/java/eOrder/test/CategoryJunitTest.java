package eOrder.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eOrder.DAO.CategoryDAO;
import eOrder.model.Category;

public class CategoryJunitTest {

	static CategoryDAO categoryDao;
	
	@BeforeClass
	
	public static void executeFirst() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
		context.scan("eOrder");
		context.refresh();
		
		categoryDao=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	
	public void addCategoryTest() {
		Category category = new Category();
		
		category.setCategoryName("Drink");
		category.setCategoryDesc("All variety of drink");
		
		assertTrue("Problem in adding Category", categoryDao.addCategory(category));
	}
	
	}


 
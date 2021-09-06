package FoodOrderingApp.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import FoodOrderingApp.DAO.UserDAO;
import FoodOrderingApp.model.UserDetail;

public class UserJUnitTest {

	static UserDAO userDAO;
	
	@BeforeClass
	
	public static void ExecuteFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("FoodOrderingApp");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
	@Test
	public void registerUserTest()
	{
		UserDetail user = new UserDetail();
		user.setUserName("Viet");
		user.setPassword("password");
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		user.setCustomerName("Nguyen");
		user.setCustomerAddress("Ho Chi Minh City");
		
		assertTrue("Problem in registering a user", userDAO.registerUser(user));
	}

}

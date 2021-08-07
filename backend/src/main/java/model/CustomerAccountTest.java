package test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.Assert;
import model.CustomerAccount;

public class CustomerAccountTest {

	private CustomerAccount customer = new CustomerAccount(1, "John", "123456", "john@mail.com", "0902123456",
			"89264 O'Hara Fields Vermontville, NY 12989");

	@Test
	public void testGetId() {
		Assert.assertEquals(1, customer.getId());
	}

	@Test
	public void testSetId() {
		customer.setId(2);
		Assert.assertEquals(2, customer.getId());
	}
	
//	@Test
//	public void testSetId1() throws InvalidCustomerAccount {
//		CustomerAccount customerTest = new CustomerAccount();
//		
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setId(0);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalid ID. Please try again.");
//		}
//		Assert.assertEquals(0, customerTest.getId());
//	}

	@Test
	public void testGetUsername() {
		Assert.assertEquals("John", customer.getUsername());
	}

	@Test
	public void testSetUsername() {
		customer.setUsername("James");
		Assert.assertEquals("James", customer.getUsername());
	}
	
//	@Test
//	public void testSetUsername1() {
//		CustomerAccount customerTest = new CustomerAccount();
//		
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setUsername(null);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalid Username. Please try again.");
//		}
//		Assert.assertEquals(null, customerTest.getUsername());
//	}

	@Test
	public void testGetPassword() {
		Assert.assertEquals("123456", customer.getPassword());
	}

	@Test
	public void testSetPassword() {
		customer.setPassword("654321");
		Assert.assertEquals("654321", customer.getPassword());
	}
	
//	@Test
//	public void testSetPassword1() {
//		CustomerAccount customerTest = new CustomerAccount();
//		
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setPassword(null);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalide Password. Please try again.");
//		}
//		Assert.assertEquals(null, customerTest.getPassword());
//	}

	@Test
	public void testGetEmail() {
		Assert.assertEquals("john@mail.com", customer.getEmail());
	}

	@Test
	public void testSetEmail() {
		customer.setEmail("james@mail.com");
		Assert.assertEquals("james@mail.com", customer.getEmail());
	}
	
//	@Test
//	public void testSetEmail1() {
//		CustomerAccount customerTest = new CustomerAccount();
//		
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setEmail(null);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalid Email. Please try again.");
//		}
//		Assert.assertEquals(null, customerTest.getEmail());
//	}
	
	@Test
	public void testInvalidEmail() {
		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher("unguye1991@gmail.com");
		assertTrue(matcher.find());
	}

	@Test
	public void testGetPhone() {
		Assert.assertEquals("0902123456", customer.getPhone());
	}

	@Test
	public void testSetPhone() {
		customer.setPhone("0903654321");
		Assert.assertEquals("0903654321", customer.getPhone());
	}
	
//	@Test
//	public void testSetPhone1() {
//		CustomerAccount customerTest = new CustomerAccount();
//	
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setPhone(null);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalid Phone Number. Please try again.");
//		}
//		Assert.assertEquals(null, customerTest.getPhone());
//	}
	
	@Test
	public void whenMatchesSixDigitsNumber_thenCorrect() {		
	    Pattern pattern = Pattern.compile("^\\d{6}$");
	    Matcher matcher = pattern.matcher("12345");
	    assertTrue(matcher.matches());
	}
	
	@Test
	public void whenMatchesFifteenDigitsNumber_thenCorrect() {		
	    Pattern pattern = Pattern.compile("^\\d{15}$");
	    Matcher matcher = pattern.matcher("1234567891011121");
	    assertTrue(matcher.matches());
	}

	@Test
	public void testGetAddress() {
		Assert.assertEquals("89264 O'Hara Fields Vermontville, NY 12989", customer.getAddress());
	}

	@Test
	public void testSetAddress() {
		customer.setAddress("150 Rachael Row Suite 789 East Otto, NY 14729");
		Assert.assertEquals("150 Rachael Row Suite 789 East Otto, NY 14729", customer.getAddress());
	}
	
//	@Test
//	public void testSetAddress1() {
//		CustomerAccount customerTest = new CustomerAccount();
//		
//		boolean isExceptionRaised = false;
//		try {
//			customerTest.setAddress(null);
//		} catch (InvalidCustomerAccount e) {
//			isExceptionRaised = true;
//			System.out.println("Invalide Address. Please try again.");
//		}
//		Assert.assertEquals(null, customerTest.getAddress());
//	}

}

// References:
// [1] baeldung, �Validate Phone Numbers With Java Regex,� Baeldung, May 10, 2020. https://www.baeldung.com/java-regex-validate-phone-numbers (accessed Aug. 07, 2021).
// [2] T. Hoang, �Java regex email,� Stack Overflow, Nov. 20, 2011. https://stackoverflow.com/questions/8204680/java-regex-email (accessed Aug. 07, 2021).

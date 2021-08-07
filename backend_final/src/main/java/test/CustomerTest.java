package test;

import model.CustomerAccount;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    // Create CustomerAccount object
    private CustomerAccount customer = new CustomerAccount("John", "123456", "0902123456", "john@mail.com", "1234567");

    // Test cases for getters and setters of CustomerAccount model, names of test methods are self-explanatory
    @Test
    public void testGetName() {
        Assert.assertEquals("John", customer.getName());
    }

    @Test
    public void testSetName() {
        customer.setName("James");
        Assert.assertEquals("James", customer.getName());
    }

    @Test
    public void testGetPassword() {
        Assert.assertEquals("123456", customer.getPassword());
    }

    @Test
    public void testSetPassword() {
        customer.setPassword("654321");
        Assert.assertEquals("654321", customer.getPassword());
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

    @Test
    public void testGetEmail() {
        Assert.assertEquals("john@mail.com", customer.getEmail());
    }

    @Test
    public void testSetEmail() {
        customer.setEmail("james@mail.com");
        Assert.assertEquals("james@mail.com", customer.getEmail());
    }

    @Test
    public void testGetCard() {
        Assert.assertEquals("1234567", customer.getCreditCard());
    }

    @Test
    public void testSetCard() {
        customer.setCreditCard("7654321");
        Assert.assertEquals("7654321", customer.getCreditCard());
    }
}

package test;

import model.AdminAccount;
import org.junit.Assert;
import org.junit.Test;

public class AdminTest {

    // Create AdminAccount object
    private AdminAccount admin = new AdminAccount("John", "123456", "0902123456", "john@mail.com");

    // Test cases for getters and setters of AdminAccount model, names of test methods are self-explanatory
    @Test
    public void testGetName() {
        Assert.assertEquals("John", admin.getName());
    }

    @Test
    public void testSetName() {
        admin.setName("James");
        Assert.assertEquals("James", admin.getName());
    }

    @Test
    public void testGetPassword() {
        Assert.assertEquals("123456", admin.getPassword());
    }

    @Test
    public void testSetPassword() {
        admin.setPassword("654321");
        Assert.assertEquals("654321", admin.getPassword());
    }

    @Test
    public void testGetPhone() {
        Assert.assertEquals("0902123456", admin.getPhone());
    }

    @Test
    public void testSetPhone() {
        admin.setPhone("0903654321");
        Assert.assertEquals("0903654321", admin.getPhone());
    }

    @Test
    public void testGetEmail() {
        Assert.assertEquals("john@mail.com", admin.getEmail());
    }

    @Test
    public void testSetEmail() {
        admin.setEmail("james@mail.com");
        Assert.assertEquals("james@mail.com", admin.getEmail());
    }

}

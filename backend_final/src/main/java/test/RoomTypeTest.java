package test;

import model.RoomType;
import org.junit.Assert;
import org.junit.Test;

public class RoomTypeTest {

    // Create RoomType object
    private RoomType type = new RoomType("deluxe");

    // Test cases for getters and setters of RoomType model, names of test methods are self-explanatory
    @Test
    public void testGetId() {
        Assert.assertEquals(0, type.getId());
    }

    @Test
    public void testSetId() {
        type.setId(1);
        Assert.assertEquals(1, type.getId());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("deluxe", type.getName());
    }

    @Test
    public void testSetName() {
        type.setName("master");
        Assert.assertEquals("master", type.getName());
    }
}

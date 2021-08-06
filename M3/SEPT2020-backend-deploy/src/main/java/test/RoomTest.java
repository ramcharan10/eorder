package test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import model.Room;
import model.RoomType;
import org.junit.Assert;
import org.junit.Test;

public class RoomTest {

    // Create objects related to Room object
    private RoomType type = new RoomType("deluxe");
    private Room room = new Room(type, "123", true, false, "1", 1000);

    // Test cases for getters and setters of Room model, names of test methods are self-explanatory
    @Test
    public void testGetType() {
        Assert.assertEquals("deluxe", room.getType().getName());
    }

    @Test
    public void testSetType() {
        RoomType typeTest = new RoomType("master");
        room.setType(typeTest);
        Assert.assertEquals("master", room.getType().getName());
    }

    @Test
    public void testGetNumber() {
        Assert.assertEquals("123", room.getNumber());
    }

    @Test
    public void testSetNumber() {
        room.setNumber("345");
        Assert.assertEquals("345", room.getNumber());
    }

    @Test
    public void testGetWifi() {
        Assert.assertEquals(true, room.isWifi());
    }

    @Test
    public void testSetWifi() {
        room.setWifi(false);
        Assert.assertEquals(false, room.isWifi());
    }

    @Test
    public void testGetSmoking() {
        Assert.assertEquals(false, room.isSmoking());
    }

    @Test
    public void testSetSmoking() {
        room.setSmoking(true);
        Assert.assertEquals(true, room.isSmoking());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(1000, room.getPrice());
    }

    @Test
    public void testSetPrice() {
        room.setPrice(100);
        Assert.assertEquals(100, room.getPrice());
    }
}

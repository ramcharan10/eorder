package test;

import model.Booking;
import model.CustomerAccount;
import model.Room;
import model.RoomType;
import org.junit.Assert;
import org.junit.Test;

public class BookingTest {

    // Create objects related to Booking object
    private RoomType type = new RoomType("deluxe");
    private Room room = new Room(type, "123", true, false, "1", 1000);
    private CustomerAccount customer = new CustomerAccount("John", "123456", "0902123456", "john@mail.com", "1234567");
    private Booking booking = new Booking(customer, room, "Clean", 1500, "11/09/2020", "15/09/2020", false, true, "Great");

    // Test cases for getters and setters of Booking model, names of test methods are self-explanatory
    @Test
    public void testGetCustomer() {
        Assert.assertEquals("John", booking.getCustomer().getName());
    }

    @Test
    public void testSetCustomer() {
        CustomerAccount customerTest = new CustomerAccount("James", "123456", "0902123456", "john@mail.com", "1234567");
        booking.setCustomer(customerTest);
        Assert.assertEquals("James", booking.getCustomer().getName());
    }

    @Test
    public void testGetRoom() {
        Assert.assertEquals("123", booking.getRoom().getNumber());
    }

    @Test
    public void testSetRoom() {
        Room roomTest = new Room(type, "456", true, false, "1", 1000);
        booking.setRoom(roomTest);
        Assert.assertEquals("456", booking.getRoom().getNumber());
    }

    @Test
    public void testGetRequest() {
        Assert.assertEquals("Clean", booking.getRequest());
    }

    @Test
    public void testSetRequest() {
        booking.setRequest("Unclean");
        Assert.assertEquals("Unclean", booking.getRequest());
    }

    @Test
    public void testGetTotal() {
        Assert.assertEquals(1500, booking.getTotal());
    }

    @Test
    public void testSetTotal() {
        booking.setTotal(1400);
        Assert.assertEquals(1400, booking.getTotal());
    }

    @Test
    public void testGetArrival() {
        Assert.assertEquals("11/09/2020", booking.getArrivalDate());
    }

    @Test
    public void testSetArrival() {
        booking.setArrivalDate("12/09/2020");
        Assert.assertEquals("12/09/2020", booking.getArrivalDate());
    }

    @Test
    public void testGetCheckout() {
        Assert.assertEquals("15/09/2020", booking.getCheckoutDate());
    }

    @Test
    public void testSetCheckout() {
        booking.setCheckoutDate("16/09/2020");
        Assert.assertEquals("16/09/2020", booking.getCheckoutDate());
    }

    @Test
    public void testIsReviewed() {
        Assert.assertEquals(false, booking.isReviewed());
    }

    @Test
    public void testSetReviewed() {
        booking.setReviewed(true);
        Assert.assertEquals(true, booking.isReviewed());
    }

    @Test
    public void testIsAccepted() {
        Assert.assertEquals(true, booking.isAccepted());
    }

    @Test
    public void testSetAccepted() {
        booking.setAccepted(false);
        Assert.assertEquals(false, booking.isAccepted());
    }

    @Test
    public void testGetFeedback() {
        Assert.assertEquals("Great", booking.getFeedback());
    }

    @Test
    public void testSetFeedback() {
        booking.setFeedback("Bad");
        Assert.assertEquals("Bad", booking.getFeedback());
    }
}



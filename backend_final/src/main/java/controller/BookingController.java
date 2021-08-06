package controller;

import model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BookingService;

import java.util.List;

/**
 * BookingController class to provide paths for all the CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    /**
     * Provide path for BookingService's getAllBookings method
     * @return List Returns a list of Booking objects
     */
    @RequestMapping(path = "bookings/all", method = RequestMethod.GET)
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    /**
     * Provide path for BookingService's getBookingByID method
     * @param id The int id of the Booking object to be read
     * @return Booking Returns the object with the matching id
     */
    @RequestMapping(path = "bookings/{id}", method = RequestMethod.GET)
    public Booking getBookingByID(@PathVariable int id) {
        return bookingService.getBookingByID(id);
    }

    /**
     * Provide path for BookingService's deleteBooking method
     * @param id The int id of the Booking object to be deleted
     * @return int Returns the int id of the deleted object
     */
    @RequestMapping(path = "bookings/{id}", method = RequestMethod.DELETE)
    public int deleteBooking(@PathVariable int id) {
        return bookingService.deleteBooking(id);
    }

    /**
     * Provide path for BookingService's saveBooking method
     * @param booking Booking object to be saved in database
     * @return Booking Returns the saved Booking object
     */
    @RequestMapping(path = "bookings", method = RequestMethod.POST)
    public Booking saveBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @RequestMapping(path = "bookings", method = RequestMethod.PUT)
    public Booking updateBooking(@RequestBody Booking booking) {
        return bookingService.updateBooking(booking);
    }

    /**
     * Provide path for BookingService's getBookingByName method
     * @param s The String s to represent the name of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching name attribute
     */
    @RequestMapping(path = "bookings/name", method = RequestMethod.GET)
    public List<Booking> getBookingByName(@RequestParam(required = false) String s){
        return bookingService.getBookingByName(s);
    }

    /**
     * Provide path for BookingService's getBookingByPhone method
     * @param s The String s to represent the phone of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching phone attribute
     */
    @RequestMapping(path = "bookings/phone", method = RequestMethod.GET)
    public List<Booking> getBookingByPhone(@RequestParam(required = false) String s){
        return bookingService.getBookingByPhone(s);
    }

    /**
     * Provide path for BookingService's getBookingByName method
     * @param s The String s to represent the email of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching email attribute
     */
    @RequestMapping(path = "bookings/email", method = RequestMethod.GET)
    public List<Booking> getBookingByEmail(@RequestParam(required = false) String s){
        return bookingService.getBookingByEmail(s);
    }
}

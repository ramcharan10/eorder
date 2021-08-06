package service;

import model.Booking;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Booking service class to handle CRUDs for Booking class
 */
@Transactional
@Service
public class BookingService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a Booking object and save to database
     * @param booking Booking object to be saved in database
     * @return Booking Returns the saved Booking object
     */
    public Booking saveBooking(Booking booking) {
        sessionFactory.getCurrentSession().save(booking);
        return booking;
    }

    /**
     * Update an existing Booking object in the database
     * @param booking Booking object to be updated
     * @return Booking Returns the updated Booking object
     */
    public Booking updateBooking(Booking booking) {
        sessionFactory.getCurrentSession().update(booking);
        return booking;
    }

    /**
     * Delete an existing Booking object by its id
     * @param id The int id of the Booking object to be deleted
     * @return int Returns the int id of the deleted object
     */
    public int deleteBooking(int id) {
        Booking booking = getBookingByID(id);
        sessionFactory.getCurrentSession().delete(booking);
        return id;
    }

    /**
     * Get all Booking objects saved in the database
     * @return List Returns a list of Booking objects
     */
    public List<Booking> getAllBookings() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Booking");
        return query.list();
    }

    /**
     * Get a Booking object saved in the database by its id
     * @param id The int id of the Booking object to be read
     * @return Booking Returns the object with the matching id
     */
    public Booking getBookingByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from Booking where id=:id");
        query.setInteger("id", id);
        return (Booking) query.uniqueResult();
    }

    /**
     * Get all Booking objects saved in the database by their phone attribute
     * @param phone The String phone of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching phone attribute
     */
    public List<Booking> getBookingByPhone(String phone) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Booking b where customer.phone like :phone");
        query.setString("phone", "%"+phone+"%");
        return query.list();
    }

    /**
     * Get all Booking objects saved in the database by their name attribute
     * @param name The String name of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching name attribute
     */
    public List<Booking> getBookingByName(String name) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Booking b where customer.name like :name");
        query.setString("name", "%"+name+"%");
        return query.list();
    }

    /**
     * Get all Booking objects saved in the database by their email attribute
     * @param email The String email of the Booking objects to be read
     * @return List Returns a list of Booking objects with matching email attribute
     */
    public List<Booking> getBookingByEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Booking b where customer.email like :email");
        query.setString("email", "%"+email+"%");
        return query.list();
    }
}

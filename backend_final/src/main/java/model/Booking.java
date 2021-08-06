package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Booking class to record details of each booking
 */
@Entity
@Table(name = "booking")
public class Booking {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // OneToOne relationship with CustomerAccount class
    @OneToOne
    private CustomerAccount customer;

    // OneToOne relationship with Room class
    @OneToOne
    private Room room;

    // Attribute to record other requests of booking
    @Column
    private String request;

    // Int total price of room booking
    @Column
    private int total;

    // String attribute for arrival date
    @Column
    private String arrivalDate;

    // String attribute for checkout date
    @Column
    private String checkoutDate;

    // Status of approval from admin
    @Column
    private boolean isReviewed;

    // Status of acceptance
    @Column
    private boolean isAccepted;

    // String attribute for feedback
    @Column
    private String feedback;


    // Getters and setters for attributes

    public Booking() {
    }

    public Booking(CustomerAccount customer, Room room, String request, int total, String arrivalDate, String checkoutDate, boolean isReviewed, boolean isAccepted, String feedback) {
        this.customer = customer;
        this.room = room;
        this.request = request;
        this.total = total;
        this.arrivalDate = arrivalDate;
        this.checkoutDate = checkoutDate;
        this.isReviewed = isReviewed;
        this.isAccepted = isAccepted;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public CustomerAccount getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerAccount customer) {
        this.customer = customer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public boolean isReviewed() {
        return isReviewed;
    }

    public void setReviewed(boolean reviewed) {
        isReviewed = reviewed;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

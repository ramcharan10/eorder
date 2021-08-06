package model;

import javax.persistence.*;

/**
 * CustomerAccount class to record details for each customer account
 */
@Entity
@Table(name = "customeraccount")
public class CustomerAccount {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // String attribute for name
    @Column
    private String name;

    // String attribute for password
    @Column
    private String password;

    // String attribute for phone
    @Column
    private String phone;

    // String attribute for email
    @Column
    private String email;

    // String attribute for credit card numbers
    @Column
    private String creditCard;

    // Getters and setters for attributes


    public CustomerAccount() {
    }

    public CustomerAccount(String name, String password, String phone, String email, String creditCard) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}

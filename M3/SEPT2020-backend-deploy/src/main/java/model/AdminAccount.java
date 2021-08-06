package model;

import javax.persistence.*;

/**
 * CustomerAccount class to record details for each customer account
 */
@Entity
@Table(name = "adminaccount")
public class AdminAccount {

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

    // Getters and setters for attributes


    public AdminAccount() {
    }

    public AdminAccount(String name, String password, String phone, String email) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
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


}

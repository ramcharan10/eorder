package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Room class to record details for each hotel room
 */
@Entity
@Table(name = "room")
public class Room {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // OneToOne relationship with RoomType class
    @OneToOne
    private RoomType type;

    // String attribute for room number
    @Column
    private String number;

    // Boolean attribute for if wifi is available
    @Column
    private boolean wifi;

    // Boolean attribute for if smoking is allowed
    @Column
    private boolean smoking;

    // String attribute for floor number
    @Column
    private String floor;

    // Int attribute for room price
    @Column
    private int price;

    // Getters and setters


    public Room() {
    }

    public Room(RoomType type, String number, boolean wifi, boolean smoking, String floor, int price) {
        this.type = type;
        this.number = number;
        this.wifi = wifi;
        this.smoking = smoking;
        this.floor = floor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

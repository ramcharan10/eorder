package model;

import javax.persistence.*;

/**
 * RoomType class to record different room types and is referred to in Room class
 */
@Entity
@Table(name = "roomtype")
public class RoomType {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // String attribute for room type's name
    @Column
    private String name;

    // Getters and setters

    public RoomType() {
    }

    public RoomType(String name) {
        this.name = name;
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
}

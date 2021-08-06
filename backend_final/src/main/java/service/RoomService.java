package service;

import model.Room;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * RoomService class to handle CRUDs for Room class
 */
@Transactional
@Service
public class RoomService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a Room object and save to the database
     * @param room The Room object to be saved
     * @return Room Returns the saved Room object
     */
    public Room saveRoom(Room room) {
        sessionFactory.getCurrentSession().save(room);
        return room;
    }

    /**
     * Update an existing Room object in the database
     * @param room The Room object to be saved
     * @return Room Returns the updated Room object
     */
    public Room updateRoom(Room room) {
        sessionFactory.getCurrentSession().update(room);
        return room;
    }

    /**
     * Delete an existing Room object by its id
     * @param id The int id of the Room object to be deleted
     * @return Room Returns the deleted Room object
     */
    public int deleteRoom(int id) {
        Room room = getRoomByID(id);
        sessionFactory.getCurrentSession().delete(room);
        return id;
    }

    /**
     * Get all Room objects saved in the database
     * @return List Returns a list of Room objects
     */
    public List<Room> getAllRooms() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Room");
        return query.list();
    }

    /**
     * Get an existing Room object by its id
     * @param id The int id of the Room object to be read
     * @return Room Returns the Room object with matching id
     */
    public Room getRoomByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from Room where id=:id");
        query.setInteger("id", id);
        return (Room) query.uniqueResult();
    }

    /**
     * Get all existing Room objects by its RoomType's id
     * @param id The int id of the RoomType attribute of the Room object
     * @return List Returns a list of Room objects with matching RoomType's id
     */
    public List<Room> getRoomByType(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Room where type.id=:id");
        query.setInteger("id", id);
        return query.list();
    }

    /**
     * Get all existing Room objects by its wifi's value
     * @param wifi The boolean value of the wifi attribute of the Room object
     * @return List Returns a list of Room objects with matching boolean value
     */
    public List<Room> getRoomByWifi(boolean wifi) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Room where wifi=:wifi");
        query.setBoolean("wifi", wifi);
        return query.list();
    }

    /**
     * Get all existing Room objects by its smoking's value
     * @param smoking The boolean value of the smoking attribute of the Room object
     * @return List Returns a list of Room objects with matching boolean value
     */
    public List<Room> getRoomBySmoking(boolean smoking) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Room where smoking=:smoking");
        query.setBoolean("smoking", smoking);
        return query.list();
    }
}

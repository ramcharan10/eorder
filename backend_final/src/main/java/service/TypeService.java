package service;

import model.RoomType;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TypeService class to handle CRUDs for RoomType class
 */
@Transactional
@Service
public class TypeService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a RoomType object and save to the database
     * @param type The RoomType object to be saved
     * @return RoomType Returns the saved RoomType object
     */
    public RoomType saveRoomType(RoomType type) {
        sessionFactory.getCurrentSession().save(type);
        return type;
    }

    /**
     * Update an existing RoomType object in the database
     * @param type The RoomType object to be saved
     * @return RoomType Returns the updated RoomType object
     */
    public RoomType updateRoomType(RoomType type) {
        sessionFactory.getCurrentSession().update(type);
        return type;
    }

    /**
     * Delete an existing RoomType object by its id
     * @param id The int id of the RoomType object to be deleted
     * @return RoomType Returns the deleted RoomType object
     */
    public int deleteRoomType(int id) {
        RoomType type = getRoomTypeByID(id);
        sessionFactory.getCurrentSession().delete(type);
        return id;
    }

    /**
     * Get all RoomType objects saved in the database
     * @return List Returns a list of RoomType objects
     */
    public List<RoomType> getAllRoomTypes() {
        Query query = sessionFactory.getCurrentSession().createQuery("from RoomType");
        return query.list();
    }

    /**
     * Get an existing RoomType object by its id
     * @param id The int id of the RoomType object to be read
     * @return RoomType Returns the RoomType object with matching id
     */
    public RoomType getRoomTypeByID(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from RoomType where id=:id");
        query.setInteger("id", id);
        return (RoomType) query.uniqueResult();
    }
}

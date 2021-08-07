package controller;

import model.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TypeService;

import java.util.List;

/**
 * TypeController class to provide paths for all CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * Provide path for TypeService's getAllRoomTypes method
     * @return List Returns a list of RoomType objects
     */
    @RequestMapping(path = "roomtypes/all", method = RequestMethod.GET)
    public List<RoomType> getAllRoomTypes() {
        return typeService.getAllRoomTypes();
    }

    /**
     * Provide path for TypeService's getRoomTypeByID method
     * @param id The int id of the RoomType object to be read
     * @return RoomType Returns the RoomType object with matching id
     */
    @RequestMapping(path = "roomtypes/{id}", method = RequestMethod.GET)
    public RoomType getRoomTypeByID(@PathVariable int id) {
        return typeService.getRoomTypeByID(id);
    }

    /**
     * Provide path for TypeService's deleteRoomType method
     * @param id The int id of the RoomType object to be deleted
     * @return RoomType Returns the deleted RoomType object
     */
    @RequestMapping(path = "roomtypes/{id}", method = RequestMethod.DELETE)
    public int deleteRoomType(@PathVariable int id) {
        return typeService.deleteRoomType(id);
    }

    /**
     * Provide path for TypeService's saveRoomType method
     * @param type The RoomType object to be saved
     * @return RoomType Returns the saved RoomType object
     */
    @RequestMapping(path = "roomtypes", method = RequestMethod.POST)
    public RoomType saveRoomType(@RequestBody RoomType type) {
        return typeService.saveRoomType(type);
    }

    /**
     * Provide path for TypeService's updateRoomType method
     * @param type The RoomType object to be saved
     * @return RoomType Returns the updated RoomType object
     */
    @RequestMapping(path = "roomtypes", method = RequestMethod.PUT)
    public RoomType updateRoomType(@RequestBody RoomType type) {
        return typeService.updateRoomType(type);
    }
}

package controller;

import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RoomService;

import java.util.List;

/**
 * RoomController class to provide paths for all CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class RoomController {

    @Autowired
    private RoomService roomService;

    /**
     * Provide path for RoomService's getAllRooms method
     * @return List Returns a list of Room objects
     */
    @RequestMapping(path = "rooms/all", method = RequestMethod.GET)
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    /**
     * Provide path for RoomService's getRoomByID method
     * @param id The int id of the Room object to be read
     * @return Room Returns the Room object with matching id
     */
    @RequestMapping(path = "rooms/{id}", method = RequestMethod.GET)
    public Room getRoomByID(@PathVariable int id) {
        return roomService.getRoomByID(id);
    }

    /**
     * Provide path for RoomService's getRoomByType method
     * @param id The int id of the RoomType attribute of the Room object
     * @return List Returns a list of Room objects with matching RoomType's id
     */
    @RequestMapping(path = "rooms/type/{id}", method = RequestMethod.GET)
    public List<Room> getRoomByType(@PathVariable int id) {
        return roomService.getRoomByType(id);
    }

    /**
     * Provide path for RoomService's getRoomByWifi method
     * @param wifi The boolean value of the wifi attribute of the Room object
     * @return List Returns a list of Room objects with matching boolean value
     */
    @RequestMapping(path = "rooms/wifi/{wifi}", method = RequestMethod.GET)
    public List<Room> getRoomByWifi(@PathVariable boolean wifi) {
        return roomService.getRoomByWifi(wifi);
    }

    /**
     * Provide path for RoomService's getRoomBySmoking method
     * @param smoking The boolean value of the smoking attribute of the Room object
     * @return List Returns a list of Room objects with matching boolean value
     */
    @RequestMapping(path = "rooms/smoking/{smoking}", method = RequestMethod.GET)
    public List<Room> getRoomBySmoking(@PathVariable boolean smoking) {
        return roomService.getRoomBySmoking(smoking);
    }

    /**
     * Provide path for RoomService's deleteRoom method
     * @param id The int id of the Room object to be deleted
     * @return Room Returns the deleted Room object
     */
    @RequestMapping(path = "rooms/{id}", method = RequestMethod.DELETE)
    public int deleteRoom(@PathVariable int id) {
        return roomService.deleteRoom(id);
    }

    /**
     * Provide path for RoomService's saveRoom method
     * @param room The Room object to be saved
     * @return Room Returns the saved Room object
     */
    @RequestMapping(path = "rooms", method = RequestMethod.POST)
    public Room saveRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }

    /**
     * Provide path for RoomService's updateRoom method
     * @param room The Room object to be saved
     * @return Room Returns the updated Room object
     */
    @RequestMapping(path = "rooms", method = RequestMethod.PUT)
    public Room updateRoom(@RequestBody Room room) {
        return roomService.updateRoom(room);
    }
}

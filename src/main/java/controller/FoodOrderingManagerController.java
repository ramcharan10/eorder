package controller;

import model.FoodOrderingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.FoodOrderingManagerService;

import java.util.List;

/**
 * Created by CoT on 7/29/18.
 */
@RestController
@RequestMapping(path = "/")
public class FoodOrderingManagerController {

    @Autowired
    private FoodOrderingManagerService foodOrderingManagerService;

    public FoodOrderingManagerController(FoodOrderingManagerService foodOrderingManagerService) {
        this.foodOrderingManagerService = foodOrderingManagerService;
    }

    @RequestMapping(path = "teachers", method = RequestMethod.GET)
    public List<FoodOrderingManager> getAllTeachers(){
        return foodOrderingManagerService.getAllFoodOrderingManagers();
    }

    @RequestMapping(path = "teachers", method = RequestMethod.POST)
    public void saveTeacher(@RequestBody FoodOrderingManager foodOrderingManager){
        foodOrderingManagerService.saveFoodOrderingManager(foodOrderingManager);
    }

    @RequestMapping(path = "teachers/{id}", method = RequestMethod.DELETE)
    public void saveFoodOrderingManager(@PathVariable int id){
        foodOrderingManagerService.deleteFoodOrderingManager(id);
    }
}

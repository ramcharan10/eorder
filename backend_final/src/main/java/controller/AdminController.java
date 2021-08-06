package controller;

import model.AdminAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AdminService;

import java.util.List;

/**
 * CustomerController class to provide paths for all the CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * Provide path for AdminService's getAllAdminAccounts method
     * @return List Returns a list of all AdminAccount objects saved in the database
     */
    @RequestMapping(path = "adminaccounts/all", method = RequestMethod.GET)
    public List<AdminAccount> getAllAdminAccounts() {
        return adminService.getAllAdminAccounts();
    }

    /**
     * Provide path for AdminService's getAdminAccountByID method
     * @param id The int id of the AdminAccount object to be read
     * @return AdminAccount Returns the AdminAccount object with the matching id
     */
    @RequestMapping(path = "adminaccounts/{id}", method = RequestMethod.GET)
    public AdminAccount getAdminAccountByID(@PathVariable int id) {
        return adminService.getAdminAccountByID(id);
    }

    /**
     * Provide path for AdminService's deleteAdminAccount method
     * @param id The int id of the AdminAccount to be deleted
     * @return int Returns the id of the deleted AdminAccount object
     */
    @RequestMapping(path = "adminaccounts/{id}", method = RequestMethod.DELETE)
    public int deleteAdminAccount(@PathVariable int id) {
        return adminService.deleteAdminAccount(id);
    }

    /**
     * Provide path for AdminService's saveAdminAccount method
     * @param account The AdminAccount object to be saved in the database
     * @return AdminAccount Returns the saved AdminAccount object
     */
    @RequestMapping(path = "adminaccounts", method = RequestMethod.POST)
    public AdminAccount saveAdminAccount(@RequestBody AdminAccount account) {
        return adminService.saveAdminAccount(account);
    }

    /**
     * Provide path for AdminService's updateAdminAccount method
     * @param account The existing AdminAccount to be updated
     * @return AdminAccount Returns the updated AdminAccount object
     */
    @RequestMapping(path = "adminaccounts", method = RequestMethod.PUT)
    public AdminAccount updateAdminAccount(@RequestBody AdminAccount account) {
        return adminService.updateAdminAccount(account);
    }
}

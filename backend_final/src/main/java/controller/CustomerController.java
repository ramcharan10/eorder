package controller;

import model.CustomerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;

/**
 * CustomerController class to provide paths for all the CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * Provide path for CustomerService's getAllCustomerAccounts method
     * @return List Returns a list of all CustomerAccount objects saved in the database
     */
    @RequestMapping(path = "customeraccounts/all", method = RequestMethod.GET)
    public List<CustomerAccount> getAllCustomerAccounts() {
        return customerService.getAllCustomerAccounts();
    }

    /**
     * Provide path for CustomerService's getCustomerAccountByID method
     * @param id The int id of the CustomerAccount object to be read
     * @return CustomerAccount Returns the CustomerAccount object with the matching id
     */
    @RequestMapping(path = "customeraccounts/{id}", method = RequestMethod.GET)
    public CustomerAccount getCustomerAccountByID(@PathVariable int id) {
        return customerService.getCustomerAccountByID(id);
    }

    /**
     * Provide path for CustomerService's deleteCustomerAccount method
     * @param id The int id of the CustomerAccount to be deleted
     * @return int Returns the id of the deleted CustomerAccount object
     */
    @RequestMapping(path = "customeraccounts/{id}", method = RequestMethod.DELETE)
    public int deleteCustomerAccount(@PathVariable int id) {
        return customerService.deleteCustomerAccount(id);
    }

    /**
     * Provide path for CustomerService's saveCustomerAccount method
     * @param account The CustomerAccount object to be saved in the database
     * @return CustomerAccount Returns the saved CustomerAccount object
     */
    @RequestMapping(path = "customeraccounts", method = RequestMethod.POST)
    public CustomerAccount saveCustomerAccount(@RequestBody CustomerAccount account) {
        return customerService.saveCustomerAccount(account);
    }

    /**
     * Provide path for CustomerService's updateCustomerAccount method
     * @param account The existing CustomerAccount to be updated
     * @return CustomerAccount Returns the updated CustomerAccount object
     */
    @RequestMapping(path = "customeraccounts", method = RequestMethod.PUT)
    public CustomerAccount updateCustomerAccount(@RequestBody CustomerAccount account) {
        return customerService.updateCustomerAccount(account);
    }
}

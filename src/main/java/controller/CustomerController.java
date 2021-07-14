package controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;

/**
 * Created by CoT on 7/29/18.
 */
@RestController
@RequestMapping(path = "/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(path = "students", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(path = "students", method = RequestMethod.POST)
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }


    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void saveCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }


}

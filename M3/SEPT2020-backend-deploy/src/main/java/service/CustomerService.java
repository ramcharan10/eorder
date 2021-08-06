package service;

import model.CustomerAccount;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * CustomerService class to handle CRUDs for CustomerAccount class
 */
@Transactional
@Service
public class CustomerService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a CustomerAccount object and save to database
     * @param account The CustomerAccount object to be saved in the database
     * @return CustomerAccount Returns the saved CustomerAccount object
     */
    public CustomerAccount saveCustomerAccount(CustomerAccount account) {
        sessionFactory.getCurrentSession().save(account);
        return account;
    }

    /**
     * Update an existing CustomerAccount in the database
     * @param account The existing CustomerAccount to be updated
     * @return CustomerAccount Returns the updated CustomerAccount object
     */
    public CustomerAccount updateCustomerAccount(CustomerAccount account) {
        sessionFactory.getCurrentSession().update(account);
        return account;
    }

    /**
     * Delete an existing CustomerAccount object saved in the database by its id
     * @param id The int id of the CustomerAccount to be deleted
     * @return int Returns the id of the deleted CustomerAccount object
     */
    public int deleteCustomerAccount(int id) {
        CustomerAccount account = getCustomerAccountByID(id);
        sessionFactory.getCurrentSession().delete(account);
        return id;
    }

    /**
     * Get all CustomerAccount objects saved in the database
     * @return List Returns a list of all CustomerAccount objects saved in the database
     */
    public List<CustomerAccount> getAllCustomerAccounts() {
        Query query = sessionFactory.getCurrentSession().createQuery("from CustomerAccount");
        return query.list();
    }

    /**
     * Get a CustomerAccount object saved in the database by its id
     * @param id The int id of the CustomerAccount object to be read
     * @return CustomerAccount Returns the CustomerAccount object with the matching id
     */
    public CustomerAccount getCustomerAccountByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from CustomerAccount where id=:id");
        query.setInteger("id", id);
        return (CustomerAccount) query.uniqueResult();
    }

}

package service;

import model.AdminAccount;
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
public class AdminService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a AdminAccount object and save to database
     * @param account The AdminAccount object to be saved in the database
     * @return AdminAccount Returns the saved AdminAccount object
     */
    public AdminAccount saveAdminAccount(AdminAccount account) {
        sessionFactory.getCurrentSession().save(account);
        return account;
    }

    /**
     * Update an existing AdminAccount in the database
     * @param account The existing AdminAccount to be updated
     * @return AdminAccount Returns the updated AdminAccount object
     */
    public AdminAccount updateAdminAccount(AdminAccount account) {
        sessionFactory.getCurrentSession().update(account);
        return account;
    }

    /**
     * Delete an existing CustomerAccount object saved in the database by its id
     * @param id The int id of the CustomerAccount to be deleted
     * @return int Returns the id of the deleted CustomerAccount object
     */
    public int deleteAdminAccount(int id) {
        AdminAccount account = getAdminAccountByID(id);
        sessionFactory.getCurrentSession().delete(account);
        return id;
    }

    /**
     * Get all CustomerAccount objects saved in the database
     * @return List Returns a list of all CustomerAccount objects saved in the database
     */
    public List<AdminAccount> getAllAdminAccounts() {
        Query query = sessionFactory.getCurrentSession().createQuery("from AdminAccount");
        return query.list();
    }

    /**
     * Get a CustomerAccount object saved in the database by its id
     * @param id The int id of the CustomerAccount object to be read
     * @return CustomerAccount Returns the CustomerAccount object with the matching id
     */
    public AdminAccount getAdminAccountByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from AdminAccount where id=:id");
        query.setInteger("id", id);
        return (AdminAccount) query.uniqueResult();
    }

}

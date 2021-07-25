package service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.ShoppingDetail;


@Transactional
@Service
public class DetailService {
	@Autowired
    private SessionFactory sessionFactory;

    public ShoppingDetail saveShoppingDetail(ShoppingDetail shoppingdetail) {
        sessionFactory.getCurrentSession().save(shoppingdetail);
        return shoppingdetail;
    }

    public ShoppingDetail updateShoppingDetail(ShoppingDetail shoppingdetail) {
        sessionFactory.getCurrentSession().update(shoppingdetail);
        return shoppingdetail;
    }

    public int deleteShoppingDetail(int id) {
    	ShoppingDetail shoppingdetail = getShoppingDetailByID(id);
        sessionFactory.getCurrentSession().delete(shoppingdetail);
        return id;
    }

    public List<ShoppingDetail> getAllShoppingDetail() {
        Query query = sessionFactory.getCurrentSession().createQuery("from ShoppingDetail");
        return query.list();
    }

    public ShoppingDetail getShoppingDetailByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from ShoppingDetail where id=:id");
        query.setInteger("id", id);
        return (ShoppingDetail) query.uniqueResult();
    }

}
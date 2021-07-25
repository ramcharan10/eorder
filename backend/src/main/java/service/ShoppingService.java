package service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.ShoppingCart;


@Transactional
@Service
public class ShoppingService {
	@Autowired
    private SessionFactory sessionFactory;

    public ShoppingCart saveShoppingCart(ShoppingCart shoppingcart) {
        sessionFactory.getCurrentSession().save(shoppingcart);
        return shoppingcart;
    }

    public ShoppingCart updateShoppingCart(ShoppingCart shoppingcart) {
        sessionFactory.getCurrentSession().update(shoppingcart);
        return shoppingcart;
    }

    public int deleteShoppingCart(int id) {
    	ShoppingCart shoppingcart = getShoppingCartByID(id);
        sessionFactory.getCurrentSession().delete(shoppingcart);
        return id;
    }

    public List<ShoppingCart> getAllShoppingCart() {
        Query query = sessionFactory.getCurrentSession().createQuery("from ShoppingCart");
        return query.list();
    }

    public ShoppingCart getShoppingCartByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from ShoppingCart where id=:id");
        query.setInteger("id", id);
        return (ShoppingCart) query.uniqueResult();
    }

}

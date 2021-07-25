package service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.ProductList;


@Transactional
@Service
public class ProductService {
	@Autowired
    private SessionFactory sessionFactory;

    public ProductList saveProductList(ProductList product) {
        sessionFactory.getCurrentSession().save(product);
        return product;
    }

    public ProductList updateProductList(ProductList product) {
        sessionFactory.getCurrentSession().update(product);
        return product;
    }

    public int deleteProductList(int id) {
    	ProductList product = getProductListByID(id);
        sessionFactory.getCurrentSession().delete(product);
        return id;
    }

    public List<ProductList> getAllProductList() {
        Query query = sessionFactory.getCurrentSession().createQuery("from ProductList");
        return query.list();
    }

    public ProductList getProductListByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from ProductList where id=:id");
        query.setInteger("id", id);
        return (ProductList) query.uniqueResult();
    }

}

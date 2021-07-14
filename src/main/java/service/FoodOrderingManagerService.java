package service;

import model.FoodOrderingManager;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FoodOrderingManagerService {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveFoodOrderingManager(FoodOrderingManager foodOrderingManager){
        sessionFactory.getCurrentSession().save(foodOrderingManager);
    }

    public FoodOrderingManager getTeacher(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from Teacher where id=:id");
        query.setInteger("id", id);
        return (FoodOrderingManager) query.uniqueResult();
    }


    public List<FoodOrderingManager> getAllFoodOrderingManagers(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Food Ordering Manager");
        return query.list();
    }

    public List<FoodOrderingManager> findFoodOrderingManagers(String name){
       Query query = sessionFactory.getCurrentSession().createQuery("from Food Ordering Manager s where s.name like :name");
       query.setString("name", "%"+name+"%");
       return query.list();
    }


    public void deleteFoodOrderingManager(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from Food Ordering Manager where id=:id");
        query.setInteger("id", id);
        FoodOrderingManager foodOrderingManager = (FoodOrderingManager) query.uniqueResult();
        sessionFactory.getCurrentSession().delete(foodOrderingManager);
    }

}

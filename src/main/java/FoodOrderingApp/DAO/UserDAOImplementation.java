package FoodOrderingApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import FoodOrderingApp.model.UserDetail;

@Repository("userDAO")
@Transactional
public class UserDAOImplementation implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean registerUser(UserDetail user) {
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean updateUser(UserDetail user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public UserDetail getUser(String username) {
		Session session = sessionFactory.openSession();
		
		UserDetail userDetail = (UserDetail) session.get(UserDetail.class, username);
		session.close();
		return userDetail;
	}

}

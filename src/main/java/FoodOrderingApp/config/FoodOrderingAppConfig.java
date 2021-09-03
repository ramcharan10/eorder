package FoodOrderingApp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import FoodOrderingApp.model.Category;
import FoodOrderingApp.model.Product;
import FoodOrderingApp.model.Supplier;
import FoodOrderingApp.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("foodorderingapp")

public class FoodOrderingAppConfig {

	@Bean(name="dataSource")
	
	public DataSource getPostgresDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/foodorderingapp");
		dataSource.setUsername("postgres");
		dataSource.setPassword("6513002363");
		
		System.out.println("--------DataSource Object is Created.--------");
		
		
		
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	
	public SessionFactory getSessionFactory() {
		
		Properties hibernateProp = new Properties();
		
		hibernateProp.put("hibernate.hdm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder localFactory = new LocalSessionFactoryBuilder(getPostgresDataSource());
		
		localFactory.addProperties(hibernateProp);
		
		localFactory.addAnnotatedClass(Category.class);
		localFactory.addAnnotatedClass(Product.class);
		localFactory.addAnnotatedClass(Supplier.class);
		localFactory.addAnnotatedClass(UserDetail.class);
		
		System.out.println("--------SessionFactory Object is Created.--------");
		
		return localFactory.buildSessionFactory();
		
	}
	
	@Bean(name="txManager")
	
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 
	{
		System.out.println("--------TransactionManager Object is Created.--------");
		return new HibernateTransactionManager(sessionFactory);
	}		

}

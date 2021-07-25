package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "shoppingcart")

public class ShoppingCart {
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@OneToOne
    private CustomerAccount username;
	
	@OneToMany(mappedBy = "shoppingcart", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ShoppingDetail> shoppingDetails;

    
	public List<ShoppingDetail> getShoppingDetails(){
		return shoppingDetails;
	}
	
	public void setShoppingDetails( List<ShoppingDetail> shoppingDetails) {
        this.shoppingDetails = shoppingDetails;
    }
	
	public ShoppingCart() {
		
	}
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerAccount getCustomerAccount() {
        return username;
    }

    public void setCustomerAccount(CustomerAccount username) {
        this.username = username;
    }
}

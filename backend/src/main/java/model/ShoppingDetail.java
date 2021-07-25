package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "shoppingdetail")

public class ShoppingDetail {
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	public ShoppingDetail() {
	}
	
	@ManyToOne
    @JsonIgnore
    private ShoppingCart shoppingcart;
	
	@ManyToOne
	private ProductList name;
	
	 @Column
	 private int quantity;
	 
	 @ManyToOne
	 private ProductList price;
	 
	 public int getId() {
	        return id;
	    }

	 public void setId(int id) {
	        this.id = id;
	    }

	 public ShoppingCart getShoppingCart() {
	        return shoppingcart;
	    }

	 public void setShoppingCart(ShoppingCart shoppingcart) {
	        this.shoppingcart = shoppingcart;
	    }
	 
	 public ProductList getProductList() {
	        return name;
	    }

	 public void setProductList(ProductList name, ProductList price) {
	        this.name = name;
	        this.price = price;
	        
	    }
	 
	 public int getQuantity() {
	        return quantity;
	    }

	 public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
}

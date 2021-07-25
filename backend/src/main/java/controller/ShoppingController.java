package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.ShoppingCart;
import service.ShoppingService;
@CrossOrigin
@RestController
@RequestMapping(path = "/")

public class ShoppingController {
	 @Autowired
	    private ShoppingService shoppingService;
	    
	    @RequestMapping(path = "shoppingcart/all", method = RequestMethod.GET)
	    public List<ShoppingCart> getAllShoppingCart() {
	        return shoppingService.getAllShoppingCart();
	    }

	    @RequestMapping(path = "shoppingcart/{id}", method = RequestMethod.GET)
	    public ShoppingCart getShoppingCartByID(@PathVariable int id) {
	        return shoppingService.getShoppingCartByID(id);
	    }

	    @RequestMapping(path = "shoppingcart/{id}", method = RequestMethod.DELETE)
	    public int deleteShoppingCart(@PathVariable int id) {
	        return shoppingService.deleteShoppingCart(id);
	    }

	    @RequestMapping(path = "shoppingcart", method = RequestMethod.POST)
	    public ShoppingCart saveShoppingCart(@RequestBody ShoppingCart shoppingcart) {
	        return shoppingService.saveShoppingCart(shoppingcart);
	    }

	    @RequestMapping(path = "shoppingcart", method = RequestMethod.PUT)
	    public ShoppingCart updateShoppingCart(@RequestBody ShoppingCart shoppingcart) {
	        return shoppingService.updateShoppingCart(shoppingcart);
	    }
}

package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.ShoppingDetail;
import service.DetailService;
@CrossOrigin
@RestController
@RequestMapping(path = "/")

public class DetailController {
	 @Autowired
	    private DetailService detailService;
	    
	    @RequestMapping(path = "shoppingdetail/all", method = RequestMethod.GET)
	    public List<ShoppingDetail> getAllShoppingDetail() {
	        return detailService.getAllShoppingDetail();
	    }

	    @RequestMapping(path = "shoppingdetail/{id}", method = RequestMethod.GET)
	    public ShoppingDetail getShoppingDetailByID(@PathVariable int id) {
	        return detailService.getShoppingDetailByID(id);
	    }

	    @RequestMapping(path = "shoppingdetail/{id}", method = RequestMethod.DELETE)
	    public int deleteShoppingDetail(@PathVariable int id) {
	        return detailService.deleteShoppingDetail(id);
	    }

	    @RequestMapping(path = "shoppingdetail", method = RequestMethod.POST)
	    public ShoppingDetail saveShoppingDetail(@RequestBody ShoppingDetail shoppingdetail) {
	        return detailService.saveShoppingDetail(shoppingdetail);
	    }

	    @RequestMapping(path = "shoppingdetail", method = RequestMethod.PUT)
	    public ShoppingDetail updateShoppingDetail(@RequestBody ShoppingDetail shoppingdetail) {
	        return detailService.updateShoppingDetail(shoppingdetail);
	    }
}

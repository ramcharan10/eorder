package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.ProductList;
import service.ProductService;
@CrossOrigin
@RestController
@RequestMapping(path = "/")

public class ProductController {
	 @Autowired
	    private ProductService productService;
	    
	    @RequestMapping(path = "productlist/all", method = RequestMethod.GET)
	    public List<ProductList> getAllProductList() {
	        return productService.getAllProductList();
	    }

	    @RequestMapping(path = "productlist/{id}", method = RequestMethod.GET)
	    public ProductList getProductListByID(@PathVariable int id) {
	        return productService.getProductListByID(id);
	    }

	    @RequestMapping(path = "productlist/{id}", method = RequestMethod.DELETE)
	    public int deleteProductList(@PathVariable int id) {
	        return productService.deleteProductList(id);
	    }

	    @RequestMapping(path = "productlist", method = RequestMethod.POST)
	    public ProductList saveProductList(@RequestBody ProductList product) {
	        return productService.saveProductList(product);
	    }

	    @RequestMapping(path = "productlist", method = RequestMethod.PUT)
	    public ProductList updateProductList(@RequestBody ProductList product) {
	        return productService.updateProductList(product);
	    }
}

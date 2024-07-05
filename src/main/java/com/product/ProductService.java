  package com.product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ProductService {
	@Autowired
ProductDB db;
	
	
	  public void addProduct(Product p)
	  {
		  // products.add(p)
            db.save(p); }
	   
	 
 
	public List<Product> getAllproducts() {
		
		return db.findAll();
	}

	
	  public Product getProduct(String name) {
		  return db.findByName(name);
	  }
	
	
}

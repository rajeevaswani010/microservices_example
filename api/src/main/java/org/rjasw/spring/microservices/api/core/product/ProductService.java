package org.rjasw.spring.microservices.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {	

	  /**
	   * Sample usage: "curl $HOST:$PORT/product?productId=1".
	   *
	   * @param productId Id of the product
	   * @return the recommendations of the product
	   */

	@GetMapping(
		value = "/product/{productId}",
		produces = "application/json")
	Product getProduct(@PathVariable int productId);
	
}

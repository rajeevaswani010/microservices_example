package org.rjasw.spring.microservices.api.core.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {

	public Product() {
		productId = 0;
		name = null;
		weight = 0;
		serviceAddress = null;
	}

	private final int productId;
	private final String name;
	private final int weight;
	private final String serviceAddress;
	
}

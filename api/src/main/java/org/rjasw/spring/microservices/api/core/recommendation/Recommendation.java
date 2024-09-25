package org.rjasw.spring.microservices.api.core.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Recommendation {

	
	public Recommendation() {
		productId = 0;
		recommendationId = 0;
		author = null;
		rate = 0;
		content = null;
		serviceAddress = null;
	}
	
  private final int productId;
  private final int recommendationId;
  private final String author;
  private final int rate;
  private final String content;
  private final String serviceAddress;

}

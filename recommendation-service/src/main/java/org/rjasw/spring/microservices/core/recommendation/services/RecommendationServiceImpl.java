package org.rjasw.spring.microservices.core.recommendation.services;

import java.util.ArrayList;
import java.util.List;

import org.rjasw.spring.microservices.api.core.recommendation.Recommendation;
import org.rjasw.spring.microservices.api.core.recommendation.RecommendationService;
import org.rjasw.spring.microservices.api.exceptions.InvalidInputException;
import org.rjasw.spring.microservices.util.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RecommendationServiceImpl implements RecommendationService {

  private final ServiceUtil serviceUtil;

  @Autowired
  public RecommendationServiceImpl(ServiceUtil serviceUtil) {
    this.serviceUtil = serviceUtil;
  }

  @Override
  public List<Recommendation> getRecommendations(int productId) {

    if (productId < 1) {
      throw new InvalidInputException("Invalid productId: " + productId);
    }

    if (productId == 113) {
      log.debug("No recommendations found for productId: {}", productId);
      return new ArrayList<>();
    }

    List<Recommendation> list = new ArrayList<>();
    list.add(new Recommendation(productId, 1, "Author 1", 1, "Content 1", serviceUtil.getServiceAddress()));
    list.add(new Recommendation(productId, 2, "Author 2", 2, "Content 2", serviceUtil.getServiceAddress()));
    list.add(new Recommendation(productId, 3, "Author 3", 3, "Content 3", serviceUtil.getServiceAddress()));

    log.debug("/recommendation response size: {}", list.size());

    return list;
  }
}

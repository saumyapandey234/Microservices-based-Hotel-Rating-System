package com.Rating.Service.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Rating.Service.Entities.Rating;

public interface RatingRepo extends MongoRepository<Rating, String> {

  // custom finder method
  java.util.List<Rating> findByUserId(String userId);

  java.util.List<Rating> findByHotelId(String hotelId);

}

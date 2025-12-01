package com.Rating.Service.Service;

import java.util.List;

import com.Rating.Service.Entities.Rating;

public interface RatingService {

  // create rating
  Rating createRating(Rating rating);

  // get all ratings
  List<Rating> getAllRatings();

  // get ratings by userId
  List<Rating> getRatingsByUserId(String userId);

  // get ratings by hotelId
  List<Rating> getRatingsByHotelId(String hotelId);

}

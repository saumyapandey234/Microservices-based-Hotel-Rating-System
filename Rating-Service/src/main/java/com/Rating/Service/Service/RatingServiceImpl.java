package com.Rating.Service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rating.Service.Entities.Rating;
import com.Rating.Service.Repo.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService {

  @Autowired
  private RatingRepo ratingRepo;

  @Override
  public Rating createRating(Rating rating) {
    return ratingRepo.save(rating);
  }

  @Override
  public List<Rating> getAllRatings() {
    return ratingRepo.findAll();
  }

  @Override
  public List<Rating> getRatingsByUserId(String userId) {
    return ratingRepo.findByUserId(userId);
  }

  @Override
  public List<Rating> getRatingsByHotelId(String hotelId) {
    return ratingRepo.findByHotelId(hotelId);
  }

}

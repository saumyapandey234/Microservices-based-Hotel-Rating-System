package com.Rating.Service.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rating.Service.Entities.Rating;
import com.Rating.Service.Service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingControllers {

  @Autowired
  private RatingService ratingService;

  // endpoints will be added here
  // create rating
  @PostMapping
  public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
    Rating createdRating = ratingService.createRating(rating);
    return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
  }

  // get all ratings
  @GetMapping
  public ResponseEntity<java.util.List<Rating>> getAllRatings() {
    java.util.List<Rating> ratings = ratingService.getAllRatings();
    return new ResponseEntity<>(ratings, HttpStatus.OK);
  }

  // get ratings by userId
  @GetMapping("/users/{userId}")
  public ResponseEntity<java.util.List<Rating>> getRatingsByUserId(
      @org.springframework.web.bind.annotation.PathVariable String userId) {
    java.util.List<Rating> ratings = ratingService.getRatingsByUserId(userId);
    return new ResponseEntity<>(ratings, HttpStatus.OK);
  }

  // get ratings by hotelId
  @GetMapping("/hotels/{hotelId}")
  public ResponseEntity<java.util.List<Rating>> getRatingsByHotelId(
      @org.springframework.web.bind.annotation.PathVariable String hotelId) {
    java.util.List<Rating> ratings = ratingService.getRatingsByHotelId(hotelId);
    return new ResponseEntity<>(ratings, HttpStatus.OK);
  }

}

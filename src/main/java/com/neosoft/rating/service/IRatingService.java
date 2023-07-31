package com.neosoft.rating.service;

import com.neosoft.rating.entity.Rating;

import java.util.List;

public interface IRatingService {


Rating saveRating(Rating rating);

List<Rating>  getRatings();

List<Rating>  getRatingByUserId(String userId);

List<Rating>  getRatingByHotelId(String hotelId);



}

package com.neosoft.rating.service;


import com.neosoft.rating.entity.Rating;
import com.neosoft.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RatingServiceImpl implements IRatingService{


    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Rating saveRating(Rating rating) {
        return  ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}

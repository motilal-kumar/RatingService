package com.neosoft.rating.controller;


import com.neosoft.rating.entity.Rating;
import com.neosoft.rating.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private IRatingService ratingService;



    @PostMapping("/save-rating")
    public ResponseEntity<Rating>    saveRating(@RequestBody  Rating rating){

        Rating  ratingDetails = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingDetails);
    }



    @GetMapping("/all-ratings")
    public ResponseEntity<List<Rating>>  getAllRating(){

        List<Rating>  ratingList = ratingService.getRatings();

        return ResponseEntity.ok(ratingList);

    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>>   getRatingByUserId(@PathVariable String userId){

        List<Rating> ratingList = ratingService.getRatingByUserId(userId);

        return ResponseEntity.ok(ratingList);

    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>   getRatingByHotelId(@PathVariable String hotelId){

        List<Rating> ratingList = ratingService.getRatingByHotelId(hotelId);

        return ResponseEntity.ok(ratingList);

    }


}

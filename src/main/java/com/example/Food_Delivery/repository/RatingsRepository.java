package com.example.Food_Delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Food_Delivery.model.Rating;

@Repository
public interface RatingsRepository extends JpaRepository<Rating,Integer> {

}

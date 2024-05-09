package com.YumFusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YumFusion.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}

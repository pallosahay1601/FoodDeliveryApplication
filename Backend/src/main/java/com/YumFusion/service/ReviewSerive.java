package com.YumFusion.service;

import java.util.List;

import com.YumFusion.Exception.ReviewException;
import com.YumFusion.model.Review;
import com.YumFusion.model.User;
import com.YumFusion.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}

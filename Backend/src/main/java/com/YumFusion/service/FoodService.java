package com.YumFusion.service;

import java.util.List;

import com.YumFusion.Exception.FoodException;
import com.YumFusion.Exception.RestaurantException;
import com.YumFusion.model.Category;
import com.YumFusion.model.Food;
import com.YumFusion.model.Restaurant;
import com.YumFusion.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}

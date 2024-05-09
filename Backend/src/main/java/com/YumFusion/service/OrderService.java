package com.YumFusion.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.YumFusion.Exception.CartException;
import com.YumFusion.Exception.OrderException;
import com.YumFusion.Exception.RestaurantException;
import com.YumFusion.Exception.UserException;
import com.YumFusion.model.Order;
import com.YumFusion.model.PaymentResponse;
import com.YumFusion.model.User;
import com.YumFusion.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}

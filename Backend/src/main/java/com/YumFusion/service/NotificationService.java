package com.YumFusion.service;

import java.util.List;

import com.YumFusion.model.Notification;
import com.YumFusion.model.Order;
import com.YumFusion.model.Restaurant;
import com.YumFusion.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}

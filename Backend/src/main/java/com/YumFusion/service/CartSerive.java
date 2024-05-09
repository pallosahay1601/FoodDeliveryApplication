package com.YumFusion.service;

import com.YumFusion.Exception.CartException;
import com.YumFusion.Exception.CartItemException;
import com.YumFusion.Exception.FoodException;
import com.YumFusion.Exception.UserException;
import com.YumFusion.model.Cart;
import com.YumFusion.model.CartItem;
import com.YumFusion.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}

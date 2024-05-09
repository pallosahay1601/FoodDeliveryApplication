package com.YumFusion.service;

import com.stripe.exception.StripeException;
import com.YumFusion.model.Order;
import com.YumFusion.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}

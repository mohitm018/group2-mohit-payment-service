package com.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.entities.PaymentDto;

public interface PaymentService {

	ResponseEntity<PaymentDto> processPayment(PaymentDto dto);
	
}

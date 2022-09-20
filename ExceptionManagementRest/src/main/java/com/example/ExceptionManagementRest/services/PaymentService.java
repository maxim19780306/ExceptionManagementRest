package com.example.ExceptionManagementRest.services;

import com.example.ExceptionManagementRest.exceptions.NotEnoughMoneyException;
import com.example.ExceptionManagementRest.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}

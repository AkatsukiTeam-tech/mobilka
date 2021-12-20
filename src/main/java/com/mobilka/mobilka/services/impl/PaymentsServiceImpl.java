package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Payments;
import com.mobilka.mobilka.repositories.PaymentRepository;
import com.mobilka.mobilka.services.PaymentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsServices {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payments> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payments addPayment(Payments payments) {
        return paymentRepository.save(payments);
    }

    @Override
    public Payments getPayment(Long id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    public Payments editPayment(Payments payments) {
        return paymentRepository.save(payments);
    }

    @Override
    public void deletePayment(Payments payments) {
        paymentRepository.delete(payments);
    }
}

package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Genres;
import com.mobilka.mobilka.entities.Payments;

import java.util.List;

public interface PaymentsServices {

    List<Payments> getAllPayments();
    Payments addPayment(Payments payments);
    Payments getPayment(Long id);
    Payments editPayment(Payments payments);
    void deletePayment(Payments payments);
}

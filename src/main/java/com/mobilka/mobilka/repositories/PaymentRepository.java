package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments, Long> {
}

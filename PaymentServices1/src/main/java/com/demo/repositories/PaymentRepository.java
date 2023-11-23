package com.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long>{

}

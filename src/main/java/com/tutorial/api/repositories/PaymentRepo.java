package com.tutorial.api.repositories;

import com.tutorial.api.modules.Payment;
import com.tutorial.api.modules.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
    @Query(value = "SELECT p.status from payments p INNER JOIN students ON students.id = p.students_id", nativeQuery = true)
    Boolean getPaymentStatus(Student student);
}
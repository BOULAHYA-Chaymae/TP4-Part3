package ma.enset.tp4part3.repository;

import ma.enset.tp4part3.entities.Payment;
import ma.enset.tp4part3.entities.PaymentStatus;
import ma.enset.tp4part3.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    List<Payment> findByStudentCode(String code);
    List<Payment>findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);

}

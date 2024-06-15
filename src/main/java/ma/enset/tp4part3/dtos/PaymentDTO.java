package ma.enset.tp4part3.dtos;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.tp4part3.entities.PaymentStatus;
import ma.enset.tp4part3.entities.PaymentType;
import ma.enset.tp4part3.entities.Student;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor  @Getter @Setter @ToString  @Builder
public class PaymentDTO {
    private long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}

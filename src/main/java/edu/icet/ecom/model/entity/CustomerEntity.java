package edu.icet.ecom.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table
public class CustomerEntity {
    private String customerName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerID;
    private String address;
}

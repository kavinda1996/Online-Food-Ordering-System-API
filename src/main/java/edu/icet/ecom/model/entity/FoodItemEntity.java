package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class FoodItemEntity {
    @Id
    private String foodID;
    private String foodName;
    private double price;
    private int stock;
    private LocalDate expiryDate;
}

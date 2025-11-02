package edu.icet.ecom.model.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {
    private String foodName;
    private String foodID;
    private double price;
    private int stock;
    private LocalDate expiryDate;
}

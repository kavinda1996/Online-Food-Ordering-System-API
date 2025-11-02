package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private String orderID;
    private String foodID;
    private int qty;
    private double price;
}

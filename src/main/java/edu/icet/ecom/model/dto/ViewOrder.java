package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ViewOrder {
    private String orderID;
    private String customerID;
    private String foodName;
    private double price;
}

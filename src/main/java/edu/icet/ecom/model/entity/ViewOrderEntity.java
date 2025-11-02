package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderDetail")
public class ViewOrderEntity {
    @Id
    private String orderID;
    private String customerID;
    private String foodName;
    private double price;
}

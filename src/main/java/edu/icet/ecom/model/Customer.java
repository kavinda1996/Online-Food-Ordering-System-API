package edu.icet.ecom.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Customer {
   private String customerName;
   private String customerID;
   private String address;

}

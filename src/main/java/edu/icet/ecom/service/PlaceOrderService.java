package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CartItem;

public interface PlaceOrderService {
    void addOrder(CartItem order);
}

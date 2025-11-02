package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.CartItem;
import edu.icet.ecom.model.entity.FoodItemEntity;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.PlaceOrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class PlaceOrderServiceImpl implements PlaceOrderService {
    final OrderRepository repository;
    final ModelMapper mapper;
    @Override
    public void addOrder(CartItem order) {
        repository.save(mapper.map(order, FoodItemEntity.class));
    }
}

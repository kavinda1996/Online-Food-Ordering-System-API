package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.FoodItem;


import edu.icet.ecom.model.entity.FoodItemEntity;
import edu.icet.ecom.repository.FoodItemRepository;
import edu.icet.ecom.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodItemServiceImpl implements FoodItemService {
    final FoodItemRepository repository;
    final ModelMapper mapper;
    @Override
    public void addFoodItem(FoodItem foodItem) {
        repository.save(mapper.map(foodItem, FoodItemEntity.class));
    }
}

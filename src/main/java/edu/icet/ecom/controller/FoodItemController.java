package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.Customer;
import edu.icet.ecom.model.dto.FoodItem;
import edu.icet.ecom.service.CustomerService;
import edu.icet.ecom.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/foodItem")
public class FoodItemController {
    final FoodItemService service;
    @PostMapping("/add")
    public void addCustomer(@RequestBody FoodItem foodItem) {
        service.addFoodItem(foodItem);
    }
}

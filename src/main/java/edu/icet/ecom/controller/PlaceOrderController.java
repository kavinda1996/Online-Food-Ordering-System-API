package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CartItem;
import edu.icet.ecom.service.PlaceOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor

public class PlaceOrderController {
    final PlaceOrderService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody CartItem order){
        service.addOrder(order);

    }

}



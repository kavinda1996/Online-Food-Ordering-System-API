package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.Customer;
import edu.icet.ecom.model.dto.ViewOrder;
import edu.icet.ecom.service.CustomerService;
import edu.icet.ecom.service.ViewOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/viewOrder")
@RequiredArgsConstructor
public class viewOrderController {
    final ViewOrderService service;
    @GetMapping("/get-all")
    public List<ViewOrder> getAll(){
        return service.getAll();
    }

}

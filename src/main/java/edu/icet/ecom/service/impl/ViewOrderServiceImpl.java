package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.Customer;
import edu.icet.ecom.model.dto.ViewOrder;
import edu.icet.ecom.model.entity.CustomerEntity;
import edu.icet.ecom.model.entity.ViewOrderEntity;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.repository.ViewOrderRepository;
import edu.icet.ecom.service.ViewOrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ViewOrderServiceImpl implements ViewOrderService {
    final ViewOrderRepository repository;
    final ModelMapper mapper;
    @Override
    public List<ViewOrder> getAll() {
        List<ViewOrder> orderList = new ArrayList<>();
        List<ViewOrderEntity> all = repository.findAll();

        all.forEach(orderEntity -> {
            orderList.add(mapper.map(orderEntity, ViewOrder.class));
        });

        return orderList;
    }
}

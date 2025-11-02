package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.CartItemEntity;
import edu.icet.ecom.model.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CartItemEntity,String> {
    void save(FoodItemEntity map);
}

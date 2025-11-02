package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItemEntity,String> {

}

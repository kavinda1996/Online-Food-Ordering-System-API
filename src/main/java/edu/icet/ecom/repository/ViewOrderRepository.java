package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.ViewOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewOrderRepository extends JpaRepository<ViewOrderEntity,String> {
    List<ViewOrderEntity> findAll();
}

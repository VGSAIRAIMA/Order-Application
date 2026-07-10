package com.example.orderapplication.orderRepository;

import com.example.orderapplication.itemEntity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {

}

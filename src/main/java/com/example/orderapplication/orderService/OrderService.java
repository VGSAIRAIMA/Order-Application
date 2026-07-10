package com.example.orderapplication.orderService;

import com.example.orderapplication.itemEntity.ItemEntity;
import com.example.orderapplication.orderRepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class OrderService {

    private final ItemRepository repository;

    public OrderService(ItemRepository repository){
        this.repository = repository;
    }

    public ItemEntity saveOrder(ItemEntity item){
        return repository.save(item);
    }

    public ItemEntity getOrder(Integer id){
        Optional<ItemEntity> item = repository.findById(id);
        return item.orElse(null);
    }



}

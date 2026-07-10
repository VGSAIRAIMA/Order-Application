package com.example.orderapplication.orderController;

import com.example.orderapplication.itemEntity.ItemEntity;
import com.example.orderapplication.orderService.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping
    public ItemEntity createOrder(@RequestBody ItemEntity item){
        return service.saveOrder(item);
    }

    @GetMapping("/{id}")
    public ItemEntity getOrder(@PathVariable Integer id){
        return service.getOrder(id);
    }

}
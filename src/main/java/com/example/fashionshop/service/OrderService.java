package com.example.fashionshop.service;

import com.example.fashionshop.model.Order;
import com.example.fashionshop.model.commons.enums.OrderStatus;
import com.example.fashionshop.model.dto.OrderUpdateReqDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    Order getOrderById(long orderId);

    List<Order> getOrderByStatus(String userId, OrderStatus orderStatus);

    void delete(Long id);

    List<Order> getAllById(String id);

    Order create(Order order);

    @Transactional
    void changeStatus(Long orderId, OrderStatus orderStatus);
}

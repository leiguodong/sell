package com.lei.service.impl;

import com.lei.entity.Order;
import com.lei.mapper.OrderMapper;
import com.lei.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019-10-23.
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    private OrderMapper orderMapper;
    public void addOrder(Order order) {
        this.orderMapper.insertOrder(order);
    }
}

package com.jyp.service.impl;

import com.jyp.mapper.OrderMapper;
import com.jyp.pojo.Order;
import com.jyp.pojo.OrderExample;
import com.jyp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/23 11:07
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> findAllOrder() {
        List<Order> orders = orderMapper.selectByExample(new OrderExample());
        return orders;
    }
}

package com.jyp.service.impl;

import com.jyp.mapper.OrderItemMapper;
import com.jyp.pojo.OrderItem;
import com.jyp.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/12/1 21:05
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public void addoi(OrderItem oi) {
        orderItemMapper.insert(oi);
    }
}

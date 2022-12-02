package com.jyp.service;

import com.jyp.pojo.OrderItem;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/12/1 21:05
 */
public interface OrderItemService {
    void addoi(OrderItem oi);

    List<OrderItem> findorderItem(Integer uid);
}

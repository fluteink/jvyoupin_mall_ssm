package com.jyp.service;

import com.jyp.pojo.Order;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/23 11:07
 */
public interface OrderService {
    List<Order> findAllOrder();

    void addOrder(Order o);

    List<Order> findOrderByUid(Integer uid);
}

package com.jyp.controller;

import com.jyp.pojo.Order;
import com.jyp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/23 11:06
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("OrderList")
    public String OrderList() {
        return "admin/order_list";
    }

    @RequestMapping("findAllOrder")
    @ResponseBody
    public List<Order> findAllOrder() {
        List<Order> allOrder = orderService.findAllOrder();
        return allOrder;
    }

    @RequestMapping("findOrderByUid/{uid}")
    @ResponseBody
    public List<Order> findOrderByUid(@PathVariable("uid") Integer uid) {
        List<Order> orderByUid = orderService.findOrderByUid(uid);
        return orderByUid;
    }
}

package com.fh.service;

import com.fh.bean.po.Order;
import com.fh.bean.vo.DataTablesData;

import java.util.List;

public interface OrderServiceI {
  

    void addOrder(Order order);

    Order orderIdUpById(Integer orderId);

    void drugUpdate(Order order);

   

    void delOrder(Integer orderId);

    DataTablesData queryOrder();
}

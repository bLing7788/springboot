package com.fh.service.impl;

import com.fh.bean.po.Order;
import com.fh.bean.vo.DataTablesData;
import com.fh.dao.OrderMapper;
import com.fh.service.OrderServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderServiceI {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public void addOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public Order orderIdUpById(Integer orderId) {
        return orderMapper.selectById(orderId);
    }

    @Override
    public void drugUpdate(Order order) {
     orderMapper.updateById(order);
    }



    @Override
    public void delOrder(Integer orderId) {
        orderMapper.deleteById(orderId);
    }

    @Override
    public DataTablesData queryOrder() {
        List<Order> list = orderMapper.queryOrder();
        DataTablesData data = new DataTablesData<>();
        data.setData(list);
        return data;
    }
}

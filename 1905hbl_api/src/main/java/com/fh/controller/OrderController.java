package com.fh.controller;

import com.fh.bean.po.Order;
import com.fh.bean.po.Product;
import com.fh.bean.vo.DataTablesData;
import com.fh.bean.vo.ListReturn;
import com.fh.service.OrderServiceI;
import com.fh.service.ProductServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping
@RestController
@CrossOrigin
public class OrderController {


    @Autowired
    private OrderServiceI orderServiceI;
    @Autowired
    private ProductServiceI productServiceI;
    @RequestMapping("queryOrder")
    public DataTablesData queryOrder(){
        DataTablesData da = orderServiceI.queryOrder();
       return da;
    }
    @RequestMapping("addOrder")
    public  Boolean addOrder(Order order){
        if(order != null){
            orderServiceI.addOrder(order);
            return true;
        }
        return false;
    }

    @RequestMapping("orderIdUpById")
    public Order orderIdUpById(Integer orderId){
        Order order =orderServiceI.orderIdUpById(orderId);
        return order;
    }
    @RequestMapping("drugUpdate")
    public Boolean drugUpdate(Order order){
        if(order != null){
            orderServiceI.drugUpdate(order);
            return  true;
        }
        return false;
    }

    @RequestMapping("delOrder")
    public Boolean delOrder(Integer orderId){
        if(orderId !=null){
            orderServiceI.delOrder(orderId);
            return true;
        }
        return false;
    }
    @RequestMapping("queryPro")
    public List<Product> queryPro(){
        return productServiceI.queryPro();
    }
    @RequestMapping("queryProByid")
    public ListReturn queryProByid(Integer proid){
        return productServiceI.queryProByid(proid);
    }


}

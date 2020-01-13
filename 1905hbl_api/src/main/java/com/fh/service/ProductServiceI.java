package com.fh.service;

import com.fh.bean.po.Product;
import com.fh.bean.vo.ListReturn;

import java.util.List;

public interface ProductServiceI {


    List<Product> queryPro();

    ListReturn queryProByid(Integer proid);
}

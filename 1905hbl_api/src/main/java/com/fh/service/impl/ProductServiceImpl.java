package com.fh.service.impl;

import com.fh.bean.po.Product;
import com.fh.bean.vo.ListReturn;
import com.fh.dao.ProductMapper;
import com.fh.service.ProductServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServiceI {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> queryPro() {
        return productMapper.selectList(null);
    }

    @Override
    public ListReturn queryProByid(Integer proid) {
        return productMapper.queryProByid(proid);
    }
}

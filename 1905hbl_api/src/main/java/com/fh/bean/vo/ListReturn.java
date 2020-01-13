package com.fh.bean.vo;

public class ListReturn {


    private Integer orderId;//	int(19)	主键订单号
    private Integer proid;//	int(19)	商品ID
    private Integer count;//	int	购买的数量
    private Double  subtotal;//	decimal	小计金额
    private String pname;//	varchar(300)	商品名称
    private Double price;//	decimal	商品价格

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

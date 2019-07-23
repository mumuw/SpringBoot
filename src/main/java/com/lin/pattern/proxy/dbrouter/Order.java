package com.lin.pattern.proxy.dbrouter;

/**
 * Created by lin on 2019/7/22.
 */
public class Order {
    private Object orderInfo;
    private Long createTime;
    private int id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

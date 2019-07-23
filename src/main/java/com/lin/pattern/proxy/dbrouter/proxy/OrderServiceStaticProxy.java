package com.lin.pattern.proxy.dbrouter.proxy;

import com.lin.pattern.proxy.dbrouter.IOrderService;
import com.lin.pattern.proxy.dbrouter.Order;
import com.lin.pattern.proxy.dbrouter.db.DynamicDataSourceEntity;
import com.sun.jdi.IntegerType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lin on 2019/7/22.
 */
public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order){
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("db in DB_" + dbRouter + " source");
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 1;
    }
}

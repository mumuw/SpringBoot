package com.lin.pattern.proxy.dbrouter;



import com.lin.pattern.proxy.dbrouter.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lin on 2019/7/22.
 */
public class DbRouterProxyTest {

    public static void main(String[] args) {
        try {

            Order order = new Order();
//            order.setCreateTime(new Date().getTime());

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = simpleDateFormat.parse("2017/02/01");
            order.setCreateTime(date.getTime());


            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){


        }


    }
}

package com.lin.pattern.proxy.dbrouter;

/**
 * Created by lin on 2019/7/22.
 */
public class OrderDao {

    public int insert(Order order){
        System.out.println("order create success");
        return 1;
    }

}

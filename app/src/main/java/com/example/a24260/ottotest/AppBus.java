package com.example.a24260.ottotest;

import com.squareup.otto.Bus;

/**
 * Created by 24260 on 2016/7/23.
 */
public class AppBus extends Bus {//使用单列模式创建
    private static AppBus bus;

    public static AppBus getInstance() {
        if (bus == null) {
            bus = new AppBus();
        }
        return bus;
    }

}

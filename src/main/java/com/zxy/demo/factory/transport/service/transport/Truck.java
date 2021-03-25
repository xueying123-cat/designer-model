package com.zxy.demo.factory.transport.service.transport;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("卡车走陆运");
    }
}

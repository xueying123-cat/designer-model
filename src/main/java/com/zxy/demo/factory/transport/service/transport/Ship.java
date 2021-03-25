package com.zxy.demo.factory.transport.service.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("船走海运");
    }
}

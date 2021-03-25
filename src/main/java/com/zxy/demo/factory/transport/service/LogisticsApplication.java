package com.zxy.demo.factory.transport.service;

import tk.mybatis.springboot.factory.transport.service.logistics.Logistics;
import tk.mybatis.springboot.factory.transport.service.logistics.RoadLogistics;

public class LogisticsApplication {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDeliver();
        Integer in = Integer.valueOf(1);
    }
}

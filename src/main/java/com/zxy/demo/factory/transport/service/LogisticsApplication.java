package com.zxy.demo.factory.transport.service;

import com.zxy.demo.factory.transport.service.logistics.Logistics;
import com.zxy.demo.factory.transport.service.logistics.RoadLogistics;

public class LogisticsApplication {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDeliver();
        Integer in = Integer.valueOf(1);
    }
}

package com.zxy.demo.factory.transport.service.logistics;

import tk.mybatis.springboot.factory.transport.service.transport.Transport;
import tk.mybatis.springboot.factory.transport.service.transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck();
    }
}

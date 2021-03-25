package com.zxy.demo.factory.transport.service.logistics;

import tk.mybatis.springboot.factory.transport.service.transport.Ship;
import tk.mybatis.springboot.factory.transport.service.transport.Transport;

public class SeaLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}

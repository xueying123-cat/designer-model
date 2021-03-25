package com.zxy.demo.factory.transport.service.logistics;

import tk.mybatis.springboot.factory.transport.service.transport.Transport;

public abstract class Logistics {
    abstract Transport createTransport();

    public void planDeliver() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

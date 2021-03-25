package com.zxy.demo.factory.dialog.service.button;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("HTMLButton:render");
    }

    @Override
    public void onClick() {
        System.out.println("HTMLButton:onClick");
    }
}

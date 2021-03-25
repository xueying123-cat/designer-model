package com.zxy.demo.factory.dialog.service.button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windowsButton:render");
    }

    @Override
    public void onClick() {
        System.out.println("windowsButton:onClick");
    }
}

package com.zxy.demo.factory.dialog.service.dialog;


import com.zxy.demo.factory.dialog.service.button.Button;

public abstract class Dialog {
    abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
}

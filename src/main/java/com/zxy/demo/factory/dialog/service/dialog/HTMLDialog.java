package com.zxy.demo.factory.dialog.service.dialog;

import com.zxy.demo.factory.dialog.service.button.Button;
import com.zxy.demo.factory.dialog.service.button.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
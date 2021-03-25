package com.zxy.demo.factory.dialog.service.dialog;

import com.zxy.demo.factory.dialog.service.button.Button;
import com.zxy.demo.factory.dialog.service.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}

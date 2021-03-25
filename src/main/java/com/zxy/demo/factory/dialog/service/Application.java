package com.zxy.demo.factory.dialog.service;

import tk.mybatis.springboot.factory.dialog.service.dialog.Dialog;
import tk.mybatis.springboot.factory.dialog.service.dialog.WindowsDialog;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}

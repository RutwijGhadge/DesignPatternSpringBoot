package com.example.demo.Service.Abstract;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

package com.example.demo.Service.Abstract;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MACGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MACCheckBox();
    }
}

package com.example.demo.Service.Abstract;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MACCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Rendering MAC Checkbox");
    }
}

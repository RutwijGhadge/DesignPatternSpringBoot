package com.example.demo.Service.Abstract;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class WindowsButton implements Button{
    @Override
    public void Paint() {
        System.out.println("Painting Windows Button");
    }
}

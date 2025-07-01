package com.example.demo.Service.Abstract;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MACButton implements Button{
    @Override
    public void Paint() {
        System.out.println("Painting MACBook Button");
    }
}

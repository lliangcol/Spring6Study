package com.liuliang.spring6.iocxml.bean;

public class Truck implements Run {
    @Override
    public void run() {
        System.out.println("Truck is running...");
    }
}

package com.liuliang.spring6.iocxml.bean;

public class Tank implements Run {
    @Override
    public void run() {
        System.out.println("Tank is running...");
    }
}

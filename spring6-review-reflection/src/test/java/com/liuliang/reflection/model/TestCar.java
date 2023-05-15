package com.liuliang.reflection.model;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {
    @Test
    public void testReflect() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.liuliang.reflection.model.Car");

        // 1. 获取类的名称
        System.out.println("类的名称：" + clazz.getName());

        // 2. 获取类的属性
        System.out.println("类的属性：");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 3. 获取类的方法
        System.out.println("类的方法：");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 4. 获取类的构造器
        System.out.println("类的构造器：");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

    @Test
    public void testSetFieldValue() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.liuliang.reflection.model.Car");
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Field brandField = clazz.getDeclaredField("brand");
        brandField.setAccessible(true);
        brandField.set(car, "红旗CA72");
        System.out.println(car.getBrand());
    }

    @Test
    public void testInvokeMethod1() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.liuliang.reflection.model.Car");
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Method setBrandMethod = clazz.getDeclaredMethod("setBrand", String.class);
        setBrandMethod.invoke(car, "红旗CA72");
        System.out.println(car.getBrand());
    }

    @Test
    public void testInvokeMethod2() throws Exception {
        Class<Car> clazz = Car.class;
        Constructor<Car> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Car car = constructor.newInstance("红旗CA72", "黑色", 200);
        //Car car = clazz.getDeclaredConstructor().newInstance();
        Method getBrandMethod = clazz.getDeclaredMethod("getBrand");
        String brand = (String) getBrandMethod.invoke(car);
        System.out.println("brand = " + brand);
    }

    @Test
    public void testPrivateMethod() throws Exception {
        Class<Car> clazz = Car.class;
        Constructor<Car> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Car car = constructor.newInstance("红旗CA72", "黑色", 200);

        Method run = clazz.getDeclaredMethod("run");
        run.setAccessible(true);
        run.invoke(car);
    }
}

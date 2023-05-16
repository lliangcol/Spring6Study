package com.liuliang.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 20:27
 */
public class TestCar {
    @Test
    public void testCreate() throws Exception {
        Class<Car> clazz1 = Car.class;
        Class<? extends Car> clazz2 = new Car().getClass();
        Class<?> clazz3 = Class.forName("com.liuliang.reflect.Car");

        Car car1 = clazz1.getDeclaredConstructor().newInstance();
        Car car2 = clazz2.getDeclaredConstructor().newInstance();
        Car car3 = (Car) clazz3.getDeclaredConstructor().newInstance();

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
    }

    @Test
    public void testGetConstructors() {
        Class<Car> clazz = Car.class;
        // getConstructors() 获取所有 public 的构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor.getParameterCount() = " + constructor.getParameterCount());
        }
    }
}

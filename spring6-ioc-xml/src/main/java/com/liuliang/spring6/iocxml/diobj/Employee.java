package com.liuliang.spring6.iocxml.diobj;

import java.util.Arrays;

public class Employee {
    private String name;
    private Integer age;
    private Department department;
    private String[] hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void work() {
        System.out.println(name + " work...");
        department.info();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}

package com.liuliang.spring6.iocxml.diobj;

public class Employee {
    private String name;
    private Integer age;
    private Department department;

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

    public void work() {
        System.out.println(name + " work...");
        department.info();
    }
}

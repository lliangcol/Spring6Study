package com.liuliang.spring6.iocxml.diobj;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void info() {
        System.out.println("Department info: " + name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}

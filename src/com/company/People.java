package com.company;

import java.util.Scanner;

public class People {
    protected final int retireAge = 65;



    protected String name;
    protected int age;
    protected int yearsToRetire;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsToRetire() {
        return yearsToRetire;
    }

    public void setYearsToRetire(int yearsToRetire) {
        this.yearsToRetire = yearsToRetire;
    }

    void ageToRetire() {
        yearsToRetire = retireAge - age;
    }

    public String toString() {
        return "name is " + name + ", age is " + age;
    }

}




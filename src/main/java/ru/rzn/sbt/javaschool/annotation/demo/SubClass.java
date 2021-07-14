package ru.rzn.sbt.javaschool.annotation.demo;

import java.lang.reflect.Method;

public class SubClass extends SuperClass {
    @Override
    public void print() {
        System.out.println("Hello from SubClass");;
    }


    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        MyHierarchy annotation = subClass.getClass().getAnnotation(MyHierarchy.class);
        if (annotation != null)
            System.out.println("OK");
    }

}

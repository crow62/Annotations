package ru.rzn.sbt.javaschool.annotation.demo;

public class DeprecatedExample {

    public static void main(String[] args) {
        ClassWithDeprecatedMethod example = new ClassWithDeprecatedMethod();
        example.doIt();
    }
}

class ClassWithDeprecatedMethod {
    @Deprecated
    public void doIt() {
        System.out.println("I am deprecated, but I work");
    }
}





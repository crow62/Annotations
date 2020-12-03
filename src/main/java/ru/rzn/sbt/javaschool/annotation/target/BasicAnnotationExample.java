package ru.rzn.sbt.javaschool.annotation.target;

public class BasicAnnotationExample {
    private String field = "This is String field";

    public BasicAnnotationExample() {
    }

    private void printText(String text) {
        String localVariable = "This is local String variable";
        System.out.println(text);
    }

    public static void main(String[] args) {
        System.out.println("Success");
    }
}

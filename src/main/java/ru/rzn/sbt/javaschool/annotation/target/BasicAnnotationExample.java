package ru.rzn.sbt.javaschool.annotation.target;

@UniversalAnnotation
public class BasicAnnotationExample {
    @UniversalAnnotation
    private String field = "This is String field";

    @UniversalAnnotation
    public BasicAnnotationExample() {
    }

    @UniversalAnnotation
    private void printText(String text) {
        @UniversalAnnotation
        String localVariable = "This is local String variable";
        System.out.println(text);
    }

    @UniversalAnnotation
    public static void main(String[] args) {
        System.out.println("Success");
    }
}

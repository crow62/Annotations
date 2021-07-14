package ru.rzn.sbt.javaschool.annotation.examples;

import java.lang.reflect.Method;

public class Marker {
    // аннотировать метод с помощью маркера
    @MyMarker
    public static void myMeth() {

        Marker marker = new Marker();

        try {
            Method myMeth1 = marker.getClass().getMethod("myMeth");
            MyMarker annotation = myMeth1.getAnnotation(MyMarker.class);
            if(annotation!=null)
            System.out.println("Annotation exists");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        // Создать объект класса.

        // Получить объект аннотированного метода

        // определить наличие аннотации

    }

    public static void main(String args[]) {
        myMeth();
    }
}

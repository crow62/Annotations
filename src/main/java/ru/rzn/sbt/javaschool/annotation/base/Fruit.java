package ru.rzn.sbt.javaschool.annotation.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации, присутствуют два поля.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Fruit {

    String color();

    int count();
}

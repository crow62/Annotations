package ru.rzn.sbt.javaschool.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.CLASS.
 */
@Retention(RetentionPolicy.CLASS)
public @interface FruitClass {
    String color();

    int count();
}

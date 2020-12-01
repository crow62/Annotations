package ru.rzn.sbt.javaschool.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.RUNTIME.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitRuntime {
    String color();

    int count();
}

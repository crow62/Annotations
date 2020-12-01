package ru.rzn.sbt.javaschool.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.SOURCE.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface FruitSource {
    String color();

    int count();
}

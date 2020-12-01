package ru.rzn.sbt.javaschool.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация с правилом удержания RetentionPolicy.RUNTIME и полем description.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}

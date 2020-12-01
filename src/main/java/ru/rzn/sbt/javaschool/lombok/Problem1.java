package ru.rzn.sbt.javaschool.lombok;

import lombok.Getter;
import lombok.Setter;

public class Problem1 {

    // Согласно спецификации JavaBeans, нам следует поля делать
    // private`ными, и писать для них getter`ы и setter`ы. Но почему мы обязаны это
    // писать?

    class Example {
        @Getter
        @Setter
        private int x;
    }
}

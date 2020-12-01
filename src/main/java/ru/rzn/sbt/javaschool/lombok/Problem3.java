package ru.rzn.sbt.javaschool.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Problem3 {

    // DRY!

    @Getter
    @Setter
    class Example {
        private int x;
        private String y;
        // а тут не надо
        @Setter(AccessLevel.NONE)
        private Long z;
    }
}

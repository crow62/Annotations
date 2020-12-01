package ru.rzn.sbt.javaschool.lombok;

import lombok.AccessLevel;
import lombok.Getter;

public class Problem2 {

//    class Example {
//        private int x;
//
//        // А если хочу protected?
//        protected int getX() {
//            return x;
//        }
//    }

    class Example {
        @Getter(AccessLevel.PROTECTED)
        private int x;
    }
}

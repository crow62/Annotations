package ru.rzn.sbt.javaschool.lombok;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

public class Problem4 {

//    // Хочу меньше кода
//    @FieldDefaults(level = AccessLevel.PRIVATE)
//    class Foo {
//        int x;
//
//        String s;
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Foo foo = (Foo) o;
//            return x == foo.x &&
//                    Objects.equals(s, foo.s);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(x, s);
//        }
//    }

    @EqualsAndHashCode
    @FieldDefaults(level = AccessLevel.PRIVATE)
    class Foo {
        int x;

        String s;

    }
}

package ru.rzn.sbt.javaschool.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString(includeName=false)
public class Point {
    @ToString(includeName=false)
    private int x;

    @ToString(includeName=false)
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}

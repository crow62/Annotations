package ru.rzn.sbt.javaschool.runtime;
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

//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
}

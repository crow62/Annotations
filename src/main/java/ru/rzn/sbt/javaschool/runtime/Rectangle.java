package ru.rzn.sbt.javaschool.runtime;

@ToString
public class Rectangle {
    @ToString(includeName=false)
    private Point topLeft;

    @ToString
    private String name;

    @ToString
    private int width;

    @ToString
    private int height;

    public Rectangle(Point topLeft, int width, int height, String name) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "topLeft=" + topLeft +
//                ", width=" + width +
//                ", height=" + height +
//                '}';
//    }
}

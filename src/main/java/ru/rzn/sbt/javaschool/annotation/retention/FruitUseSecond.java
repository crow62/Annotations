package ru.rzn.sbt.javaschool.annotation.retention;

import ru.rzn.sbt.javaschool.annotation.base.Fruit;

import java.lang.reflect.Method;

/**
 * Пример использования аннотации.
 */
public class FruitUseSecond {
    @FruitRuntime(color = "Зелёный", count = 1)
    public static void getApple() {
        FruitUseSecond ob = new FruitUseSecond();
        try {
            Class<?> fruitObject = ob.getClass();
            Method fruitMethod = fruitObject.getMethod("getApple");
            FruitRuntime fruitAnnotation = fruitMethod.getAnnotation(FruitRuntime.class);
            System.out.println("Цвет фрукта: " + fruitAnnotation.color() + ", количество фруктов: " + fruitAnnotation.count());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

//    @Fruit(color = "Красный", count = 5)
//    public static void getGarnet(String str, int value ) {
//        FruitUseSecond ob = new FruitUseSecond();
//        try {
//            Class<?> fruitObject = ob.getClass();
//            Method fruitMethod = fruitObject.getMethod("getApple");
//            FruitRuntime fruitAnnotation = fruitMethod.getAnnotation(FruitRuntime.class);
//            System.out.println("Цвет фрукта: " + fruitAnnotation.color() + ", количество фруктов: " + fruitAnnotation.count());
//        } catch (NoSuchMethodException ехс) {
//            System.out.println("Метод не найден.");
//        }
//    }

    public static void main(String[] args) {
        getApple();
//        getGarnet("Желтый", 8); // раскомментировать и вывести значения
    }
}

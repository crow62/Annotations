package ru.rzn.sbt.javaschool.annotation.retention;

/**
 * Пример использования аннотаций с различными правилами удержания.
 */
public class FruitUseAll {
    @FruitSource(color = "Зелёный", count = 1)
    @FruitClass(color = "Синий", count = 2)
    @FruitRuntime(color = "Красный", count = 3)
    public static void getFruitsCount() {
        System.out.println("Программа выполнилась успешно");
    }

    public static void main(String[] args) {
        getFruitsCount();
    }
}

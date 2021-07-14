package ru.rzn.sbt.javaschool.runtime;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class ToStrings {
    //TODO Создание обработчика собственной аннотации в runtime
    public static void main(String[] args) {
        System.out.println(toString(new Rectangle(new Point(15, 30), 100, 200)));
    }

    public static String toString(Object obj) {

        if (obj == null) return null;
        Class<?> aClass = obj.getClass();
        List<Field> fieldsWithAnnotation = getFieldsWithAnnotations(obj);

        if (aClass.isAnnotationPresent(ToString.class) ) {

            if (aClass.getAnnotation(ToString.class).includeName()) {

                Object[] fieldsToString = getFieldsToString(obj,fieldsWithAnnotation);
                return aClass.getName() + Arrays.toString(fieldsToString);

            }
            else {
                return Arrays.toString(getFieldsToString(obj,fieldsWithAnnotation));
            }

        } else {
            return Arrays.toString(getFieldsToString(obj,fieldsWithAnnotation));
        }

    }


    public static List<Field> getFieldsWithAnnotations(Object obj) {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        List<Field> fieldsWithAnnotation = new ArrayList<>();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(ToString.class)) {
                fieldsWithAnnotation.add(field);
            }
        }
        return fieldsWithAnnotation;
    }


    //метод, возвращающий имена аннотированных полей и их значения
    public static Object[] getFieldsToString(Object obj,List<Field> fieldsWithAnnotation ) {

        List<Object> objectList = new ArrayList<>();
        if (!fieldsWithAnnotation.isEmpty()) {
            for (Field field : fieldsWithAnnotation) {
                field.getAnnotation(ToString.class);
                try {
                    //тип не примитив и не стринг
                    if (!field.getType().isPrimitive() && !field.getType().getSimpleName().equals("String")) {
                        objectList.add(field.getName() + toString(field.get(obj))); //рекурсия
                    } else {
                        objectList.add((!field.getAnnotation(ToString.class).includeName() ? "" : field.getName()+ " = ") + field.get(obj));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return objectList.toArray();
        }
        return objectList.toArray();

    }

}


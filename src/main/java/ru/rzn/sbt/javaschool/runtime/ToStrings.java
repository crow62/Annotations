package ru.rzn.sbt.javaschool.runtime;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ToStrings {
    //TODO Создание обработчика собственной аннотации в runtime
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Class<?> aClass = Rectangle.class;
//        Field field = aClass.getDeclaredField("width");
//        field.setAccessible(true);
//
//        Object o = field.get(new Rectangle(new Point(15,30),100,200));
//        System.out.println(o);

        System.out.println(toString(new Rectangle(new Point(15,30),100,200)));
        //System.out.println(new Rectangle(new Point(15,30),100,200));
    }

    public static String toString(Object obj) {

        Class<?> aClass = obj.getClass();


        if (aClass.isAnnotationPresent(ToString.class)) {

            if (aClass.getAnnotation(ToString.class).includeName()) {

                Map<String, Object> fieldsToString = getFieldsToString(obj);
                return aClass.getSimpleName() + fieldsToString.toString();

            } else {
                return getFieldsToString(obj).toString();
            }

        } else {
            return getFieldsToString(obj).toString();
        }

    }

    //метод, возвращающий имена аннотированных полей и их значения
    public static Map<String, Object> getFieldsToString(Object obj) {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        List<Field> fieldWithAnnotation = new ArrayList<>();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(ToString.class)) {
                fieldWithAnnotation.add(field);
            }
        }

        Map<String, Object> map = new LinkedHashMap<>();
        if (!fieldWithAnnotation.isEmpty()) {
            for (Field field : fieldWithAnnotation) {
                field.getAnnotation(ToString.class);
                try {
                    if(!field.getType().isPrimitive()){
                        map.put(field.getName(), toString(field.get(obj)));
                    } else {
                        map.put(field.getName(), field.get(obj));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return map;
        }
        return map;

    }

}


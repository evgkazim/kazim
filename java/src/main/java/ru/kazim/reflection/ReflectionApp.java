package ru.kazim.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        User user = new User(1, "name222", "name222");

        System.out.println(user);
        System.out.println();

        Field field = user.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println((String) field.get(user));

        Method method = user.getClass().getDeclaredMethod("toStringPrivate");
        method.setAccessible(true);
        System.out.println(method.invoke(user));

        user = null;

        Class<?> clazz = Class.forName(User.class.getName());
        user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);

        user = null;

        clazz = Class.forName(User.class.getName());
        Class[] params = {int.class, String.class, String.class};
        user = (User) clazz.getConstructor(params).newInstance(2, "2", "2");
        System.out.println(user);
    }
}

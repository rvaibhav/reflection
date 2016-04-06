package com.practice.reflection.app;

import com.practice.reflection.app.beans.Car;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class SetterGetterExample {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Car car = new Car("BMW", "4500000", "2015");

        Method[] methods = car.getClass().getMethods();
        for(Method method:methods){
            if(method.getName().startsWith("get")) {
                System.out.println(method.invoke(car));
            }
        }
        for(Method method:methods){
            if(method.getName().startsWith("set")) {
                method.invoke(car, "on fire");
            }
        }
        for(Method method:methods){
            if(method.getName().startsWith("get")) {
                System.out.println(method.invoke(car));
            }
        }
    }
}

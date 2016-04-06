package com.practice.reflection.app;

import com.practice.reflection.app.statics.GenerateData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class MethodExample {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        String methodName = "random_int";
        //Get method call returns the methods of parent classes as well.
        Method[] methods = GenerateData.class.getMethods();
        for(Method method:methods){
            if(method.getName().equals(methodName)){
                Object randomNumber = method.invoke(null,1111111111, 2121212121);
                if(randomNumber instanceof Integer){
                    Integer randomInt = (Integer) randomNumber;
                    System.out.println("Integer value is " + randomInt);
                }
            }
        }
    }

}

package com.practice.reflection.app;

import com.practice.reflection.app.beans.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class ConstructorExample {

    public static void main(String[] args){
        Person person = new Person();
        Constructor<?>[] constructors = person.getClass().getConstructors();
        for(Constructor constructor: constructors){
            Parameter[] parameters = constructor.getParameters();
            int numberOfParameters = constructor.getParameterCount();
            System.out.println("Parameter count for " + constructor.getName() + " is " + numberOfParameters);
            for(Parameter parameter: parameters){
                System.out.println("Parameter name is " + parameter.getName());
                System.out.println("Parameter type is " + parameter.getType());
            }
        }
    }

}

package com.practice.reflection.app;

import com.practice.reflection.app.beans.Person;

import java.lang.reflect.Field;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class FieldExample {

    public static void main(String[] args){

        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        //getDeclaredFields does not return the fields of parent class
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field field: declaredFields){
            System.out.println("Field Name is " + field.getName());
            System.out.println("Field type is " + field.getType());
            System.out.println( "Modifiers:" + field.getModifiers() );
            System.out.println( "isAccesible: " + field.isAccessible() );
        }
    }

}

package com.practice.reflection.app;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class ClassExample {

    public static void main(String[] args){
        String stringer = new String("Alice");
        Class<? extends String> stringClass = stringer.getClass();
        if(stringClass.isPrimitive()){
            System.out.println("Class is a primitive " + stringClass);
        }else if(stringClass.isInstance("Rob")){
            System.out.println("Class is an instance " + stringClass);
        }
    }

}

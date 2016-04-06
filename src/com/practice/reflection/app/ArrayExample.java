package com.practice.reflection.app;

import java.lang.reflect.Array;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class ArrayExample {

    public static void main(String[] args){
        String[] strArray = (String[]) Array.newInstance(String.class, 10);
        Array.set(strArray, 1, "Element 1");
        Array.set(strArray, 6, "Element 6");
        Array.set(strArray, 9, "Element 9");

        System.out.println("strArray[1]=" + Array.get(strArray, 1));
        System.out.println("strArray[5](not initialized)="+ Array.get(strArray,5));
        System.out.println("strArray[6]="+ Array.get(strArray,6));
        System.out.println("strArray[9]="+ Array.get(strArray,9));
    }

}

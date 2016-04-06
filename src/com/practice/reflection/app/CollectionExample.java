package com.practice.reflection.app;

import java.util.*;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class CollectionExample {

    public static void main(String[] args){
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Element 1");
        myMap.put(2, "Element 1");
        myMap.put(3, "Element 1");
        myMap.put(4, "Element 1");
        reflectOnCollection(myMap);
        reflectOnCollection(myMap.keySet());
        reflectOnCollection(myMap.values());
        List<String> myList = new ArrayList<String>();
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Oscar");
        reflectOnCollection(myList);
        reflectOnCollection("This is a test string");
    }

    private static void reflectOnCollection(Object obj){
        if(obj instanceof Collection){
            System.out.println("This is collection "+obj.getClass().getName());
            System.out.println("This is collection with typeName "+obj.getClass().getTypeName());
            Iterator items = ((Collection) obj).iterator();
            while(items !=null && items.hasNext()){
                Object item = items.next();
                System.out.println("Element is of type " + item.getClass().getName());
            }
        }else{
            System.out.println("Not a collection " + obj.getClass().getName());
        }
    }
}
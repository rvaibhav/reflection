package com.practice.reflection.app.beans;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class Person extends Mammals{

    public Person(){
        System.out.println("Constructing Person Object");
    }


    private String name;

    private int age;

    private String address;

    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

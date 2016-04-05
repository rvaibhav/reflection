package com.practice.reflection.app.beans;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class Mammals {

    public Mammals(){
        System.out.println("Constructing Mammals object");
    }

    private int numberOflimbs;

    private boolean hasHair;

    private String bodyColor;

    public int getNumberOflimbs() {
        return numberOflimbs;
    }

    public void setNumberOflimbs(int numberOflimbs) {
        this.numberOflimbs = numberOflimbs;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }
}

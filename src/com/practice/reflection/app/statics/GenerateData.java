package com.practice.reflection.app.statics;

import java.util.Random;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class GenerateData {

    private static Random r;

    static{
        r = new Random();
    }

    public static int random_int(int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return r.nextInt((max - min) + 1) + min;
    }

}

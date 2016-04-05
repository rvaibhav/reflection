package com.practice.reflection.app;

import com.practice.reflection.app.enums.Releases;

/**
 * Created by vaibhavr on 05/04/16.
 */
public class EnumsExample {

    public static void main(String[] args){
        Releases firstRelease = Releases.ALPHA;
        Class<? extends Releases> releaseClass = firstRelease.getClass();
        Releases[] releaseList = releaseClass.getEnumConstants();
        for(Releases release:releaseList){
            System.out.println("Release element " + release);
        }
        System.out.println("Release list is " + releaseList.toString());
    }

}

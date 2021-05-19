package com.hackerrank.practice.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {

        Integer[] intarray = {1,2,3,4,5,4,3,2,1,3,4};
        //Integer[] intarray = {1,4,4,4,5,3};
        List<Integer> birds = new ArrayList<Integer>(Arrays.asList(intarray));

        System.out.println(migratoryBirds(birds));


    }

    public static int migratoryBirds(List<Integer> arr) {

        Integer[] intarray = {0,0,0,0,0};
        List<Integer> countArray = Arrays.asList(intarray);

        for (int birdType : arr) {
            countArray.set(birdType-1, countArray.get(birdType-1)+1) ;
        }

        int response = 0;
        int big = 0;

        for (int i=0; i<5; i++) {
            if (countArray.get(i) > big) {
                big = countArray.get(i);
                response = i+1;
            }

        }

        return response;
    }
}

package com.hackerrank.practice.problemSolving;

// 256th day of a year is known as Day Of Programmer.Here we have to calculate tha date from the given year.

public class DayOfProgrammer {

    public static String dayOfProgrammer(int year) {
        int days=0;

        if(year%400==0 || (year%4==0 && year%100!=0)){
            days=244;
        }
        else{
            days=243;
        }
        int dd=256-days;
        int mm=9;
        int yy=year;
        String val= String.valueOf(System.out.printf("%02d:%02d:%04d",dd,mm,yy));
        System.out.println();
        return "";
    }

    public static void main(String[] args) {
        int year=1800;
        System.out.println(dayOfProgrammer(year));
    }

}

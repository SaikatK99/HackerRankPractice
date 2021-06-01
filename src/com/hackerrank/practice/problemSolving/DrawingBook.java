package com.hackerrank.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of pages in the book: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the page number to turn to: ");
        int p=Integer.parseInt(br.readLine());
        int turn=0;
        if (p>(n-p)){
            if (n==p){
                System.out.println(0);
            }
            else {
                if(n%2==0){
                    turn=1+((n-p-1)/2);
                    System.out.println(turn);
                }
                else {
                    turn=(n-p)/2;
                    System.out.println(turn);
                }
            }
        }
        else {
            turn=p/2;
            System.out.println(turn);
        }
    }
}

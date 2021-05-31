package com.hackerrank.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillDivision {
    public static void main(String[] args) throws IOException {

        int actual=0;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of items ordered : ");
        int n = Integer.parseInt(bf.readLine());

        int arr[]=new int[n];
        System.out.println("Enter item price: ");
        for(int i=0;i<n;i++){

            arr[i]=Integer.parseInt(bf.readLine());
        }

        System.out.println("Enter the number of item which doesn't eat : ");
        int k=Integer.parseInt(bf.readLine());

        System.out.println("Enter Charged ammount: ");
        int chrg=Integer.parseInt(bf.readLine());

        int sum=0;
        for (int j=0;j<n;j++){
            if(j==k){
                continue;
            }
            else {
                sum=sum+arr[j];
            }

        }
        actual=(sum/2);
        if (chrg==actual){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(chrg-actual);
        }

    }
}

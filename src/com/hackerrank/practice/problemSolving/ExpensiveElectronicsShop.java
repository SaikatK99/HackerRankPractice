package com.hackerrank.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpensiveElectronicsShop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter budget,keyboards number and drives number respectively: ");
        int b,k,d;
        b=Integer.parseInt(bufferedReader.readLine());
        k=Integer.parseInt(bufferedReader.readLine());
        d=Integer.parseInt(bufferedReader.readLine());
        int keyboards[]=new int[k];
        int drives[]=new int[d];
        int maxPrice = 0;
        System.out.println("Enter keyboards price: ");
        for (int i=0;i<k;i++){
            keyboards[i]=Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Enter drives price: ");
        for (int i=0;i<d;i++){
            drives[i]=Integer.parseInt(bufferedReader.readLine());
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<d;j++){
                int sum=keyboards[i]+drives[j];
                if(sum<b && sum>maxPrice){
                    maxPrice=sum;
                }
                else if(sum>b && maxPrice==0 ){
                    maxPrice=-1;
                }
            }
        }
        System.out.println("Expensive Shopping List: "+maxPrice);

    }
}

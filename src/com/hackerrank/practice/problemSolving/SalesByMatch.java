package com.hackerrank.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SalesByMatch {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of socks: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the colors of each sock: ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        int finalArr[]=new int[n];
        for (int i=0;i<n;i++){

            if(visited[i]==true)
                continue;

            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            finalArr[i]=count;
        }
        int val=0;
        for (int k=0;k<finalArr.length;k++){
            if(finalArr[k]>1){
                val=val+finalArr[k]/2;
            }
        }
        System.out.println("Total pairs: "+val);
    }

}

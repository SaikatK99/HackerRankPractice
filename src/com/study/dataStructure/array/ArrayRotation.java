package com.study.dataStructure.array;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Enter values: ");
        for (int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Rotation by elements: ");
        int d= sc.nextInt();
        System.out.println("After Rotation: ");
        rotation(arr,d);
    }

    private static void rotation(int[] arr, int i) {
        int arr2[]=new int[arr.length];
        int l=0;
        for(int k=i;k<arr.length;k++){
            arr2[l]=arr[k];
            l++;
        }
        for(int m=0;m<=i-1;m++){
            arr2[l]=arr[m];
            l++;
        }
        for(int x=0;x<arr.length;x++){
            System.out.println(arr2[x]);
        }

    }


}

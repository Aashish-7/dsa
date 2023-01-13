package com.java.dsa.array.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class GarbageArrayDSAService {


    public void maxSubArray() {
        Integer[] elements = new Integer[]{1, 2, 3, 4};
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {

            }
        }
    }


    public void primeNo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = scanner.nextInt();
        if (n <= 1){
            System.out.println("Neither prime nor composite");
        }
        int c = 2;
        while (c <= n){
            if (n % 2 == 0){
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
            c++;
        }
    }

    public void listOfPrimeNumber() {
        int n = 100;
        int count = 0;
        for (int i = 2; i<=100; i++){
            for (int j = 2; j<i; j++){
                if (i % j != 0) {
                    count = count+i;
                    count++;
                }
            }
        }
    }

    public void climbing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No :");
        int n = scanner.nextInt();

        int a = 1;
        int b = a + 1;
        int c;
        while (n != 0){
            c = a+b;
            System.out.println(c);
            b = c;
            a = c - b;
            System.out.println("H");
        }

    }


    public void duplicate(){
        int[] a = new int[]{1,2,3,4,4};
        int[] b = new int[a.length];
        for (int i = 0 ; i<a.length; i++){
            for (int j = 1; j<b.length; j++){
                if (a[i] == b[j] && i!=j){
                    System.out.println("duplicate are " + a[i]);
                }
            }
        }
    }
}

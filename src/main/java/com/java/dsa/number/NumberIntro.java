package com.java.dsa.number;

import java.util.ArrayList;
import java.util.List;

public class NumberIntro {

    public NumberIntro() {

    }

    public static void main(String[] args) {
//        System.out.println(findProperDivisors(7));
        List<Integer> listPrime = new ArrayList<>();
        for (int i =2; i <25; i++ ){
            if (isPrimeBruteForce(i)){
                listPrime.add(i);
            }
        }
        System.out.println("List of prime no till 25 " + listPrime);
    }

    static List<Integer> findProperDivisors(final int value) {
        final List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                System.out.println(i + " " + value);
                divisors.add(i);
            }
        }
        return divisors;
    }

    // this one is brute force algorithm for check whether is prime or not
    static boolean isPrimeBruteForce(final int num){
        for (int i = 2; i <= num /2; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}

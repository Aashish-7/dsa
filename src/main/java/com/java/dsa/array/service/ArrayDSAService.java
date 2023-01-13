package com.java.dsa.array.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArrayDSAService {

    public Map<String, Integer> maxAndMinElementInArray(Integer[] elements) {
        Map<String, Integer> map = new HashMap<>();

        // we can take array as input from console with the help of Scanner class

//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter no of array");
//        int n = scanner.nextInt();
//        System.out.println("Enter element of array");
//        int [] a = new int[n];
//        for (int i = 0; i<n; i++){
//            a[i] = scanner.nextInt();
//        }

        // we can set array as a hard-code values
//        int [] a = new int[]{2,4,6,7,0,2,1,4,5,6,7,8,90,77,66,44,22,34};

        // find max element in array
        int max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (max < elements[i]) {
                max = elements[i];
            }
        }
        map.put("Maximum Element In Array = ", max);

        // find min element in array
        int min = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        map.put("Minimum Element In Array = ", min);
        System.out.println(map);

        // traverse the map with the help of iterator!!
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        return map;
    }


    public Map<String, Integer[]> reverseTheArray(Integer[] elements) {
        Map<String, Integer[]> map = new HashMap<>();

        // we can use hard code array
//      Integer [] elements = new Integer[] {1,2,3,4,5,6,7,8,9};

        Integer[] reverseElements = new Integer[elements.length];
        int count = 1;
        for (int i = 0; i < elements.length; i++) {
            reverseElements[reverseElements.length - count] = elements[i];
            count++;
        }

        map.put("Reverse array are: ", reverseElements);

        // some traversing methods....

//        for (Integer integers : reverseElements){
//            System.out.println(integers);
//        }
//
//        System.out.println("_________________________");
//
//        for (int j =0; j<reverseElements.length; j++){
//            System.out.println(reverseElements[j]);
//        }
//
//        System.out.println("_________________________");
//
//        Iterator iterator = Arrays.stream(reverseElements).iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        return map;
    }

    public void containDuplicate(){
        Integer[] elements = new Integer[]{1,2,2,3,4,5,6,6};
        Set<Integer> set =  new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (Integer integers: elements){
            boolean aBoolean = set.add(integers);
            if (!aBoolean){
                count++;
                list.add(integers);
            }
        }
        if (count == 0){
            System.out.println("Not duplicate values");
        }
        else {
            System.out.print("Duplicate values are there: ");
            System.out.println(list);
        }
    }





    public void reverseArrayWithSwappingElements(){
        int[] elements = new int[]{1,2,3,4,5,6};
        int count =1;
        for (int i = 0;i<elements.length/2;i++){
            int buffer = elements[i];
            elements[i]=elements[elements.length-count];
            elements[elements.length-count]=buffer;
            count++;
        }
        System.out.println(Arrays.toString(elements));
    }

    public void findDuplicateInArray(){
        int[] elements = new int[]{1,2,1,3,4,3,5,6}; // only use for two duplicate allowed!!
        ArrayList<Integer> duplicateElement = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i] == elements[j]){
                    duplicateElement.add(elements[i]);
                }
            }
        }
        System.out.println(duplicateElement);
    }

    public void factorialWithLoop(){
        int n = 4;
        int fact =1;
        for (int i = n; i>0; i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public int factorialWithRecursion(int n){
        int fact;
        if (n == 0){
            return 1;
        }
        else {
            fact = n * factorialWithRecursion(n-1);
//            System.out.println(fact);
//            System.out.println(n);
        }
        return fact;
    }

    int fact = 1;

    public int factorialWithRec(int n){
        if (n > 1){
            fact = fact*n;
            factorialWithRec(n-1);
            return fact;
        }
        return 1;
    }

    public void reverseNumber(){
        int n = 54321;

        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--){
            stringBuilder.append(s.charAt(i));
        }
        int i = Integer.parseInt(String.valueOf(stringBuilder));
        System.out.println(i);
    }

    public void reverseString(){
        String s = "String";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = s.length()-1; i>=0; i--){
            stringBuffer.append(s.charAt(i));
        }
        System.out.println(stringBuffer);
    }

    public void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no to check prime.");
        int c = 0;
        int a = scanner.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        if (c==0){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    public void fabbonacci(){
        int a = 0 ,b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i<10; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public void palindrom(){
        int n = 1221;
        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();

//        for (int i = s.length()-1; i>=0; i--){
//            stringBuilder.append(s.charAt(i));
//        }
//
//        if (String.valueOf(stringBuilder).equals(s)){
//            System.out.println("Palindrom");
//        }
//        else {
//            System.out.println("Not palindrom");
//        }

        stringBuilder.append(s);
        if (String.valueOf(stringBuilder.reverse()).equals(s)){
            System.out.println("Paliindrom");
        }
    }


    public void palindromStringWithSwapping(){
        String s = "naman";
        int count = 1;
        int n =0;
        for (int i = 0; i<s.length()/2; i++){
            if (s.charAt(i) == s.charAt(s.length()-count)){
                count++;
                n++;
            }
        }
        if (n == s.length()/2){
            System.out.println("P");
        }
        else {
            System.out.println("not");
        }
    }

    public void armstrong(){
        int n = 153;
        int count = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
                double j = Math.pow(Double.parseDouble(String.valueOf(s.charAt(i))), s.length());
                count = (int) (count+j);
            System.out.println(count);
        }
        if (count == n){
            System.out.println("Armstrong");
        }
    }

    public void table(){
        int n = 13;
        for (int i = 1; i<=10; i++){
            System.out.println(n + "*" + i + " =" + n*i);
        }
    }

    
}

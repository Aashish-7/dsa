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

    public void reverseArrayWithSwapingElements(){
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
        int[] elements = new int[]{1,2,1,3,4,3,5,6};
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
}

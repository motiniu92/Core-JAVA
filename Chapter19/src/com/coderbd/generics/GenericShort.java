package com.coderbd.generics;

import static java.lang.Math.E;
import static java.util.Arrays.sort;

public class GenericShort {

    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3), new Integer(1), new Integer(8),
         new Integer(5), new Integer(7)};

        Double[] doubleArray = {new Double(3.4), new Double((int) 1.3), new Double(2.4), new Double((int) 5.3),
            new Double(-22.1)};

        Character[] charArray = {new Character('a'), new Character('j'), new Character('d'), new Character('y'),
            new Character('r')};

        String[] stringArray = {"Tom", "Susan", "Kim", "Mim", "Ruby"};
                
                

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted Integer objects :");
        printList(intArray);
        System.out.println("Sorted Double objects :");
        printList(doubleArray);
        System.out.println("Sorted Character objects :");
        printList(charArray);
        System.out.println("Sorted String objects :");
        printList(stringArray);

    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "");
            System.out.println();

        }
    }

}
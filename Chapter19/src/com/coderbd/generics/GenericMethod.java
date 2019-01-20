
package com.coderbd.generics;


public class GenericMethod {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"London", "Paris", "New York", "Austin", "Dhaka", "Kabul", "Takio"};
        
        GenericMethod.<Integer>print(integers);
        GenericMethod.<String>print(strings);
        GenericMethod.<Integer>print(integers);
        GenericMethod.<String>print(strings);
    }
    
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
            
        }
        System.out.println();
    }
            
}

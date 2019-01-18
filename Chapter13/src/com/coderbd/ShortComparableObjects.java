
package com.coderbd;

import java.math.BigInteger;


public class ShortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa", "Candy", "Dhaka", "Landon", "Maskat",
            "Kabul", "Riad", "Nairobi", "Panama", "Janeva", "Wasington"};
        java.util.Arrays.sort(cities);
        for (String city : cities) 
            System.out.println(city + " ");
            System.out.println();
        
            BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
             new BigInteger("432232323239292"), new BigInteger("54623239292")};
            
            java.util.Arrays.sort(hugeNumbers);
            for(BigInteger number : hugeNumbers)
                System.out.println(number + " ");
    }
}

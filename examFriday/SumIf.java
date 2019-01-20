package com.coderbd.examFriday;

import java.util.Scanner;

public class SumIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter  number : ");
        int n = input.nextInt();
        int p = 0;

        for (int i = 0; i < n; i++) {
            p++;
            int k = input.nextInt();

            if (i % 2 == 0) {
                sum += k;

            }
        }
        sum -= p * 10;
        System.out.println("Sum is : " + sum);

    }
}

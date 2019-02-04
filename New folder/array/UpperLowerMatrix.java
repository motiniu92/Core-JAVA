package com.coderbd.array;

import java.util.Scanner;

public class UpperLowerMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;
        System.out.print("Enter value : ");
        

        //Matrix input
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][row] = input.nextInt();
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }

                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
            }

        }
        System.out.println("Sum of diagonal elements : " + sumOfDiagonalElements);
        System.out.println("Sum of upper elements : " + sumOfUpperElements);
        System.out.println("Sum of lower elements : " + sumOfLowerElements);
       
    }
}

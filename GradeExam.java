/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author User
 */
public class GradeExam {

    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'B', 'E', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'A', 'D', 'A'},
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'A', 'D', 'D'},
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'A', 'D', 'E'},
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'A', 'D', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) 
                    correctCount++;
                }
            
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
}

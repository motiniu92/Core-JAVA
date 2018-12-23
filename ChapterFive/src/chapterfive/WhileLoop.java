/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfive;

/**
 *
 * @author User
 */
public class WhileLoop {

    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
            //System.out.println("sum is " + sum);
        }
        System.out.println("sum is " + sum);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfour;

/**
 *
 * @author User
 */
public class ChapterFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double x = Math.sqrt(25);
        System.out.println("25: " + x);
        System.out.println(Math.pow(5, 5));
        System.out.println(Math.ceil(25.123654));
        System.out.println(Math.floor(25.123654));
        System.out.println(Math.rint(25.123654));
        System.out.println(Math.rint(25.49));
        System.out.println(Math.round(22.123654));
        System.out.println(Math.round(22.5023654));
        
        
        System.out.println(Math.max(2.5, 3));
        System.out.println(Math.max(-5, 3));
        System.out.println(Math.min(5, 3));
        System.out.println(Math.min(-5, 3));
        
        
        System.out.println("=========Math.random()");
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 5));
        System.out.println((int) (Math.random() * 100));
        
        
    }
    
}

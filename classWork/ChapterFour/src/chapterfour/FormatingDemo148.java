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
public class FormatingDemo148 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians",
                "Sine", "Cosine", "Tangent");
        
        int degreees = 30;
        double radians = Math.toRadians(degrees);
        System.out.println("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians),
                Math.cos(radians), Math.tan(radians));
        
        
    }
}

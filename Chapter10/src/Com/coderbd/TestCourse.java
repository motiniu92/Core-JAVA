/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.coderbd;

/**
 *
 * @author User
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kenedy");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        
        String[] students = course1.getStudent();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) 
            System.out.print(students[i] + ",");
            System.out.println();
            
            System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
            
        
    }
}

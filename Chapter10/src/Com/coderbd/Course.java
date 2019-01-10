
package Com.coderbd;


public class Course {
   private String courseName;
   private String[] students = new String[100];
   private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
      
    }
   
    public void addStudent(String student){
      
    students[numberOfStudents] = student;
    numberOfStudents++;
    
    }
    
    public String[] getStudent(){
    return students;
    }
   
   public int getNumberOfStudents(){
   return numberOfStudents;
   }
   
   public String getCourseName(){
   return courseName;
   
   }
   
   public void dropStudent(String student){
   
   }
   
   public void dropStudents(String student){
   String[] s = new String[student.length()-1];
       for (int i = 0,  j = 0; i < s.length; i++, j++) {
           if(students[i] == student){
           j++;
           
           }
          s[i] = students[j]; 
       }
       this.students = s;
       numberOfStudents--;
   }
   
}

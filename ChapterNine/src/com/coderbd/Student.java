
package com.coderbd;

/**
 *
 * @author User
 */
public class Student {
    private int studentId;
    private String studentName;
    private String mobileNO;
    private boolean isActiveStudent;
    private Department department;
    
    
    public Student(){
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", mobileNO=" + mobileNO + ", isActiveStudent=" + isActiveStudent + ", department=" + department + '}';
    }

    public Student(int studentId, String studentName, String mobileNO, boolean isActiveStudent) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNO = mobileNO;
        this.isActiveStudent = isActiveStudent;
    }

    Student(int i, String motin, String string, boolean b, Department department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}

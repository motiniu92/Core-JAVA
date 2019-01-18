
package com.coderbd;

import java.util.Date;
import java.util.logging.Logger;


public class GeometricObject {

    boolean getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public abstract class GeometricObjects{
     private String color = "white";
     private boolean filled;
     private java.util.Date dateCreated;
     
     

        protected GeometricObjects() {
            dateCreated = new java.util.Date();           
        }

        
        protected GeometricObjects(String  color, boolean filled) {
            dateCreated =  new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        @Override
        public String toString() {
            return "created on" + dateCreated + "\ncolor:" + color + " and filled: " + filled;
        }
       
        public abstract double getArea();
        public abstract double getPerimeter();
        
       
    }
}

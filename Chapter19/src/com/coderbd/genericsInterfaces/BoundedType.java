
package com.coderbd.genericsInterfaces;



public class BoundedType {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2);
        Circle circle = new Circle(2);
        System.out.println("Same area? " + equalArea(rectangle, circle));
    }
    
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
    return object1.getArea() == object2.getArea();
    }

    private static String equalArea(Rectangle rectangle, Circle circle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

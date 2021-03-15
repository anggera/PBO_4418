/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author ACER
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creat a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The Area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        
        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The Area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        
        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The Area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        
        // Modify circle radius
        circle2.setRadius(100);
        System.out.println("The Area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
    }
}

class SimpleCircle {
    // The radius of this circle
    double radius = 1;
    
    // Construct a circle object
    SimpleCircle() {
    }
    
    // Construct a circle object
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    
    // Return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    // Set new radius for this circle
    double setRadius(double newRadius) {
        radius = newRadius;
        return 0;
    }
}
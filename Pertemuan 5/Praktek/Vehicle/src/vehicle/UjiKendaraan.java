/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author ACER
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        
        Bicycle bicycle = new Bicycle();
        
        MotorVehicle motorVehicle = new MotorVehicle();
        motorVehicle.speed = 80;
        motorVehicle.color = "Black";
        
        vehicle.goStraight();
        vehicle.turnLeft();
        vehicle.turnRight();
        System.out.println("Speed = "+vehicle.speed);
        
        System.out.println("Color = "+bicycle.color);
        bicycle.goStraight();
        bicycle.turnLeft();
        bicycle.ringBell();
        
        System.out.println("Speed = "+motorVehicle.speed);
        System.out.println("Color = "+motorVehicle.color);
        motorVehicle.goStraight();
        motorVehicle.turnRight();
        motorVehicle.getSizeofEngine();
        motorVehicle.getLicencePlate();
        
    }
}

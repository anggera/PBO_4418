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
    static void KendaraanMelaju(Vehicle v) {
        v.goStraight();
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
        MotorCycle motorcycle = new MotorCycle();
        Car car = new Car();
        
        MotorVehicle motorVehicle = new MotorVehicle();
        motorVehicle.speed = 80;
        motorVehicle.color = "Black";
        System.out.println("");
        
        vehicle.goStraight();
        vehicle.turnLeft();
        vehicle.turnRight();
        System.out.println("Speed = "+vehicle.speed);
        System.out.println("");
        
        System.out.println("Color = "+bicycle.color);
        bicycle.goStraight();
        bicycle.turnLeft();
        bicycle.ringBell();
        System.out.println("");
        
        System.out.println("Speed = "+motorVehicle.speed);
        System.out.println("Color = "+motorVehicle.color);
        motorVehicle.goStraight();
        motorVehicle.turnRight();
        motorVehicle.getSizeofEngine();
        motorVehicle.getLicencePlate();
        System.out.println("");
        
        motorcycle.getSizeofEngine();
        motorcycle.getLicencePlate();
        motorcycle.setGearFoot(3);
        System.out.println("Gear foot   = " +motorcycle.getGearFoot());
        System.out.println("");
        
        car.setSeatBelt(true);
        System.out.println("Seatbelt used   = " +car.getSeatBelt());
        car.turnLeft();
        System.out.println("");

        KendaraanMelaju(new Bicycle());
        KendaraanMelaju(new MotorCycle());
        KendaraanMelaju(new Car());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import transportasi.Bicycle;
import transportasi.Mobil;

/**
 *
 * @author ACER
 */
public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println("Seat belt nyala : " +mobil.getSeatBelt());
        
        Bicycle bicycle = new Bicycle();
        bicycle.ringBell();
    }
}

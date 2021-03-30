/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author ACER
 */
public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    public GamePlayer() {
    }
    
    public GamePlayer(double width, double height) {
    }
    
    public GamePlayer(double width, double height, int positionX, int positionY) {
    }
    
    public void setDimension(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public void setPosition(int newPositionX, int newPositionY) {
        positionX = newPositionX;
        positionY = newPositionY;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public int getX() {
        return positionX;
    }
    
    public int getY() {
        return positionY;
    }
    
    public void run() {
        System.out.println("Player is running");
    }
    
    public void run(int incrementX) {
        positionX = positionX + incrementX;
        System.out.println("Player still running, current X position = " +(positionX));
    }
}

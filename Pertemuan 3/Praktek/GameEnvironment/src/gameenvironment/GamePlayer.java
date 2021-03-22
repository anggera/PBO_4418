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
    double width;
    double height;
    int positionX;
    int positionY;
    
    GamePlayer() {
    }
    
    GamePlayer(double width, double height) {
    }
    
    GamePlayer(double width, double height, int positionX, int positionY) {
    }
    
    public void setDimension(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public void setPosition(int newPositionX, int newPositionY) {
        positionX = newPositionX;
        positionY = newPositionY;
    }
    
    double getWidth() {
        return width;
    }
    
    double getHeight() {
        return height;
    }
    
    int getX() {
        return positionX;
    }
    
    int getY() {
        return positionY;
    }
    
    public void run() {
        System.out.println("Player is running");
    }
    
    public void run(int incrementX) {
         System.out.println("Player still running, current X position = " +(incrementX+positionX));
    }
}

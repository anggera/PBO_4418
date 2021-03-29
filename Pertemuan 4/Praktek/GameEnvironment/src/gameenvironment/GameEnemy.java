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
public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    GameEnemy(){
    }
    
    GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
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
    
    public void Run() {
        System.out.println("Enemy is running");
    }
}

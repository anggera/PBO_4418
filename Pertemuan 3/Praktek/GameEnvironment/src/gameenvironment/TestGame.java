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
public class TestGame {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer();
        player.setDimension(2.5, 10);
        player.setPosition(1, 2);
        player.run();
        player.run(5);
        
        GameEnemy enemy = new GameEnemy();
        enemy.setDimension(7.5, 25);
        enemy.setPosition(100, 20);
        enemy.run();
    }
}

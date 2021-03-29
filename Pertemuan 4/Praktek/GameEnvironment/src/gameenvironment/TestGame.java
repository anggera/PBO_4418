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
//        GamePlayer player = new GamePlayer();
//        player.setDimension(2.5, 10);
//        player.setPosition(1, 2);
//        player.Run();
//        player.Run(5);
//        
//        GameEnemy enemy = new GameEnemy();
//        enemy.setDimension(7.5, 25);
//        enemy.setPosition(100, 20);
//        enemy.Run();

          GamePlayer hero = new GamePlayer();
          hero.setDimension(12, 12);
          hero.setPosition(10, 220);
          System.out.println("Posisi Player: " +hero.getX() +"," +hero.getY());
          hero.Run(12);
          System.out.println("Posisi Player: " +hero.getX() +"," +hero.getY());
          GamePlayer hero2 = new GamePlayer();
          hero2.setDimension(12, 32);
          hero2.setPosition(10, 10);
          
          GameEnemy monster = new GameEnemy();
          monster.setDimension(12, 32);
          monster.setPosition(10, 10);
          
          GameEnvironment scene = new GameEnvironment();
          scene.addPlayer(hero);
          scene.addPlayer(hero);
          scene.addPlayer(hero2);
          scene.getAllPlayers();
          scene.removePlayer(hero);
          scene.getAllPlayers();
          scene.addEnemy(monster);
          scene.Interaction();
    }
}

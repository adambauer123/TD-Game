import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int count = 0;
    public static int coins = 100, lives = 3;
    private int waveNum;
    public int timeTillNextWave = 60;
    private int time = 50;
    int i = 1;
    boolean towerSpawned = false;
    Tower tower;
    public MyWorld()
    {
        super(625, 700, 1);
        Greenfoot.setSpeed(50);
        GreenfootImage drawedImage = new GreenfootImage("lines.png");
        getBackground().drawImage(drawedImage, 0, 0);
        menu();
        coins = 100;
    }
    
    public void act(){
        SpawnEnemies();
        menuUpdate();
        if(i == 1) {
            Tower tower = new Tower(.5,.5,.5,.5,5,true);
            addObject(tower,50,50);
            i++;
        }
        time--;
        if(time == 0){
            timeTillNextWave--;
            time = 50;
        }
    }
    
    public void SpawnEnemies(){
        count++;
        Enemy1 enemy = new Enemy1();
        Enemy2 enemyTwo = new Enemy2();
        
        if(count % 50 == 0){
            addObject(enemy, 20, 150);
  
        }
        
        if(count % 250 == 0){
            //addObject(enemyTwo, 20, 150);
        }
    }
    
    
    public void menu(){
        GreenfootImage drawedImage = new GreenfootImage("menu.png");
        getBackground().drawImage(drawedImage, 0, 500);
        
        GreenfootImage red_tower_Image = new GreenfootImage("green_tower.png");
        getBackground().drawImage(red_tower_Image, 149+50, 501);
        
        showText("Coins: " + coins, 70, 525);
        showText("Wave Number: " + waveNum, 115, 575);
        showText("Next Wave: " + timeTillNextWave, 97, 625);
        showText("Lives: " + lives, 70, 675);
    }
    
    public void menuUpdate(){
        if (getObjectsAt(225, 550, Tower1.class).isEmpty()){
            Tower1 tower = new Tower1();
            addObject(tower, 225+50, 550);
        }
        
        showText("Coins: " + coins, 70, 525);
        showText("Wave Number: " + waveNum, 115, 575);
        showText("Next Wave: " + timeTillNextWave, 97, 625);
        showText("Lives: " + lives, 70, 675);
    }
 

        
}


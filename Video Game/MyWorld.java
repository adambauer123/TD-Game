import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private String coins, waveNum, timeTillNextWave, lives;
    public MyWorld()
    {
        super(625, 700, 1);
        GreenfootImage drawedImage = new GreenfootImage("lines.png");
        getBackground().drawImage(drawedImage, 0, 0);
        menu();
    }
    
    public void act(){
        SpawnEnemies();
    }
    
    public void SpawnEnemies(){
        count++;
        WorthlessEnemy enemy = new WorthlessEnemy();
        WorthlessEnemyTwo enemyTwo = new WorthlessEnemyTwo();
        
        if(count % 100 == 0 && count <= 1000){
            addObject(enemy, 20, 150);
        }
        
        if(count % 250 == 0 && count <= 1000){
            addObject(enemyTwo, 20, 150);
        }
        System.out.println(count);
    }
    
    
    public void menu(){
        GreenfootImage drawedImage = new GreenfootImage("menu.png");
        getBackground().drawImage(drawedImage, 0, 500);
        
        //getWorld().showText("text", 10, 10);
        coins = "Coins: ";
        showText(coins, 70, 525);
        
        waveNum = "Wave Number: ";
        showText(waveNum, 70, 575);
        
        timeTillNextWave = "Time until next wave: ";
        showText(timeTillNextWave, 70, 625);
        
        lives = "Lives: ";
        showText(lives, 70, 675);
    }
}

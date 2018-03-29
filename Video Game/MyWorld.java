import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
<<<<<<< HEAD
    private int count = 0;
=======

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int count = 0;
    
>>>>>>> parent of 9cab9ad... Changes
    private int enemySpawnTimer = -1;
    private boolean canSpawn = true;
    private int numberSpawn = 0;
    private int waveNumber = 0;
<<<<<<< HEAD
    public static int coins = 100;
    private int i = 1;
    private int waveNum = 1;
    public int timeTillNextWave = 10;
    private int time = 50;
    public static int playerLives = 5;
    private int waveCount = 0;
    boolean towerSpawned = false;
    int oldCoins, oldWaveNum, oldTimeTillNextWave, oldPlayerLives;
    public static int levelID = 1;

    Tower tower;

    enemy Enemy;

    GreenfootImage bg;
    GreenfootImage mapImage;
    GreenfootImage menuImage;
    GreenfootImage tower1menu = new GreenfootImage("green_tower.png");
    GreenfootImage tower2menu = new GreenfootImage("blue_tower.png");

    public MyWorld(){
        super(625, 700, 1);

        
        Greenfoot.setSpeed(50);
        reset();


    }

    public void reset(){
        waveNumber = 0;
        coins = 100;
        playerLives = 5;

        timeTillNextWave = 10;
        waveCount = 0;


=======

    public static int coins = 100;
    private int i = 1;

    private int waveNum = 1;
    public int timeTillNextWave = 10;

    private int time = 50;

    public static int playerLives = 5;
    private int waveCount = 0;

    boolean towerSpawned = false;
    Tower tower;
    
    GreenfootImage drawedImage = new GreenfootImage("menu.png");
    GreenfootImage tower1menu = new GreenfootImage("green_tower.png");
    GreenfootImage tower2menu = new GreenfootImage("blue_tower.png");
    int oldCoins, oldWaveNum, oldTimeTillNextWave, oldPlayerLives;
    
    public MyWorld()
    {
        super(625, 700, 1);
        Greenfoot.setSpeed(50);
        GreenfootImage drawedImage = new GreenfootImage("lines.png");
        getBackground().drawImage(drawedImage, 0, 0);
        menu();
        coins = 100;
        playerLives = 5;
        
>>>>>>> parent of 9cab9ad... Changes
        oldCoins = coins;
        oldWaveNum = waveNum;
        oldTimeTillNextWave = timeTillNextWave;
        oldPlayerLives = playerLives;
<<<<<<< HEAD
        bg = getBackground();
        switch(levelID){
            case 1:
            mapImage = new GreenfootImage("lines.png");
            menuImage = new GreenfootImage("menu.png");
            bg.setColor(greenfoot.Color.RED);
            break;
            case 2:

            
            mapImage = new GreenfootImage("lines2.png");
            menuImage = new GreenfootImage("menu2.png");
            bg.setColor(greenfoot.Color.BLACK);

            break;
        }
        menu();
        getBackground().drawImage(mapImage, 0, 0);
    }

    public void act(){
        if(timeTillNextWave <= 0){

            if(levelID == 1) {
                enemyWaves();
            } else if (levelID == 2) {
                enemyWaves2();
            }

        }
        if(waveNumber >= 10) {
            levelID = 2;
            reset();

        }
        menuUpdate();
        if(i == 1) {
            Tower tower = new Tower();

            enemy Enemy = new enemy();

            addObject(tower,50,50);
            i++;
        }
        time--;
        if(time == 0){
            if(timeTillNextWave > 0){
                timeTillNextWave--;
            }
            time = 50;
        }
        if(playerLives <= 0){
            Greenfoot.setWorld(new Defeat());
        }
    }


    public void menu(){
        getBackground().drawImage(menuImage, 0, 480);
        getBackground().drawImage(tower1menu, 149+50, 501);
        getBackground().drawImage(tower2menu, 149+200, 501);
    }

    public void menuUpdate(){
        if (getObjectsAt(225+50, 550, Tower1.class).isEmpty()){
            Tower1 tower = new Tower1();
            addObject(tower, 225+50, 550);
=======
    }
    
    public void act(){
        if(timeTillNextWave <= 0){
            //SpawnEnemies();
            enemyWaves();
        }

        menuUpdate();
        if(i == 1) {
            Tower tower = new Tower();
            addObject(tower,50,50);
            i++;
        }
        time--;
        if(time == 0){
            if(timeTillNextWave > 0){
                timeTillNextWave--;
            }
            time = 50;
        }
        
        if(playerLives <= 0){
            Greenfoot.setWorld(new Defeat());
        }
        
    }
    
    public void menu(){
        getBackground().drawImage(drawedImage, 0, 480);
        getBackground().drawImage(tower1menu, 149+50, 501);
        getBackground().drawImage(tower2menu, 149+200, 501);
    }
    
    public void menuUpdate(){
        if (getObjectsAt(225+50, 550, Tower1.class).isEmpty()){
            Tower1 tower = new Tower1();
            addObject(tower, 225+50, 550);
        }
        
        if (getObjectsAt(225+200, 550, Tower2.class).isEmpty()){
            Tower2 tower = new Tower2();
            addObject(tower, 225+200, 550);
>>>>>>> parent of 9cab9ad... Changes
        }
       
        menu();
        GreenfootImage bg = getBackground();
        bg.setColor(greenfoot.Color.RED);
        bg.setFont(bg.getFont().deriveFont(18f));
        bg.drawString ("Coins: " + coins, 25, 540);
        bg.drawString ("Wave Number: " + waveNum, 25, 580);
        bg.drawString ("Next Wave: " + timeTillNextWave, 25, 620);
        bg.drawString ("Lives: " + playerLives, 25, 660);
        bg.drawString ("10 Coins ", 240, 600);
        bg.drawString ("20 Coins ", 400, 600);
    }
    
    private void enemyWaves() {
        Enemy1 enemy = new Enemy1();
        Enemy2 enemy2 = new Enemy2();
        count++;

<<<<<<< HEAD
        if (getObjectsAt(225+200, 550, Tower2.class).isEmpty()){
            Tower2 tower = new Tower2();
            addObject(tower, 225+200, 550);
        } 

        menu();
        bg.setFont(bg.getFont().deriveFont(18f));
        bg.drawString ("Coins: " + coins, 25, 540);
        bg.drawString ("Wave Number: " + waveNum, 25, 580);
        bg.drawString ("Next Wave: " + timeTillNextWave, 25, 620);
        bg.drawString ("Lives: " + playerLives, 25, 660);
        bg.drawString ("10 Coins ", 240, 600);
        bg.drawString ("20 Coins ", 400, 600);
    }

    private void enemyWaves() {
        Enemy1 enemy = new Enemy1();
        Enemy2 enemy2 = new Enemy2();
        count++;

        if(waveCount < 5 + waveNumber) {

            if(count % 133 == 0) {
                addObject(enemy2,20,150);
                enemySpawnTimer = 0;


            }

            if(count % 50 == 0) {
                addObject(enemy,20,150);
                waveCount += 1;
            }
=======

        if(waveCount < 5 + waveNumber) {
           
            
            if(count % 133 == 0) {
                    addObject(enemy2,20,150);
                    enemySpawnTimer = 0;
                    
                

                }
                
            if(count % 50 == 0) {
                addObject(enemy,20,150);
                waveCount += 1;
            }
            
            } else {
                waveCount = 0;
                waveNumber += 1;
                timeTillNextWave += 10;
                waveNum += 1;
            }

        }
        }

>>>>>>> parent of 9cab9ad... Changes

        } else if(getObjects(enemy.class).size()== 0) {
            if(count % 50 == 0) {
                addObject(enemy,20,150);
                waveCount += 1;
            }

        } else {

            waveCount = 0;
            waveNumber += 1;
            timeTillNextWave += 10;
            waveNum += 1;
        }
    }

    private void enemyWaves2() {
        Enemy1 enemy = new Enemy1();
        Enemy2 enemy2 = new Enemy2();
        count++;

<<<<<<< HEAD
        if(waveCount < 5 + waveNumber) {

            if(count % 133 == 0) {
                addObject(enemy2,20,35);
                enemySpawnTimer = 0;

            }
        }

        if(count % 50 == 0) {
            addObject(enemy,20,35);
            waveCount += 1;
        }

        else if( (getObjects(enemy.class).size() == 0)) {

            waveCount = 0;
            waveNumber += 1;
            timeTillNextWave += 10;
            waveNum += 1;
        }
    }
}
=======


>>>>>>> parent of 9cab9ad... Changes


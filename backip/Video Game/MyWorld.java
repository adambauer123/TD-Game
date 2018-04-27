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

    private int count = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */


    private int enemySpawnTimer = -1;
    private boolean canSpawn = true;
    private int numberSpawn = 0;
    private int waveNumber = 0;

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
    Tower2 tower2;
    Tower3 tower3;

    enemy Enemy;

    GreenfootImage bg;
    GreenfootImage mapImage;
    GreenfootImage menuImage;
    GreenfootImage tower1menu = new GreenfootImage("green_tower.png");
    GreenfootImage tower2menu = new GreenfootImage("blue_tower.png");
    GreenfootImage tower3menu = new GreenfootImage("purple_tower.png");
    GreenfootImage transition_to_2 = new GreenfootImage("transition_to_2.png");

        
    public MyWorld(boolean level){
        super(625, 700, 1);
        Greenfoot.setSpeed(50);

        if(level == true) {
            levelID = 2;
        } else {
            levelID = 1;
        }
        reset();

    }

    public void reset(){
        coins = 100;
        playerLives = 5;
        waveNumber = 0;
        timeTillNextWave = 10;
        waveCount = 0;

        oldCoins = coins;
        oldWaveNum = waveNum;
        oldTimeTillNextWave = timeTillNextWave;
        oldPlayerLives = playerLives;
        bg = getBackground();
        switch(levelID){
            case 1:
            mapImage = new GreenfootImage("lines.png");
            menuImage = new GreenfootImage("menu.png");
            bg.setColor(greenfoot.Color.RED);
            break;
            case 2:
            Greenfoot.setWorld(new Transition());

            List objects = getObjects(null);
            removeObjects(objects);
            mapImage = new GreenfootImage("lines2.png");
            menuImage = new GreenfootImage("menu2.png");
            bg.setColor(greenfoot.Color.BLACK);

            break;
        }
        menu();
        getBackground().drawImage(mapImage, 0, 0);
    }

    
    public void act(){
        //Next line could cause issues
        setPaintOrder(Circle.class,Tower1.class, Tower2.class, Tower3.class, FastBullet.class, bullet.class);
        if(Greenfoot.isKeyDown("p")) {
            waveNum = 9;
        }
        if(timeTillNextWave <= 0){
            if(levelID == 1) {

                enemyWaves1();
            } else if (levelID == 2) {
                enemyWaves2();
            }
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
        getBackground().drawImage(menuImage, 0, 480);
        getBackground().drawImage(tower1menu, 149+50, 501);
        getBackground().drawImage(tower2menu, 149+200, 501);
        getBackground().drawImage(tower3menu, 149+50, 501+100);
    }

    public void menuUpdate(){
        if (getObjectsAt(225+50, 550, Tower1.class).isEmpty()){
            Tower1 tower = new Tower1();
            addObject(tower, 225+50, 550);
        }

        if (getObjectsAt(225+200, 550, Tower2.class).isEmpty()){
            Tower2 tower = new Tower2();
            addObject(tower, 225+200, 550);
        }

        if (getObjectsAt(225+50, 550+100, Tower3.class).isEmpty()){
            Tower3 tower = new Tower3();
            addObject(tower, 225+50, 550+100);
        }
        menu();
        bg.setFont(bg.getFont().deriveFont(18f));
        bg.drawString ("Coins: " + coins, 25, 540);
        bg.drawString ("Wave Number: " + waveNum, 25, 580);
        bg.drawString ("Next Wave: " + timeTillNextWave, 25, 620);
        bg.drawString ("Lives: " + playerLives, 25, 660);
        bg.drawString ("25 Coins ", 240, 600);
        bg.drawString ("50 Coins ", 400, 600);
        bg.drawString ("75 Coins ", 240, 699);
    }


    private void enemyWaves1() {
        Enemy1 enemy = new Enemy1();
        Enemy2 enemy2 = new Enemy2();
        count++;

        if(waveCount < 6 + waveNumber) {
            if(count % 133 == 0) {
                addObject(enemy2,20,150);
                enemySpawnTimer = 0;

            }

            if(count % 50 == 0) {
                addObject(enemy,20,150);
                waveCount += 1;
            }

        }else if( (getObjects(enemy.class).size() == 0)) {

            waveCount = 0;
            waveNumber += 1;
            timeTillNextWave += 10;
            waveNum += 1;
            if(waveNum == 10) {
                levelID++;
                waveNum = 0;
                reset();
            }
        }
    }

              

    private void enemyWaves2() {
        Enemy1 enemy = new Enemy1();
        Enemy2 enemy2 = new Enemy2();
        Enemy3 enemy3 = new Enemy3();
        count++;

        if(waveCount < 7 + waveNumber) {
            if(count % 133 == 0) {
                addObject(enemy2,20,35);
                enemySpawnTimer = 0;

            }

            if(count % 50 == 0) {
                addObject(enemy,20,35);
                waveCount += 1;
            }

            if(count % 250 == 0) {
                addObject(enemy3, 20,35);
            }

        }else if( (getObjects(enemy.class).size() == 0)) {
            waveCount = 0;
            waveNumber += 1;
            timeTillNextWave += 10;
            waveNum += 1;
            if(waveNum == 10) {
                Greenfoot.setWorld(new Victory());
            }
        }
    }
}




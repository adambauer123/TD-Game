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
    int x = 0;
    int y = 0;
    boolean towerSpawned = false;
    Tower tower;
    public MyWorld()
    {
        super(625, 700, 1);
        GreenfootImage drawedImage = new GreenfootImage("lines.png");
        getBackground().drawImage(drawedImage, 0, 0);
        menu();
    }
    
    public void act(){
        SpawnEnemies();
        //dragNDrop();
    }
    
    public void SpawnEnemies(){
        count++;
        Enemy1 enemy = new Enemy1();
        Enemy2 enemyTwo = new Enemy2();
        
        if(count % 100 == 0){
            addObject(enemy, 20, 150);
  
        }
        
        if(count % 250 == 0){
            //addObject(enemyTwo, 20, 150);
        }
    }
    
    
    public void menu(){
        GreenfootImage drawedImage = new GreenfootImage("menu.png");
        getBackground().drawImage(drawedImage, 0, 500);
        
        //getWorld().showText("text", 10, 10);
        coins = "Coins: ";
        showText(coins, 70, 525);
        
        waveNum = "Wave Number: ";
        showText(waveNum, 70, 575);
        
        timeTillNextWave = "Next Wave: ";
        showText(timeTillNextWave, 70, 625);
        
        lives = "Lives: ";
        showText(lives, 70, 675);
        
        
        
        
        GreenfootImage red_tower_Image = new GreenfootImage("green_tower.png");
        getBackground().drawImage(red_tower_Image, 150, 500);
        
        Tower tower = new Tower1();
        addObject(tower, 225, 550);
        
    }
    
    public void dragNDrop(){
        if(tower.getX() != 225 && tower.getY() != 550){
            Tower newTower = new Tower1();
            addObject(newTower, 225, 550);
        }
    }
}


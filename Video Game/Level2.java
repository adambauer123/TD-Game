import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
<<<<<<< HEAD

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
=======
    private int count = 0;


    public static int coins = 100;
    private int i = 1;

    private int waveNum;
    public int timeTillNextWave = 10;

    private int time = 50;

    public static int playerLives = 5;

    boolean towerSpawned = false;
    Tower tower;
    
    GreenfootImage drawedImage = new GreenfootImage("menu2.png");
    GreenfootImage tower1menu = new GreenfootImage("green_tower.png");
    GreenfootImage tower2menu = new GreenfootImage("blue_tower.png");
    int oldCoins, oldWaveNum, oldTimeTillNextWave, oldPlayerLives;
    
    public Level2()
    {
        super(625, 700, 1);
        Greenfoot.setSpeed(50);
        GreenfootImage drawedImage = new GreenfootImage("lines2.png");
        getBackground().drawImage(drawedImage, 0, 0);
        menu();
        coins = 100;
        playerLives = 5;
        
        oldCoins = coins;
        oldWaveNum = waveNum;
        oldTimeTillNextWave = timeTillNextWave;
        oldPlayerLives = playerLives;
    }
    
    public void act(){
        if(timeTillNextWave <= 0){
            SpawnEnemies();
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
    
    public void SpawnEnemies(){
        count++;
        Enemy1 enemy = new Enemy1();
        Enemy2 enemyTwo = new Enemy2();
        
        if(count % 50 == 0){
            addObject(enemy, 20, 35);
  
        }
        
        if(count % 125 == 0){
           addObject(enemyTwo, 20, 35);
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
        }
       
        menu();
        GreenfootImage bg = getBackground();
        bg.setColor(greenfoot.Color.BLACK);
        bg.setFont(bg.getFont().deriveFont(18f));
        bg.drawString ("Coins: " + coins, 25, 540);
        bg.drawString ("Wave Number: " + waveNum, 25, 580);
        bg.drawString ("Next Wave: " + timeTillNextWave, 25, 620);
        bg.drawString ("Lives: " + playerLives, 25, 660);
        bg.drawString ("10 Coins ", 240, 600);
        bg.drawString ("20 Coins ", 400, 600);
>>>>>>> Tylers-Branch
    }
}

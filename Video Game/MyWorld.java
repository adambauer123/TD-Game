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
    public MyWorld()
    {
        super(625, 500, 1);
        //background =  new Background();
        //addObject(img1, getWidth()/2, getHeight()/2);
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
    

}

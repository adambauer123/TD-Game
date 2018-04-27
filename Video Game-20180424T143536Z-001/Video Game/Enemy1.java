import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends enemy
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double health = 5;
    public int id;
    public static int E1X = 0;
    public static int E1Y = 0;

    public void act() 
    {
        E1X = getX();
        E1Y = getY();

        if(getWorld() != null){
            MoveAroundMap();
            if (getWorld() != null){
                MoveAroundMap();
            }
            if(getWorld() != null){
                MoveAroundMap();

                if(getWorld() != null){
                    checkCollision();
                }
            }
        }
    }

    public void checkCollision(){
        
        if(isTouching(bullet.class)){
            health -= 1;
            removeTouching(bullet.class);         
        }
        if(isTouching(FastBullet.class)){
            health -= .15;
            removeTouching(FastBullet.class);
        }
        if(isTouching(ExplosiveBullet.class)){
            List<Enemy1> enemies1 = getObjectsInRange(100, Enemy1.class);
            List<Enemy2> enemies2 = getObjectsInRange(100, Enemy2.class);
            List<Enemy3> enemies3 = getObjectsInRange(100, Enemy3.class);
            
            health -= 1.5;
            for (int j = 0; j < enemies2.size(); j++) {
                ((Enemy2)enemies2.get(j)).explosiveLoseHP();
            }
            
            for (int j = 0; j < enemies1.size(); j++) {
                ((Enemy1)enemies1.get(j)).explosiveLoseHP();
            }
            
            
            for (int j = 0; j < enemies3.size(); j++) {
                ((Enemy3)enemies3.get(j)).explosiveLoseHP();
            }
            removeTouching(ExplosiveBullet.class);
        }
            
        if(checkHp(health) == true) {
            Greenfoot.playSound("enemy1ded.wav");
            getWorld().removeObject(this);
            MyWorld.coins += 1;
        } 
    }
    
    public void explosiveLoseHP(){
        health -= 1.5;
    }
}


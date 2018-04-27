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
<<<<<<< HEAD

=======
    
    
    
>>>>>>> Tylers-Branch
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
<<<<<<< HEAD

    public void checkCollision(){
        
=======
    
    //removes a certain amount of health if hit by a bullet
    public void checkCollision(){
        //if the bullet hits it it removes help and removes bullet
>>>>>>> Tylers-Branch
        if(isTouching(bullet.class)){
            health -= 1;
            removeTouching(bullet.class);         
        }
        //if the fast bullet hits it it removes health and removes bullet
        if(isTouching(FastBullet.class)){
            health -= .15;
            removeTouching(FastBullet.class);
        }
<<<<<<< HEAD
=======
        //if explosive bullet hits it, it causes damage to itself and other enemies around it
        //then removes the bullet itself
>>>>>>> Tylers-Branch
        if(isTouching(ExplosiveBullet.class)){
            List<Enemy1> enemies1 = getObjectsInRange(100, Enemy1.class);
            List<Enemy2> enemies2 = getObjectsInRange(100, Enemy2.class);
            List<Enemy3> enemies3 = getObjectsInRange(100, Enemy3.class);
            
            health -= 1.5;
            for (int j = 0; j < enemies2.size(); j++) {
                ((Enemy2)enemies2.get(j)).explosiveLoseHP();
            }
<<<<<<< HEAD
            
=======
>>>>>>> Tylers-Branch
            for (int j = 0; j < enemies1.size(); j++) {
                ((Enemy1)enemies1.get(j)).explosiveLoseHP();
            }
            
            
            for (int j = 0; j < enemies3.size(); j++) {
                ((Enemy3)enemies3.get(j)).explosiveLoseHP();
            }
<<<<<<< HEAD
            removeTouching(ExplosiveBullet.class);
        }
            
=======
            Greenfoot.playSound("boom.wav");
            removeTouching(ExplosiveBullet.class);
        }
        
        //if enemy dies, plays sound and gives coins to the player
>>>>>>> Tylers-Branch
        if(checkHp(health) == true) {
            Greenfoot.playSound("enemy1ded.wav");
            getWorld().removeObject(this);
            MyWorld.coins += 1;
        } 
    }
    
<<<<<<< HEAD
=======
    //the amount of damage to deal if hit with explosive damage
>>>>>>> Tylers-Branch
    public void explosiveLoseHP(){
        health -= 1.5;
    }
}


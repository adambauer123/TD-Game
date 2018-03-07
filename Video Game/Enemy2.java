import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends enemy
{

    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double Enemy2health = 5;
    public int id;
    public void act() 
    {
        MoveAroundMap();
        if (getWorld() != null){
            MoveAroundMap();
        }
        if(getWorld() != null){
            checkCollision();
        }
    }    
    
    public void checkCollision(){
        if(isTouching(bullet.class)){
            Enemy2health -= 1;
            removeTouching(bullet.class);
        }
        if(isTouching(FastBullet.class)){
            Enemy2health -= .1;
            removeTouching(FastBullet.class);
        }
        if(checkHp(Enemy2health) == true) {
            getWorld().removeObject(this);
            MyWorld.coins += 2;
        }    
    }
}


        


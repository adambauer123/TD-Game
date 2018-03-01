import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
    private int health = 3;
    public int id;
    public static int E1X = 0;
    public static int E1Y = 0;
    public static int idNumber = 0;
    
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
                checkCollision();
            }
        }
    }
        
    public void checkCollision(){
        if(isTouching(bullet.class)){
            health -= 1;
            removeTouching(bullet.class);
        }
        if(isTouching(FastBullet.class)){
            health -= 1;
            removeTouching(FastBullet.class);
        }
        if(checkHp(health) == true) {
            getWorld().removeObject(this);
            MyWorld.coins += 1;


        }
    }
}
    
 

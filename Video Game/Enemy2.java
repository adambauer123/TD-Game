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
    private int health = 1000;
    public void act() 
    {
        MoveAroundMap();
        if(checkHp(health) == true) {
            getWorld().removeObject(this);
        
    }    
}
}


        


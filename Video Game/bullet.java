import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bullet extends Actor
{
    private int firstX = 0;
    private int firstY = 0;
    public void act() 
    {
        turnTowards(Tower1.targetX,Tower1.targetY);

        if(Tower.targetX > Tower.targetX2) {
                firstX = Tower.targetX;
                firstY = Tower.targetY;
            } else {
                firstX = Tower.targetX2;
                firstY = Tower.targetY2;
            }
        turnTowards(firstX,firstY);

        move(7);
       // if (getWorld().getObjects(Enemy1.class).isEmpty()){
           // getWorld().removeObject(this);
       // }
    }
}



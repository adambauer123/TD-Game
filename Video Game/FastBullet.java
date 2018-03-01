import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FastBullet extends Actor
{
    
    private int firstX = 0;
    private int firstY = 0;
    public void act() 
    {
        turnTowards(Tower2.targetX,Tower2.targetY);

        if(Tower.targetX > Tower.targetX2) {
                firstX = Tower.targetX;
                firstY = Tower.targetY;
            } else {
                firstX = Tower.targetX2;
                firstY = Tower.targetY2;
            }
        turnTowards(firstX,firstY);

        move(7);
        if(this.getX() < 30){
            getWorld().removeObject(this);}
      
            }
        }
    



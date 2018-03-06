import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FastBullet extends Actor
{
    private int i = 1;
    private int firstX = 0;
    private int firstY = 0;
    public void act() 
    {

        if(Tower.targetX > Tower.targetX2) {
                firstX = Tower.targetX;
                firstY = Tower.targetY;
            } else {
                firstX = Tower.targetX2;
                firstY = Tower.targetY2;
            }
            move(7);
        if(i == 1) {
        turnTowards(firstX,firstY);
        i++;
    }
    /*
        if(Tower.enemyOnScreen == false) {
            move(5);
            move(5);
            move(5);
            move(5);
        }
        */
    }
}
   



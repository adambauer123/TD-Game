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
    private int count2 = 0;
    public void act() 
    {

        if(Tower.targetX == 0) {

                firstX = Tower.targetX2;
                firstY = Tower.targetY2;
            } else {
                firstX = Tower.targetX;
                firstY = Tower.targetY;
            }


        if(getX() <= firstX+10 && getX() >= firstX-10 && getY() <= firstY+10 && getY() >= firstY-10){
            count2++;
        }
        if(count2 == 0){
            turnTowards(firstX,firstY);
        }
        move(7);
        
        if(getX() == 0 || getY() == 0){
            getWorld().removeObject(this);

        }
    }
}





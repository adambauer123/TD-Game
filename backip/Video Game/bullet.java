import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bullet extends Tower
{
    private int firstX = 0;
    private int firstY = 0;
    private int count2 = 0;
    public void act() 
    {
        enemy closestEnemy = getClosestEnemy(500);
        move(7);
        if(closestEnemy != null) {
            firstX = closestEnemy.getX();
            firstY = closestEnemy.getY();
        }

        if(getX() <= firstX+10 && getX() >= firstX-10 && getY() <= firstY+10 && getY() >= firstY-10){
            count2++;
        }

        if(count2 == 0){
            turnTowards(firstX,firstY);
        }
        if(getX() == 0 || getY() == 0 || getX() == 624 || getY() == 699){
            getWorld().removeObject(this);
        }
    }

}

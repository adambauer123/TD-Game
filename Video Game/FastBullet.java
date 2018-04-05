import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FastBullet extends Tower
{
    private int firstX = 0;
    private int firstY = 0;
    private int count2 = 0;
    public void act() 
    {

        enemy closestEnemy = getClosestEnemy(500);
        move(9);

        if(closestEnemy != null) {
            firstX = closestEnemy.getX();
            firstY = closestEnemy.getY();
        }
<<<<<<< HEAD

        if(getX() <= firstX+20 && getX() >= firstX-20 && getY() <= firstY+20 && getY() >= firstY-20){
            count2++;
        }

=======
        
        /*
        if(getX() <= firstX+20 && getX() >= firstX-20 && getY() <= firstY+20 && getY() >= firstY-20){
            count2++;
        }
        */
        
>>>>>>> Tylers-Branch
        if(count2 == 0){
            turnTowards(firstX,firstY);
            count2++;
        }
        
        if(getX() == 0 || getY() == 0 || getX() == 624 || getY() == 699){
            getWorld().removeObject(this);
        }
    }

}
<<<<<<< HEAD

=======
>>>>>>> Tylers-Branch

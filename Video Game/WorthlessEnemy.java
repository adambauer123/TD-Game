import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorthlessEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorthlessEnemy extends Actor
{
    /**
     * Act - do whatever the WorthlessEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX() < 175){
            setLocation(getX() + 1, getY());
        } else if (getX() == 175 && getY() < 360){
            setLocation(getX(), getY() + 1);
        } else if (getY() == 360 && getX() < 320){
            setLocation(getX() + 1, getY());
        } else if(getX() == 320 && getY() > 50){
            setLocation(getX(), getY() - 1);
        } else if (getY() == 50 && getX() < 510){
            setLocation(getX() + 1, getY());
        } else if (getX() == 510){
            setLocation(getX(), getY() + 1);
        }
        
        
        System.out.println(getX() + ", " + getY());
    }    
}

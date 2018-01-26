import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorthlessEnemyTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorthlessEnemyTwo extends Actor
{
    /**
     * Act - do whatever the WorthlessEnemyTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 1;
    
    public void act() 
    {
       MoveAroundMap();
       System.out.println(getX() + ", " + getY());
    }
    
    public void MoveAroundMap(){
        if(getX() < 175){
            setLocation(getX() + speed, getY());
        } else if (getX() == 175 && getY() < 360){
            setLocation(getX(), getY() + speed);
        } else if (getY() == 360 && getX() < 320){
            setLocation(getX() + speed, getY());
        } else if (getX() == 320 && getY() > 50){
            setLocation(getX(), getY() - speed);
        } else if (getY() == 50 && getX() < 510){
            setLocation(getX() + speed, getY());
        } else if (getX() == 510 && getY() < 465){
            setLocation(getX(), getY() + speed);
        } else if (getY() == 465){
            setLocation(getX() + speed, getY());
        }
    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    public void act() 
    {
        // Add your action code here.
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
        } else if (getY() == 465 && getX() != 624){
            setLocation(getX() + speed, getY());
        } else {
            getWorld().removeObject(this);
            MyWorld.playerLives -= 1;
        }
    }
   
    public boolean checkHp(int health) {
        if(health <= 0) {
            return true;
        }
        else
            return false;
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends HealthActor
{

    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    public void act() 
    {

    }
    
    //Moves the enemies around the map, removes life from player once they reach the end
    public void MoveAroundMap(){
        
        if (MyWorld.levelID == 1) {
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

        }else if (MyWorld.levelID == 2) {

            if(getX() < 370 && getY() == 35){
                setLocation(getX() + speed, getY());
            } else if (getX() == 370 && getY() != 270 && getY() != 400){
                setLocation(getX(), getY() + speed);
            } else if (getY() == 270 && getX() != 80 && getX() != 500){
                setLocation(getX() - speed, getY());
            } else if(getX() == 80 && getY() != 400){
                setLocation(getX(), getY() + speed);       
            } else if(getY() == 400 && getX() != 500){
                setLocation(getX() + speed, getY());
            } else if(getX() == 500 && getY() != 155){
                setLocation(getX(), getY() - speed);
            } else if(getY() == 155 && getX() != 624){
                setLocation(getX() + speed, getY());
            } else {
                getWorld().removeObject(this);
                MyWorld.playerLives -= 1;
            }
        }
    }
    
    //Check if the HP of the enemy is 0, if it is, it returns true
    public boolean checkHp(double health) {
        if(health <= 0) {
            return true;
        }
        else
            return false;
    }
}

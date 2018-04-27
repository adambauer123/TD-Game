import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ButtonHard extends Actor
{
    GreenfootImage bg;
    public static boolean removeThis = false;
    /**
     * Act - do whatever the ButtonHard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonHard(){
        //Draws the button
        setImage(new GreenfootImage(" Hard mode ", 45, Color.BLACK, Color.ORANGE));
    }
    
    public void act() 
    {
        //Removes hard button if small button is pressed
        if(removeThis == true) {
            getWorld().removeObject(this);
        }
        //Constructs the new world with hard difficulty
        if (Greenfoot.mouseClicked(this)) {
            MyWorld.isEasy = false;
            getWorld().removeObject(this);
            removeThis = true;
            Greenfoot.setWorld(new MyWorld(false));
        }
    }    
}

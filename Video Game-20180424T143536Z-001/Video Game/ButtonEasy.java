import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ButtonEasy extends Actor
{
    /**
     * Act - do whatever the ButtonEasy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bg;
    public ButtonEasy(){
        setImage(new GreenfootImage(" Easy mode ", 45, Color.BLACK, Color.ORANGE));
    }
        
    public void act() 
    {
        
        if(ButtonHard.removeThis == true) {
            getWorld().removeObject(this);
        }
        if (Greenfoot.mouseClicked(this)) {
            MyWorld.isEasy = true;
            getWorld().removeObject(this);
            ButtonHard.removeThis = true;
            Greenfoot.setWorld(new MyWorld(false));
        }
    }    
}
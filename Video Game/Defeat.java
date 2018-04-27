import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Defeat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defeat extends World
{

    /**
     * Constructor for objects of class Defeat.
     * 
     */
    public Defeat()
    {    
        super(625, 700, 1);
        
        //Creates and adds a try again button to the screen
        DefeatButton button = new DefeatButton();
        addObject(button,312,550);
    }
}



import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends World
{

    /**
     * Constructor for objects of class Victory.
     * 
     */
    public Victory()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(625, 700, 1);

        //Creates and adds a play again button to the screen
        VictoryButton button = new VictoryButton();
        addObject(button,312,550);
<<<<<<< HEAD
=======
        Greenfoot.playSound("victory.wav");
>>>>>>> Tylers-Branch
    }
}



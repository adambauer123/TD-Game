import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class VictoryButton extends Actor
{
    public VictoryButton()
    {
        //Draws the button image
        setImage(new GreenfootImage(" Play again ", 70, Color.BLACK, Color.ORANGE));
    }

    public void act() {
        //Checks for user click
        if (Greenfoot.mouseClicked(this)) 
        {
            {

                //Restarts the game
                Greenfoot.setWorld(new Intro());

            }
        }
    }
}


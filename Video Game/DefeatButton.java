import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DefeatButton extends Actor
{
    public DefeatButton()
    {
        //Draws button with try again text
        setImage(new GreenfootImage(" Try again ", 70, Color.WHITE, Color.BLACK));
    }

    public void act() {
        //Checks for user click
        if (Greenfoot.mouseClicked(this)) 
        {
            {
                //Restarts game
                Greenfoot.setWorld(new Intro());

            }
        }
    }
}


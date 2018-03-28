import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{

    /**
     * Constructor for objects of class Intro.
     * 
     */
    GreenfootImage bg;
    boolean continued = false;
    int count = 0;
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(625, 700, 1);
        Greenfoot.start();
    }
    
    public void act(){
        
        if(Greenfoot.isKeyDown("space") && count == 0){
            bg = new GreenfootImage("intro2.png");
            setBackground(bg);
            count++;
        } else if (count > 0){
            count++;
        }
        
        if(Greenfoot.isKeyDown("space") && count > 50){
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
}

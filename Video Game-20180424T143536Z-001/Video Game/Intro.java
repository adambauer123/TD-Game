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
    int count = 0, time = 0;
    ButtonEasy buttonEasy;
    ButtonHard buttonHard;
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(625, 700, 1);
        Greenfoot.start();
        
    }

    public void act(){

        time++;
        
        if(Greenfoot.isKeyDown("space") && count == 0){
            bg = new GreenfootImage("intro2.png");
            setBackground(bg);
            count++;
            time = 0;
        }
        
        
        if(Greenfoot.isKeyDown("space") && time > 30 && count == 1){
            bg = new GreenfootImage("intro3.png");
            setBackground(bg);
            count++;
            time = 0;
        }
        
        if(Greenfoot.isKeyDown("space") && time > 30 && count == 2){
            bg = new GreenfootImage("intro4.png");
            setBackground(bg);
            buttonEasy = new ButtonEasy();
            buttonHard = new ButtonHard();
            addObject(buttonEasy,130,230);
            addObject(buttonHard,130,530);
            count++;
            time = 0;
        }
        
        if(Greenfoot.isKeyDown("l")){
            MyWorld.isEasy = false;
            Greenfoot.setWorld(new MyWorld(false));
        }
        /*
        if(Greenfoot.isKeyDown("space") && time > 30 && count == 3){
            Greenfoot.setWorld(new MyWorld(false));
        }
        */
        /*
        if(Greenfoot.isKeyDown("space") && time > 30 && count == 2){
            Greenfoot.setWorld(new MyWorld(false));
        }
        */
    }
}
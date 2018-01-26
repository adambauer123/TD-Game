import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicTower extends Actor
{
    /**
     * Act - do whatever the BasicTower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    {
        move(1);
        count++;
        
}
}
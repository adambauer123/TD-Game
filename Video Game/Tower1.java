import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower1 extends Tower
{
    
    private int gunReloadTime = 15;
    private int reloadDelayCount;
    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower1() {
        super(75, 50, 18, 7.0, 59, true);
        reloadDelayCount++;
    }
    public void act() 
    {
        if(reloadDelayCount >= gunReloadTime){
            bullet b = new bullet();
            getWorld().addObject(b, 50, 50);
            reloadDelayCount = 0;
            System.out.println("hiiiii");
        }
    }

}

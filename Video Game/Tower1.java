import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Tower1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tower1 extends Tower
{
    
    private int gunReloadTime = 75;
    private int reloadDelayCount = 0;
    private int targetX, targetY;
    private int i = 5;
    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower1() {
        super(75, 50, 18, 7.0, 59, true);
        
    }
    public void act() 
    {
    {
        List l = getWorld().getObjects(Enemy1.class);

        if(!l.isEmpty()) {
        target = (Enemy1)(l.get(0));
        System.out.println(l);
        System.out.println(target);
        targetX = target.getX();
        targetY = target.getY();
        turnTowards(targetX, targetY);
        bullet Bullet = new bullet();
        i++;
        if(i > 50) {
        i = 0;
        getWorld().addObject(Bullet,350,350);
    }
    }
        
 

  
    }
    }
    
    
}




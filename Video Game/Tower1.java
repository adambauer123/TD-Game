import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Tower1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tower1 extends Tower {
    
    private int gunReloadTime = 75;
    private int reloadDelayCount = 0;
    public static int targetX, targetY;

    private int i = 5;

    boolean activated = false;
    boolean placed = false;

    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower1() {
        super(75, 50, 18, 7.0, 59, true);
        
    }
    public void act() {
        getTarget();
   

        if(activated == true){
        dragAndActivate();
    }
}
    public void dragAndActivate(){

        if (Greenfoot.mouseDragged(this) && placed == false){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseClicked(null)){
            activated = true;
            placed = true;
        }
    }
   
    public static int getTargetX() {
        return targetX;
    }
    }

    





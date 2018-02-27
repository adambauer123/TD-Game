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
    private int count = 1;
    private boolean isPayed = false;
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
        if(activated == true) {
            turnTowards(Tower.targetX, Tower.targetY);
            reloadDelayCount++;
<<<<<<< HEAD
     	if(gunReloadTime <= reloadDelayCount && Tower.canFire == true) {
=======
            if(gunReloadTime <= reloadDelayCount && Tower.canFire == true) {
>>>>>>> master
                fire();
                reloadDelayCount = 0;
            }
        }
        dragAndActivate();
    }
    
    public void dragAndActivate(){
        if (Greenfoot.mouseDragged(this) && placed == false && MyWorld.coins >= 10){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseClicked(null)){
<<<<<<< HEAD
            if(getY() < 500 && MyWorld.coins >= 10){
                activated = true;
                placed = true;
                if(isPayed != true) {
                    MyWorld.coins -= 10;
                    isPayed = true;
                }
                
=======
            if(getY() < 473 && MyWorld.coins >= 10){
                activated = true;
                placed = true;
                if(isPayed != true){
                    MyWorld.coins -= 10;
                    isPayed = true;
                }
           } else if(getY() >= 473){
               getWorld().removeObject(this);
>>>>>>> master
           }
        }
    }
    
    public void fire() {
        bullet Bullet = new bullet();
        getWorld().addObject(Bullet, this.getX(), this.getY());
    }
}

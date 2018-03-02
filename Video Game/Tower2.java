import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Tower1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tower2 extends Tower {
    
    private int gunReloadTime = 2;
    private int reloadDelayCount = 0;

    private int i = 5;

    private int count = 1;
    private boolean isPayed = false;
    private boolean activated = false;
    private boolean placed = false;
    private int firstX = 0;
    private int firstY = 0;
    


    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower2() {
        super();
        
    }




    public void act() {
        if(activated == true) {

            if(Tower.targetX > Tower.targetX2) {
                firstX = Tower.targetX;
                firstY = Tower.targetY;
            } else {
                firstX = Tower.targetX2;
                firstY = Tower.targetY2;
            }
            turnTowards(firstX, firstY);
        
            reloadDelayCount++;


            if(gunReloadTime <= reloadDelayCount && Tower.canFire == true) {

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
            if(getY() < 473 && MyWorld.coins >= 10){
                activated = true;
                placed = true;
                if(isPayed != true){
                    MyWorld.coins -= 10;
                    isPayed = true;
                }
           } else if(getY() >= 473){
               getWorld().removeObject(this);

           }
        }
    }
    
     
    
    public void fire() {
        FastBullet bullet = new FastBullet();
        getWorld().addObject(bullet, this.getX(), this.getY());
    }
   }


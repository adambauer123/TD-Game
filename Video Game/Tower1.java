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
    public static int targetX = 0;
    public static int targetY = 0;
    private enemy enemy1;

    private int i = 5;

    private int count = 1;
    private boolean isPayed = false;
    boolean activated = false;
    boolean placed = false;
    private int firstX = 0;
    private int firstY = 0;


    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower1() {
        super();
    }


    public void act() {
        if(activated == true) {

            enemy closestEnemy = getClosestEnemy(500);
            if(closestEnemy!=null) {
                this.turnTowards(closestEnemy.getX(), closestEnemy.getY());
            }

            reloadDelayCount++;

            if(gunReloadTime <= reloadDelayCount) {
                shoot();
                reloadDelayCount = 0;
            }
        }
        dragAndActivate();
    }

<<<<<<< HEAD
    
=======
    //allows you to drag the tower from the menu onto the map
>>>>>>> Tylers-Branch
    public void dragAndActivate(){
        if (Greenfoot.mouseDragged(this) && placed == false && MyWorld.coins >= 25){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseClicked(null)){
            if(getY() < 473 && MyWorld.coins >= 25){
                activated = true;
                placed = true;
                if(isPayed != true){
                    MyWorld.coins -= 25;
                    isPayed = true;
                }
            } else if(getY() >= 473){
                getWorld().removeObject(this);

            }
        }
    }
<<<<<<< HEAD

    
=======
    
    //shoots the specified bullet at the enemy
>>>>>>> Tylers-Branch
    public void shoot()
    {
        //get the closest enemy
        enemy closestEnemy = getClosestEnemy(500);

        if(closestEnemy!=null)
        {
            int x = getX(), y = getY()-10;
            getWorld().addObject(new bullet(),x,y);
            GreenfootSound song = new GreenfootSound("pew.wav");
            song.setVolume(75);
            song.play();
        }
    }
}

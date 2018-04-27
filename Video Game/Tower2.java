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
    private int shootcount = 0;
    private int reloadDelayCount = 0;
    public static int targetX = 0;
    public static int targetY = 0;

    private int i = 5;
    private int c = 0;
    private int count = 1;
    private boolean isPayed = false;
    private boolean activated = false;
    private boolean placed = false;
    private int firstX = 0;
    private int firstY = 0;
    private int radius = 125;
    Circle circle = new Circle();


    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower2() {
        super();

    }

    public void act() {
        if(activated == true) {
            enemy closestEnemy = getClosestEnemy(radius);
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

    //allows you to drag the tower from the menu onto the map
    public void dragAndActivate(){
        if (Greenfoot.mouseDragged(this) && placed == false && MyWorld.coins >= 50){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX() + 1, mouse.getY());
            if(c == 0) {
                getWorld().addObject(circle, this.getX(), this.getY());
                c++;
            }
            circle.setLocation(this.getX(), this.getY());

        }
        if (Greenfoot.mouseClicked(null)){
            circle.setLocation(this.getX(), this.getY());
            if(getY() < 473 && MyWorld.coins >= 50){

                activated = true;
                placed = true;
                getWorld().removeObject(circle);
                if(isPayed != true){

                    MyWorld.coins -= 50;
                    isPayed = true;
                }
            } else if(getY() >= 473){
                getWorld().removeObject(circle);
                getWorld().removeObject(this);

            }
        }
    }

    //shoots the specified bullet at the enemy
    public void shoot()
    {
        //get the closest enemy
        enemy closestEnemy = getClosestEnemy(100);

        if(closestEnemy!=null)
        {
            getWorld().addObject(new FastBullet(),getX(),getY());
            shootcount++;
        }
        if(shootcount == 7){
            GreenfootSound song1 = new GreenfootSound("pow.wav");
            song1.setVolume(75);
            song1.play();
            shootcount = 0;
        }
    }

    public int getRadius() {
        return radius;
    }
}


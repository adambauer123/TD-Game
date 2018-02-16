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
    public static int targetX, targetY;
<<<<<<< HEAD
    private int i = 5;
=======
    boolean activated = false;
    boolean placed = false;
>>>>>>> Tylers-Branch
    /**
     * Act - do whatever the Tower1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower1() {
        super(75, 50, 18, 7.0, 59, true);
        
    }
    public void act() 
    {
<<<<<<< HEAD
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
        getWorld().addObject(Bullet,this.getX(),this.getY());
    }
=======
        if(activated == true){
            reloadDelayCount++;
            //this.turnTowards(Enemy1.E1X, Enemy1.E1Y);
            move ((int)(0.01));     
            List<Enemy1> Enemy1 = getObjectsInRange(10000, Enemy1.class);
            System.out.println(Enemy1);
            if(Enemy1.size() != 0)
            {
                Enemy1 firstEnemy1 = (Enemy1)(Enemy1.get(0));
                for(int c = 1; c < Enemy1.size(); c++)
                    firstEnemy1 = Enemy1.get(c);
                target = firstEnemy1;
                turnTowards(target.getX(), target.getY());
                targetX = target.getX();
                targetY = target.getY();
            }
            if(reloadDelayCount >= gunReloadTime && Enemy1 != null) {
                fire(getX(), getY());
                reloadDelayCount = 1;
            }
        }
        
        dragAndActivate();
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
>>>>>>> Tylers-Branch
    }
        
 

  
    }
    }
    
    
}



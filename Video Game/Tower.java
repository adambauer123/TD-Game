import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */double RADIUS;

    boolean attackFirst;
    int upgradeCosts;

    int level = 1;
    public static Enemy1 target;
    public static Enemy2 target2;
    public static boolean canFire = false;
    public static int targetX = 0;
    public static int targetY = 0;
    public static int targetX2 = 0;
    public static int targetY2 = 0;
    public Tower()
    {
        
    }
    

   
    public void act() {
        List l = getWorld().getObjects(Enemy1.class);
        List z = getWorld().getObjects(Enemy2.class);


        if(l.size() >= 1){
            canFire = true;
        }else {
            canFire = false;
        }

        if (l != null && l.size() >= 1)  {
            
            target = (Enemy1) (l.get(0));
            targetX = target.getX();
            targetY = target.getY();
        }
        if(z != null && z.size() >= 1) {
            target2 = (Enemy2) (z.get(0));
            targetX2 = target2.getX();
            targetY2 = target2.getY();            
        }
    }
    
    
}




    

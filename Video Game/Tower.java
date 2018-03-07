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
     */



    public static Enemy1 target;
    public static Enemy2 target2;
    public static boolean canFire = true;
    public static boolean enemyOnScreen = true;
    public static int targetX = 0;
    public static int targetY = 0;
    public static int targetX2 = 0;
    public static int targetY2 = 0;
    public Tower()
    {
        
    }
    

   
    public void act() {
        List l = getWorld().getObjects(enemy.class); 


        if(l.size() >= 1){
            canFire = true;
            enemyOnScreen = true;
        }else {
            canFire = false;
            enemyOnScreen = false;
        }

        
        
        if (l != null && l.size() >= 1)  {
            if(l.get(0) instanceof Enemy1) {
                target = (Enemy1) (l.get(0));
                targetX = target.getX();
                targetY = target.getY();
            }
            else {
                target2 = (Enemy2) (l.get(0));
                targetX2 = target2.getX();
                targetY2 = target2.getY(); 
            }
                
                     
        
    }    
    
     }
     

    }




    

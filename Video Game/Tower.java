import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends HealthActor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public static Enemy1 target;
    public static Enemy2 target2;
    
    public Tower()
    {
        
    }
    

   
    public void act() {
    }
    
    protected enemy getClosestEnemy(int range) {
    List<enemy> enemies = getWorld().getObjects(enemy.class); //get all the enemies
         
        enemy closestEnemy = null; //the closest enemy at the moment is null
        double closestDistance = range; //and the closest distance at the moment is whatever range they passed us.
        
        for(int i=0; i<enemies.size(); i++)
        {
            enemy Enemy = enemies.get(i); //loop through all the enemies
            
            double distance = Math.sqrt((double)(Math.pow(Enemy.getX()-getX(),2)+Math.pow(Enemy.getY()-getY(),2)));
            //distance formula -- check if their distance is lower that the closest distance so far
            if(distance < closestDistance)
            {
                closestEnemy = Enemy; //if it is, this is the closest enemy so far
                closestDistance = distance; //store the distance so that it can be compared against later.
            }

        }
        
        return closestEnemy; //return the closest enemy. if there were none, we'll get null.
    }
    

    
    
    
}



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
    double RADIUS;
    double RELOAD_SPEED; // Calls of act() methode before the tower can shoot again.
    double TOWER_DAMAGE; // The Damage that the Tower does to the creeps.
    int lastShot;        // Counts the calls of the act methode from the Tower untill it reacheas the value of REALOAD_SPEED.
    double BULLET_SPEED; // Bullet speed
    boolean attackFirst;
    int upgradeCosts;
    int MAX_CREEPS = 20;  // Number of spawned creeps in one wave
    int level = 1;
    Enemy1 target;
    
    
    
    public Tower(double radius, double reloadSpeed, double damage, double bulletSpeed, int towerCosts, boolean attackFirstCreep)
    {
        RADIUS        = radius;
        RELOAD_SPEED  = reloadSpeed;
        TOWER_DAMAGE  = damage;
        BULLET_SPEED  = bulletSpeed;
        upgradeCosts  = (int) (towerCosts * 1.75);
        lastShot      = (int) RELOAD_SPEED;
        attackFirst   = attackFirstCreep;
    }
    
        public Enemy1 getTarget()
    {
        List objectsInRange = getObjectsInRange( (int) RADIUS, Enemy1.class );
    
        if( objectsInRange.size() > 0 )
        {
            int targetId = 0;
            int targetCreepId;
            
            if( attackFirst )
            {
                targetCreepId = MAX_CREEPS;
                
                for( int i = 0; i < objectsInRange.size(); i++ )
                {
                    if( ((Enemy1) objectsInRange.get(i)).id < targetCreepId )
                    {
                        targetCreepId = ((Enemy1) objectsInRange.get(i)).id;
                        targetId      = i;
                    }
                }
            }
            else
            {
                targetCreepId = 0;
                
                for( int i = 0; i < objectsInRange.size(); i++ )
                {
                    if( ((Enemy1) objectsInRange.get(i)).id > targetCreepId )
                    {
                        targetCreepId = ((Enemy1) objectsInRange.get(i)).id;
                        targetId = i;
                    }
                }
            }
            
            return (Enemy1) objectsInRange.get(targetId);
        }
        else return null;   
    }
   
    public void act() 
    {
        // Add your action code here.
    }    
}

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
    public static Enemy1 target;
    public static Enemy2 target2;
    public static boolean canFire = false;
    public static int targetX = 0;
    public static int targetY = 0;
    public static int targetX2 = 0;
    public static int targetY2 = 0;
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




    

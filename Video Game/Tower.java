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
    public static int targetX, targetY;

    private int i = 5;
    
    private int gunReloadTime = 15;
    private int reloadDelayCount;
    
    
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
        reloadDelayCount++;

        i++;
        if(i > 50) {
        i = 0;
    }
    }

    public void getTarget() {
        List l = getWorld().getObjects(Enemy1.class);
        if(!l.isEmpty()) {
        target = (Enemy1)(l.get(0));
        System.out.println(l);
        System.out.println(target);
        targetX = target.getX();
        targetY = target.getY();
        turnTowards(targetX, targetY);
        bullet Bullet = new bullet();
       }
    }
        
   public void fire(int x, int y){
           bullet b = new bullet();
           getWorld().addObject(b,x,y);
    }
}

    

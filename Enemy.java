import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    // General Stats
    int Hp;
    int Mp;
    int Speed;
    int Damage;
    int Vision;
    
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void perseguir()
    {
            // Determina si el jugador esta en el rango de vision y rota a su posicion
            if (getObjectsInRange(Vision, Player.class).size() > 0) {
                
                if (getWorld() != null) {
                    
                    if (!getWorld().getObjects(Player.class).isEmpty() ) {
                        move(Speed);
                        Actor player = getWorld().getObjects(Player.class).get(0);
                        turnTowards (player.getX(), player.getY() );
                        
                    }
                    
                }
            
            }

    }
    
}

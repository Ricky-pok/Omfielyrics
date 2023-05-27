import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attacks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attacks extends Actor
{
    
    // Variables
    int Duration = 5;
    int Speed = 2;
    int Vision = 300;
    
    
    public void perseguir()
    {
            
            if (getObjectsInRange(Vision, Player.class).size() > 0) { // Determina si el jugador esta en el rango de vision
                
                if (getWorld() != null) {
                    
                    if (!getWorld().getObjects(Player.class).isEmpty() ) { // Determina si existe el objeto Player y rota en consecuencia a su posicion
                        move(Speed);
                        Actor player = getWorld().getObjects(Player.class).get(0);
                        turnTowards (player.getX(), player.getY() );
                        
                    }
                    
                }
            
            }

    }
    
    public void Delete() {
        if (getObjectsInRange(20, Player.class).size() > 0) { // Determina si el jugador esta en sierto rango y elemina este objeto
             
             getWorld().removeObject(this);
                
        }
    }
    
    public void act()
    {
        // Add your action code here.
    }
}

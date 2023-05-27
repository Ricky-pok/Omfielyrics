import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baston here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Attacks
{
    
    int Duration = 5;
    int Speed = 4;
    int Vision = 200;
    int Shiny = 1;
    
    private void Perseguir()
    {
            
            if (getObjectsInRange(15, Enemy.class).size() > 0) { // Determina si un objeto Enemy se encuentra en un radio de 15
            
            getWorld().removeObject(this); // Remueve este objeto
                
        }else if (getObjectsInRange(Vision, Enemy.class).size() > 0) { // Determina si el enemigo se encuentra en el campo de vision
                
                if (getWorld() != null) {
                    
                    //Determina si existe el objeto Enemy y hace que rote en consecuencia a su posicion
                    if (!getWorld().getObjects(Enemy.class).isEmpty() ) {
                        move(Speed);
                        Actor player = getWorld().getObjects(Enemy.class).get(0);
                        turnTowards (player.getX(), player.getY() );
                        
                    }
                    
                }
            
            } else { getWorld().removeObject(this); }

    }
    
    
    public void act()
    {
        Perseguir();
        
        if (Shiny == 1) {
            Greenfoot.playSound("Shiny.mp3");
            Shiny = 0;
        }
    }
}

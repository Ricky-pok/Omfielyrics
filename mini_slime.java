import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mini_slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mini_slime extends Enemy
{
    
    
    /**
     * Act - do whatever the mini_slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        perseguir();
        Vision = 200;
        Speed = 1;
        
        Greenfoot.playSound("Limo.mp3");
        
        // si el slime toca al jugador este se elimina
        if(isTouching(Player.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    
    
}

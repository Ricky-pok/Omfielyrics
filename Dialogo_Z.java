import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogo_Z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogo_Z extends NPC_Z
{
    /**
     * Act - do whatever the Dialogo_Z wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Se Auto Elimina si no se esta presionando "J"
        if (!( Greenfoot.isKeyDown("J") ) ) {
            getWorld().removeObject(this);
        }
        
    }
}

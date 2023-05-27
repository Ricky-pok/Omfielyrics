import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortalFantasma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalFantasma extends Items
{
    /**
     * Act - do whatever the PortalFantasma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getObjectsInRange(10, Player.class).size() > 0){
            Greenfoot.setWorld(new Zone_Spectre());
        }
    }
}

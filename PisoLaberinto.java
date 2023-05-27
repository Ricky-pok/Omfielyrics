import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PisoLaberinto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PisoLaberinto extends Transladator
{
    /**
     * Act - do whatever the PisoLaberinto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) ) {
            Greenfoot.setWorld(new Laberinto_Pegajoso() );
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drak extends Transladator
{
    /**
     * Act - do whatever the Drak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) ) {
            Greenfoot.setWorld(new Zone_Umbreon() );
        }
    }
}

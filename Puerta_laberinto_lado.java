import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puerta_laberinto_lado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerta_laberinto_lado extends Transladator
{
    /**
     * Act - do whatever the Puerta_laberinto_lado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getObjectsInRange(10, Player.class).size() > 0) {
             Greenfoot.setWorld(new Zone_Queen_Slime());

        }
    }
}

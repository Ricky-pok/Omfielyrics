import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bosque extends Transladator
{
    /**
     * Act - do whatever the Bosque wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Player.class)) {
            Greenfoot.setWorld(new Bosque_De_Los_Olvidados() );
        }
    }
}

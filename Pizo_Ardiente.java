import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizo_Ardiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizo_Ardiente extends Transladator
{
    /**
     * Act - do whatever the Pizo_Ardiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) ) {
            Greenfoot.setWorld(new Peñazcos_Ardientes() );
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transladator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transladator extends Actor
{
    
    
    public void act()
    {
        if(isTouching(Player.class) ) {
            Greenfoot.setWorld(new Peñazcos_Ardientes() );
        }
    }
}

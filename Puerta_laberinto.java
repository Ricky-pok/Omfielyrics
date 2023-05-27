import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puerta_laberinto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerta_laberinto extends Transladator
{
    /**
     * Act - do whatever the Puerta_laberinto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        teletransporte_2();
    }
    
      public void teletransporte_2()
    {
       if (getObjectsInRange(10, Player.class).size() > 0) {
             Greenfoot.setWorld(new Laberinto_pegajoso_2());

        }
        
    }
}

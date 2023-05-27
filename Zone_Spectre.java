import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boos_Zone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone_Spectre extends World
{

    /**
     * Constructor for objects of class Boos_Zone.
     * 
     */
    public Zone_Spectre()
    {
        //Zona del Spectre
        super(300, 300, 2);
        
        Spectre spectre = new Spectre();
        addObject(spectre,73,86);
        
        new Menu().Mundo = 3 ;
        
        addObject(new Player(),150,300);
    }
}

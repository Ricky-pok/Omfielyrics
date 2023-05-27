import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends World
{
    Villa r = new Villa();
    public Victory()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        new Menu().Mundo = 17;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        r.complete_slime = false;
        r.complete_Liche = false;
        r.complete_Spectre = false;
        Start start = new Start();
        addObject(start,67,109);
        start.setLocation(176,253);
    }
}

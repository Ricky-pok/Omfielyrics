import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zone_Umbreon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone_Umbreon extends World
{
       public int jf = 1;
    /**
     * Constructor for objects of class Zone_Umbreon.
     * 
     */
    public Zone_Umbreon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(320, 300, 2); 
        prepare();
        
        new Menu().Mundo = 13;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Umbreon umbreon = new Umbreon();
        addObject(umbreon,147,57);
        
        addObject(new Player(),157,264);
        Dragma dragma = new Dragma();
        addObject(dragma,29,99);
        dragma.setLocation(36,100);
        Dragma dragma2 = new Dragma();
        addObject(dragma2,300,162);
        dragma2.setLocation(301,159);
        dragma.setLocation(27,105);
        dragma2.setLocation(282,155);
        removeObject(dragma);
        dragma2.setLocation(73,135);
    }
}

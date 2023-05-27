import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ciudadela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public int jf = 1;
      
    /**
     * Constructor for objects of class Ciudadela.
     * 
     */
    public Space()
    {
        super(300, 300, 2); 
        prepare();
        
        new Menu().Mundo = 14;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        space_hallway space_hallway = new space_hallway();
        addObject(space_hallway,150,249);
        space_hallway space_hallway2 = new space_hallway();
        addObject(space_hallway2,150,159);
        space_hallway space_hallway3 = new space_hallway();
        addObject(space_hallway3,150,70);
        space_hallway space_hallway4 = new space_hallway();
        addObject(space_hallway4,150,0);
        space_tp space_tp = new space_tp();
        addObject(space_tp,148,6);
        addObject(new Player(),148,278);

    }
}

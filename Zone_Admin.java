import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Admin_Zone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone_Admin extends World
{
     int jf =2;
    
    /**
     * Constructor for objects of class Admin_Zone.
     * 
     */
    public Zone_Admin()
    {
        super(300, 300, 2);
        prepare();
        
        new Menu().Mundo = 15;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        space_floor space_floor = new space_floor();
        addObject(space_floor,150,250);
        Admin admin = new Admin();
        addObject(admin,143,45);
        addObject(new Player(),145,266);
        
    }
}

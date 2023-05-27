import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    int jf = 2;
     static int Mundo = 0;    
     
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(897, 504, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,448,212);
        start.setLocation(493,251);
        Logo logo = new Logo();
        addObject(logo,729,57);
        logo.setLocation(375,60);
        start.setLocation(488,291);
        logo.setLocation(424,71);
        logo.setLocation(437,70);
        start.setLocation(410,342);
        start.setLocation(466,338);
        logo.setLocation(455,77);
        start.setLocation(425,273);
    }
}

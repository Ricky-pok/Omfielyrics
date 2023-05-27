import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peñazcos_Ardientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peñazcos_Ardientes extends World
{

    /**
     * Constructor for objects of class Peñazcos_Ardientes.
     * 
     */
    public Peñazcos_Ardientes()
    {
        super(320, 300, 2); 
        prepare();
        
        new Menu().Mundo = 12;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dragma dragma = new Dragma();
        addObject(dragma,124,131);
        dragma.setLocation(43,64);
        Dragma dragma2 = new Dragma();
        addObject(dragma2,78,122);
        Dragma dragma3 = new Dragma();
        addObject(dragma3,156,158);
        dragma2.setLocation(140,68);
        dragma3.setLocation(255,68);
        dragma2.setLocation(142,41);
        dragma.setLocation(43,78);
        dragma3.setLocation(267,85);
        dragma.setLocation(38,84);
        dragma2.setLocation(117,51);
        Dragma dragma4 = new Dragma();
        addObject(dragma4,178,61);
        dragma4.setLocation(183,70);
        addObject(new Player(),130,243);
        removeObject(dragma2);
        dragma4.setLocation(149,30);
        dragma.setLocation(35,85);
        dragma3.setLocation(284,144);
        dragma4.setLocation(150,29);
        removeObject(dragma4);
        DragmaMB dragmaMB = new DragmaMB();
        addObject(dragmaMB,149,23);
        DragmaMB dragmaMB2 = new DragmaMB();
        addObject(dragmaMB2,288,41);
        dragmaMB.setLocation(94,26);
        dragmaMB2.setLocation(251,43);
        Dragma dragma5 = new Dragma();
        addObject(dragma5,33,194);
        removeObject(dragmaMB2);
        Drak drak = new Drak();
        addObject(drak,153,15);
    }
}

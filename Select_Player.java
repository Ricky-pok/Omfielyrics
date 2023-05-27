import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select_Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_Player extends World
{
    int jf = 2;
     static int Jugador = 0;
     
     
    /**
     * Constructor for objects of class Select_Player.
     * 
     */
    public Select_Player()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(897, 504, 1); 
        prepare();
    }
    
    public void act() {
        
        
    }
    private void prepare()
    {
        
        Selector selector = new Selector();
        addObject(selector,449,129);
        Personaje_Lyrics personaje_Lyrics = new Personaje_Lyrics();
        addObject(personaje_Lyrics,452,204);
        W_Menu w_Menu = new W_Menu();
        addObject(w_Menu,316,349);
        M_Menu m_Menu = new M_Menu();
        addObject(m_Menu,582,338);
        selector.setLocation(495,141);
        w_Menu.setLocation(325,352);
        m_Menu.setLocation(588,350);
        selector.setLocation(438,149);
        selector.setLocation(447,146);
        selector.setLocation(444,147);
    }
}

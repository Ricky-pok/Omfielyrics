import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W_Menu extends Menu_Items
{
    
    
    
    public void act()
    {
        Select_Player S = (Select_Player)getWorld();
        
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
            {
                S.Jugador = 2;
                Greenfoot.setWorld(new Villa());
            }
    }
}

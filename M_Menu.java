 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M_Menu extends Menu_Items
{

    public void Selector() 
    {
        Menu M = (Menu)getWorld();
        
    }
    
    public void act()
    {
        Select_Player S = (Select_Player)getWorld();
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            S.Jugador = 1;
            Greenfoot.setWorld(new Villa());
            
        }
    }
}

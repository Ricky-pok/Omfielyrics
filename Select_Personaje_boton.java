import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select_Personaje_boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_Personaje_boton extends Menu_Items
{
    /**
     * Act - do whatever the Select_Personaje_boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Select_Player());
            }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D extends Transladator
{
    /**
     * Act - do whatever the D wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Cambio_De_Mundo();
    }
    
    private void Cambio_De_Mundo() {
        // te envia a pelear con el Liche
        if (isTouching(Player.class) ) {
            
            Greenfoot.setWorld(new Zone_Liche() );
            
        }
    }
}

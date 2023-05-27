import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC_Z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC_Z extends NPC
{
    
    // Animation
    GifImage LicheWalk     = new GifImage("LicheChikitoMove.gif");
    
    // Vairables
    int Veces = 0;
    public void act()
    {
        setImage(LicheWalk.getCurrentImage() );
        
        // Crea un dialogo cuando el jugador intenta atacar, crea otro dialogo cuando espera mucho para irse
        if (Greenfoot.isKeyDown("J") && Veces <= 100 ) {
            getWorld().addObject(new Dialogo_Z(), getX() - 20, getY() - 20);
            Veces++;
        } else if (Greenfoot.isKeyDown("J") && Veces >= 150 ) {
            getWorld().addObject(new Dialogo_Z1(), getX() - 20, getY() - 20);
        }
        
    }
}

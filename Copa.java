import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Copa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Copa extends Trofeo
{
    
    
    GifImage CopaShiny  = new GifImage("LicheLoading.gif");
    
    public void act()
    {
        // Muestra un mensaje y cuando toca al jugador, envia al mismo de vuelta al bosque
        getWorld().showText("You Win to Liche", getX(), getY() - 40);
        if (isTouching (Player.class) ) {
            Greenfoot.setWorld(new Bosque_De_Los_Olvidados() );
        }
    }
}

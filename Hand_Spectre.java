import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hand_Spectre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand_Spectre extends Spectre
{
    /**
     * Act - do whatever the Hand_Spectre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        perseguir();
        Stats();
        Delete();
    }
    
    //Estadisticas del Puño
    int Duration = 5;
    private void Stats()
    {
        Speed = 2;
        Vision = 300;
    }
    
    //Borrar el puño al tocar el jugador
    private void Delete() {
        if (isTouching(Player.class) ){
            Duration--;
            
                //Borrar el puño al no tocar el jugador
                if (Duration <= 0) {
                    getWorld().removeObject(this);
                }
        }
    }
}

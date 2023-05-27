import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spirit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spirit extends Spectre
{
    GifImage GreenSpirit = new GifImage("Espirit1.gif");
    GifImage BlueSpirit = new GifImage("Espirit2.gif");
    GifImage ReeSpirit = new GifImage("Espirit3.gif");
    
    int NumSkins = Greenfoot.getRandomNumber(3);
    /**
     * Act - do whatever the Spirit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        perseguir();
        Vision = 400;
        Speed = 2;
        
        //Accion del spirit al tocar el jugador
        if(isTouching(Player.class)){
            getWorld().removeObject(this);
        }
        
        //Poner skin aleatoriamente
        if(NumSkins == 0){
            setImage(GreenSpirit.getCurrentImage());
        }
        
        if(NumSkins == 1){
            setImage(BlueSpirit.getCurrentImage());
        }
        
        if(NumSkins == 2){
            setImage(ReeSpirit.getCurrentImage());
        }
    }
}

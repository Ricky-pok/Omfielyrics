import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack_Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Warrior
{
    GifImage AttackSword
    = new GifImage ("Attack_Sword.gif");
    
    int Live = 10;
    
    public Sword() {
        GreenfootImage Dragma = getImage();
        int alto = (int) Dragma.getHeight()*2;
        int ancho = (int) Dragma.getWidth()*2;
        Dragma.scale(ancho, alto);
    }
    
    public void act()
    {
        setImage(AttackSword.getCurrentImage());
        
        if (isTouching(Enemy.class) ) {
            getWorld().removeObject(this);
        } else {
            Live--;
        }
        
        if (Live <= 0) {
            getWorld().removeObject(this);
        }
        
        Greenfoot.playSound("Sword.mp3");
    }
}

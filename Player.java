import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    // Stats
    int Hp;
    int Mp;
    int MaxMp;
    int Speed = 3;
    int Damage;
    int Vision;
    int Coli;
    int Inmortal;
    int Ubi;
    static int Personaje = 1;
    
    public void act()
    {
        Cambio();
    }
    
    public void Moving()
    {
        if (!(Greenfoot.isKeyDown("e") ) ) {
        
        if (Greenfoot.isKeyDown("a")) {
            setLocation (getX() - Speed, getY());
        }
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation (getX() + Speed, getY());
        }
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation (getX() , getY() - Speed);
        }
        
        if (Greenfoot.isKeyDown("s")) {
            setLocation (getX() , getY() + Speed);
        }
        
        }
    }
    
    public void Colition() 
    {
        
        if (getX() <= 20 ) {
            setLocation (getX() + Speed, getY());
        }
            
        if (getX() >= getWorld().getWidth() - 20 ) {
            setLocation (getX() - Speed, getY());
        }
        
        if (getY() <= 24 ) {
            setLocation (getX() , getY() + Speed);
        }
            
        if (getY() >= getWorld().getHeight() -  28 ) {
            setLocation (getX() , getY() - Speed);
        }
        
    }
    
    public void Cambio() {
        Select_Player S = new Select_Player();
        
        if (S.Jugador == 1 ) {
            
            getWorld().addObject(new Magician(), getX(), getY() );
            getWorld().removeObject(this);
        }
        
        if (S.Jugador == 2 ) {
            
            getWorld().addObject(new Warrior(), getX(), getY() );
            getWorld().removeObject(this);
        }
    }
    
}

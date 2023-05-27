import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eye extends Zombie
{
    // Status
    int Speed = 2;
    int Vision = 200;
    int Damage = 2;
    int dilay = 2;
    
    // AY! //nerf
    int Relife = 20;
    
    // Animations
    GifImage EyeMove = new GifImage("Eye.gif");
    
    public void act()
    {
        setImage(EyeMove.getCurrentImage() );
        Jil();
    }
    
    public void Jil() {
        Relife--;
        
        // Si existe el liche y Relife es menor a 0, persigue al Liche para curarlo
        if (Relife <= 0 && getObjectsInRange(400, Liche.class).size() > 0) {
            move(Speed);
            Actor player = getWorld().getObjects(Liche.class).get(0);
            turnTowards (player.getX(), player.getY() );
            
        }
        
        // Se elimina cuando toca al jugador
        if (isTouching (Player.class) ) {
            getWorld().removeObject(this);
        } 
        
        // Si no hay jugador, se auto elimina
        if (!(getObjectsInRange(400, Player.class).size() > 0) ){
            getWorld().removeObject(this);
        }
        
    }
}

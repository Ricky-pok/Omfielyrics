import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Transladator
{
    int world;

    
    public void act()
    {
        Cambio_De_Mundo();
    }
    
    private void Cambio_De_Mundo() {
        
        // Cambia el valor de World en funcion de la sercania de una clase fantasma
        if (getObjectsInRange(30, C.class).size() > 0) {
            world = 3;
        } else if (getObjectsInRange(100, C.class).size() > 0) {
            world = 2;
        }
        
        // Envia al jugador a un mundo o otro en funcion del valor de World
        if (isTouching(Player.class) ) {
            
            if (world == 0) {
                Greenfoot.setWorld(new Catacumbas_Zombrias_3() );
            }
            
            if (world == 3) {
                Greenfoot.setWorld(new Catacumbas_Zombrias() );
            }
            
            if (world == 2) {
                Greenfoot.setWorld(new Catacumbas_Zombrias_4() );
            }
            
        }
    }
}

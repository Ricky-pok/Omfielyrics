import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B extends Transladator
{
    int word;
    Player J = new Player();
    
    public void act()
    {
        Cambio_De_Mundo();
    }
    
    private void Cambio_De_Mundo() {

        // Cambia el valor de Word en funcion de la sercania de una clase fantasma
        if (getObjectsInRange(30, C.class).size() > 0) {
            word = 2;
        } else if (getObjectsInRange(100, C.class).size() > 0) {
            word = 3;
        } 
        
        // Envia al jugador a un mundo u otro en funcion del valor de Word
        if (isTouching(Player.class) ) {
            
            if (word == 0) {
                Greenfoot.setWorld(new Catacumbas_Zombrias_2() );
            }
            
            if (word == 2) {
                Greenfoot.setWorld(new Catacumbas_Zombrias() );
            }
            
            if (word == 3) {
                Greenfoot.setWorld(new Catacumbas_Zombrias_4() );
            }
            
            
        }
    }
    
}

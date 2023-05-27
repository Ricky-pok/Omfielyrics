import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragmaMB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragmaMB extends Dragma
{
    /**
     * Act - do whatever the DragmaMB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int Lives = 1;
    
    // esta funcion sigue al actor (jugador)
    private void FollowUP(){
        move(1);
        Actor player = getWorld().getObjects(Player.class).get(0);
        this.turnTowards (player.getX(), player.getY());
    }
    
    // cuando esta unidad toca el jugador y Live es mayor o igual a 0 remueve el objeto
    private void Deletear(){
        if (this.isTouching(Player.class)){
            if (Lives >= 0){
                getWorld().removeObject(this);
            }
        }
    }
    
    public void act()
    {
        FollowUP();
        Deletear();
    }
}

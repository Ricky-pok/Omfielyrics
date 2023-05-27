import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space_hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space_hallway extends Items
{
    /**
     * Act - do whatever the space_hallway wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Space_HallWays();
        
    }
    
     // hace que Player no se salga del objeto space_floor
    private void Space_HallWays(){
        Space world_Space = (Space) getWorld();
           Actor P = getWorld().getObjects(Player.class).get(0);
           
           if (world_Space.jf == 1){
                if (P.getX() <= 125){
                    P.move(2);
                }
                if (P.getX() >= 175){
                    P.move(-2);
                }
            }
        }  
}

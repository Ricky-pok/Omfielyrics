import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space_tp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space_tp extends Items
{
    /**
     * Act - do whatever the space_tp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        space_tp();
    }
    private void space_tp(){
        Space world_Space = (Space) getWorld();
           Actor P = getWorld().getObjects(Player.class).get(0);
           Actor W = new Warrior();
           if (world_Space.jf == 1){
               if(isTouching(Player.class)){
                    Greenfoot.setWorld(new Zone_Admin());
                }
            }
        }  
}

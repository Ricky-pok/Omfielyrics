import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space_tp2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space_tp2 extends Items
{
    /**
     * Act - do whatever the space_tp2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        space_tp2();
    }
    private void space_tp2(){
        Zone_Umbreon zona_umbreon = (Zone_Umbreon) getWorld();
           Actor P = getWorld().getObjects(Player.class).get(0);
           Actor W = new Warrior();
           if (zona_umbreon.jf == 1){
               if(isTouching(Player.class)){
                    Greenfoot.setWorld(new Space());
                }
            }
        }  
}

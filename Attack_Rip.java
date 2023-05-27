import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack_Rip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack_Rip extends Admin

{
      GifImage Attack_Rip    = new GifImage("Attack_Rip.gif");
    /**
     * Act - do whatever the Attack_Rip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         setImage(Attack_Rip.getCurrentImage());
         //obtiene la ubicacion del Player
           Actor player = getWorld().getObjects(Player.class).get(0);
         setLocation(player.getX(), getY() );

    }
}

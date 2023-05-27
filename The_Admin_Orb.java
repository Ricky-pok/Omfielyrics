import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class The_Admin_Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class The_Admin_Orb extends Admin
{
    GifImage orb    = new GifImage("The_Admin_Orb.gif");
    //boolean ring_one = false;
   
    
    /**
     * Act - do whatever the The_Admin_Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         setImage(orb.getCurrentImage());
        // animation_orb();
           /**
         if(ring_one == false){
             getWorld().addObject
                  (new Ring_Admin(), getX(), getY() );
                  ring_one = true;
            }
            */
            
            
    }
   
}

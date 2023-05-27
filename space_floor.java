import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space_floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space_floor extends Items
{
      
    /**
     * Act - do whatever the space_floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Space_Floor();
        
        
    }
    
    // hace que Player no se salga del objeto space_floor
    private void Space_Floor(){
        Zone_Admin zone_Admin = (Zone_Admin) getWorld();
           Actor P = getWorld().getObjects(Player.class).get(0);
            Actor W = new Warrior();
           if (zone_Admin.jf == 2){
                if (P.getY() <= 205){
                     P.setLocation(P.getX(),getY() + new Warrior().Speed - 45);
                }
                if (P.getY() <= 205){
                     P.setLocation(P.getX(),getY() + new Magician().Speed - 45);
                }

            }
        }  
}

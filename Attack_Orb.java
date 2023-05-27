import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack_Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack_Orb extends Admin
{
     GifImage Attackorb    = new GifImage("Attack_Orb.gif");
     int T = 120; // crea tiempo 
     boolean Attack_one = false; //confirma si hay objeto o no
    /**
     * Act - do whatever the Attack_Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         setImage(Attackorb.getCurrentImage());
         if(T > 0)
         {
             T--;
            }
         Actor player = getWorld().getObjects(Player.class).get(0);
         setLocation(player.getX(), getY());
         attack();
    }
    private void attack()
    {
    
        
        if(T==0 )
        {
            //confirma si ya se ha atacado
             if(Attack_one == false){
                //invoca el ataque
                getWorld().addObject
                (new Attack_Rip(), getX(), getY());
                //ayuda a confirmar el  ataque
                Attack_one = true;
                }
            }
        }
    }   


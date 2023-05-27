import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC_A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC_A extends NPC
{
     GifImage NPC_A      = new GifImage("BOY0.gif");
     
    /**
     * Act - do whatever the NPC_A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(NPC_A.getCurrentImage() );
        Hablar_NPC_A();
        }
    //si la clase player toca con la clase npc este invoca un label.
    private void Hablar_NPC_A(){
      if(isTouching(Player.class)){
        getWorld().addObject(new Label(), 350,250);
        }
        //si este no lo toca se desaparece 
        else  {
         removeTouching(Label.class); } 
        
    }
}


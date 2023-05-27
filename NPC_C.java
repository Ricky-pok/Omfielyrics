import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC_C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC_C extends NPC
{
     GifImage NPC_C    = new GifImage("GIRl.gif");
    /**
     * Act - do whatever the NPC_C wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(NPC_C.getCurrentImage() );
        HABLAR_NPC_C();
    }
    //si la clase player toca con la clase npc este invoca un label.
    private void HABLAR_NPC_C(){
    
        if(isTouching(Player.class)){
        getWorld().addObject(new Label3(), 142,166);
        }
        //si este no lo toca se desaparece 
        else  {
         removeTouching(Label3.class); } 
    
    }
}

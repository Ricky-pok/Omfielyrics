import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC_B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC_B extends NPC
{
    GifImage NPC_B    = new GifImage("BOY1.gif");
    /**
     * Act - do whatever the NPC_B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(NPC_B.getCurrentImage() );
        Hablar_NPC_B();
    }
    //si la clase player toca con la clase npc este invoca un label.    
    private void Hablar_NPC_B() 
    {
    if(isTouching(Player.class)){
        getWorld().addObject(new Label2(), 381,40);
        }
        //si este no lo toca se desaparece 
        else  {
         removeTouching(Label2.class); } 
    
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Queen_Slime_Zone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone_Queen_Slime extends World
{
    Player player = new Warrior();
    private mini_slime Slime = new mini_slime();
    /**
     * Constructor for objects of class Queen_Slime_Zone.
     * 
     */
    public Zone_Queen_Slime()
    {
        super(200, 200, 3);
        prepare();
        
        new Menu().Mundo = 11;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Queen_Slime queen_Slime = new Queen_Slime();
        addObject(queen_Slime,88,38);
        
        addObject(new Player(), 150, 150);
    }
    
    public mini_slime getMini_slime()
    {
        return Slime;
    }
}

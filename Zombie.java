import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Enemy
{
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void Talk() {    
        
        int Talking = Greenfoot.getRandomNumber(20);
        
        if (Talking == 1) {
            
            Greenfoot.playSound("ZombieTalk.mp3");
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb_ombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb_Zombie extends Attacks
{
    int Darky = 1;
    public void act()
    {
        perseguir();
        Delete();
        if (Darky == 1) {
            Greenfoot.playSound("Darky.mp3");
            Darky = 0;
        }
    }
}

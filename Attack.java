 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Player
{
    GifImage AttackSword = new GifImage ("Attack_Sword.gif");   
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           setImage(AttackSword.getCurrentImage());
           Attack();
           
    }           
    
    //prueba de uso de Attack
    private void Attack(){
        if (isTouching(Enemy.class)){
           removeTouching(Enemy.class);
           removeTouching(Boss.class);
        }
    } 
    
} 

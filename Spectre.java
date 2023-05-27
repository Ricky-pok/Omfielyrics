import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Errante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectre extends Boss
{
    int Counter = 0;
    int Hp = 100;
    int NumeroSpirit; 
    GifImage SpectreLevitation = new GifImage("Spectre_Levitation.gif");
    GifImage SpectreLevitationInvert = new GifImage("SpectreLevitationInvert.gif");
    
    /**
     * Act - do whatever the Errante wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Attack();
        Animation();
        perseguir();
        Player_Damage();
        Stats();
        morir();
        
    }
    
    private void Player_Damage() {
        
        //vida del spectre
        if (Hp > 0) {
        getWorld().showText("Spectre "+ Hp, 30, 50);
        //Daño del warrior al spectre
        if (isTouching (Sword.class) ) {
            Hp = Hp - 10; //new Warrior().Dmg;
            
        }
        
        //Daño del magician al spectre
        if (isTouching(Orb.class) ) {
            Hp = Hp - 2; //new Magician().Dmg;
            
        }
        
        }
        
        
    }
    
    //Ataque del Spectre
    private void Attack()
    {
        Counter++;
        
        //Rango de ataque cuando se enfrenta al warrior 
        if (getObjectsInRange(100, Warrior.class).size() > 0 && Counter >= 0) {
          
          move (-Speed);
          //Ataques del spectre cuando el counter llega a  ser mayor que 100 (Warrior)
          if (Counter > 100){
            getWorld().addObject(new Hand_Spectre(), getX(), getY());
            getWorld().addObject(new Spirit(), Greenfoot.getRandomNumber(getWorld().getHeight()), Greenfoot.getRandomNumber(getWorld().getWidth()));
            Greenfoot.playSound("Shiny.mp3");
            Counter = 0;
          }
        
        } 
        
        //Rango de ataque cuando se enfrenta al magician 
        if (getObjectsInRange(150, Magician.class).size() > 0 && Counter >= 0) {
          
          move (-Speed);
          //Ataques del spectre cuando el counter llega a  ser mayor que 100 (Magician)
          if (Counter > 100) {
            getWorld().addObject(new Hand_Spectre(), getX(), getY());
            getWorld().addObject(new Spirit(), Greenfoot.getRandomNumber(getWorld().getHeight()), Greenfoot.getRandomNumber(getWorld().getWidth()));
            Greenfoot.playSound("Shiny.mp3");
            Counter = 0;
          }
        
        } 
    }
    
    //Animacion del Spectre
    private void Animation(){
        
        Actor player = getWorld().getObjects(Player.class).get(0);
        
        if (player.getX() < getX() && getObjectsInRange(Vision, Player.class).size() > 0) {
            setImage(SpectreLevitationInvert.getCurrentImage());
        }
        else {
            setImage(SpectreLevitation.getCurrentImage() );
        }
    }
    
    //Estadisticas del Spectre
    private void Stats()
    {
        Speed = 1;
        Vision = 200;
    }    
   
    //Acciones al morir 
    //crea un teletransporte y añade un valor true para usarlo despues
    private void morir()
    {
        if (Hp <= 0)
        {
            //Teleport para aparacer en el bosque despues de matar el jefe
            getWorld().addObject(new Bosque(), 150,100);
            
            
            Villa complete = new Villa();
            complete.complete_Spectre = true;
            
            getWorld().removeObject(this);
        }
    }
}
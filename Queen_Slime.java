import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King_Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queen_Slime extends Boss
{
    int mini_slime = 0;
    int Hp_Slime = 15;
    GifImage King_Slime = new GifImage("King slime.gif");
    mini_slime slime = new mini_slime();
    private int Hp = 100;
   
    /**
     * Act - do whatever the King_Slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          setImage(King_Slime.getCurrentImage());
          mini_slimes();
          Player_Damage();
          morir();
          if (Hp <= Hp / 2)
          {
              slime.Speed = slime.Speed + 1;
          }
    }
    
    private void Player_Damage() {
        
        if (Hp > 0) {
        
          getWorld().showText("Slime Hp :"+ Hp, 30, 50);
        if (isTouching (Sword.class) ) {
            Hp = Hp - 10; //new Warrior().Dmg;
            
        }
        
        if (isTouching(Orb.class) ) {
            Hp = Hp - 2; //new Magician().Dmg;
            
        }
        
        }
    }
    
    // si el jugador toca el slime o el slime toca la espada o el orb, entonces se crearan mini slime en una ubicacion random.
    private void mini_slimes()
    {
       
        if (isTouching(Warrior.class) || isTouching(Sword.class) || isTouching(Orb.class))
        {
            mini_slime = 1;
        }
        else if (!isTouching(Warrior.class))
        {
            mini_slime = 0;
        }
        
        if (mini_slime == 1)
        {
            getWorld().addObject(slime, Greenfoot.getRandomNumber(getWorld().getWidth()), 
                                        Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        
    }
    
    //crea un teletransporte y añade un valor true para usarlo despues
    private void morir()
    {
        if (Hp <= 0)
        {
            getWorld().addObject(new Bosque(), 150,100);
            getWorld().removeObject(this);
            Villa complete = new Villa();
            complete.complete_slime = true;
        }
    }
    
}

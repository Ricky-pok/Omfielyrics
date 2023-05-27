import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie_M here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie_M extends Zombie
{
    int Counter = 0;
    int Hp = 5;
    private void Stats()
    {
        Speed = 1;
        Vision = 160;
    }
        
    
    GifImage ZombieMagicianWalk          = new GifImage("ZombieMagicianWalk.gif");
     
    GifImage ZombieMagicianAttack        = new GifImage("ZombieMagicianAttack.gif");
    
    GifImage ZombieMagicianAttackInvert  = new GifImage("ZombieMagicianAttackInvert.gif");
    
    GifImage ZombieMagicianWalkInvert    = new GifImage("ZombieMagicianWalkInvert.gif");
    
    private void Animation()
    {
        Actor player = getWorld().getObjects(Player.class).get(0);

        // Sistema de caminar
        if (player.getX() < getX() && getObjectsInRange(100, Player.class).size() > 0) {
            setImage(ZombieMagicianAttackInvert.getCurrentImage() );
            
        } else if(player.getX() > getX() && getObjectsInRange(100, Player.class).size() > 0)  {
            setImage(ZombieMagicianAttack.getCurrentImage() );

        } else if (player.getX() < getX() && getObjectsInRange(Vision, Player.class).size() > 0) {
            setImage(ZombieMagicianWalkInvert.getCurrentImage() );
            
        } 
        else {
            setImage(ZombieMagicianWalk.getCurrentImage() );
        }
        
    }
    
    private void Attack()
    {
        Counter++;
        
        // Si el jugador esta a la mitad de campo de vision, se detiene el enemigo y empieza a atacar
        if (getObjectsInRange(100, Player.class).size() > 0 && Counter >= 0) {
          
          move (-Speed);
          if (Counter > 100) {
            getWorld().addObject(new Orb_Zombie(), getX(), getY());
            
            
            Counter = 0;
          }
        
        } 
    }
    
    
    private void Player_Damage() {
        
        // Sistema de daño
        if (Hp > 0) {
            
        if (isTouching (Sword.class) ) {
            Hp = Hp - 10; //new Warrior().Dmg;
            
        }
        
        if (isTouching(Orb.class) ) {
            Hp = Hp - 2; //new Magician().Dmg;
            
        }
        
        }
    }
    
    private void Dead() {
        // Cuando no tiene vida, se elimina
        if  ( Hp <= 0 ) {
            
            getWorld().removeObject(this);
            
        }
    }
    
    public void act()
    {
        Attack();
        perseguir();
        Animation();
        Stats();
        Dead();
        Player_Damage();
        Talk();
    }
    

}

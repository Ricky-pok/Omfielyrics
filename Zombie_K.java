import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie_W here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie_K extends Zombie
{
    int Count = 0;
    int Hp = 10;
    int Back = 0;
    private void Stats()
    {
        Speed = 1;
        Vision = 100;
    }
    
    GifImage ZombieKnightWalk          = new GifImage("ZombieKnightWalk.gif");
     
    GifImage ZombieKnightAttack        = new GifImage("ZombieKnightAttack.gif");
    
    GifImage ZombieKnightWalkInvert    = new GifImage("ZombieKnightWalkInvert.gif");
    
    GifImage ZombieKnightAttackInvert  = new GifImage("ZombieKnightAttackInvert.gif");
    
    private void Animation()
    {
        Actor player = getWorld().getObjects(Player.class).get(0);
        
        if (player.getX() < getX() && getObjectsInRange(50, Player.class).size() > 0) {
            setImage(ZombieKnightAttackInvert.getCurrentImage() );
            
        } else if(player.getX() > getX() && getObjectsInRange(50, Player.class).size() > 0)  {
            setImage(ZombieKnightAttack.getCurrentImage() );

        } else if (player.getX() < getX() && getObjectsInRange(Vision, Player.class).size() > 0) {
            setImage(ZombieKnightWalkInvert.getCurrentImage() );
            
        } 
        else {
            setImage(ZombieKnightWalk.getCurrentImage() );
        }
    }
    
    private void Attack()
    {
        Count++;
        
        // Cuando llega a un rango espsifico de Player, se mueve hacia atras (Nockback)
        if (getObjectsInRange(30, Player.class).size() > 0 && Count >= 0) {
            
            Back = 5;
            move(-Speed - 50);
            
        }
        
        // Mientras Back sea mayor a 0, se movera a direccion contria al jugador
        if ( Back >= 0 ) {
            
            Back--;
            
            if (getObjectsInRange(30, Player.class).size() > 0) {
                Speed = Speed * -1;
            } else { Speed = Speed * -1;}
            
        }
    }
    
    private void Player_Damage() {
        
        // Si Hp es mayor a 0, al tocar las armas de los jugadores resta vida
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
        
        // Se elimina cuando muere
        if  ( Hp <= 0 ) {
            
            getWorld().removeObject(this);
            
        }
    }
    
    public void act()
    {
        Animation();
        Stats();
        Attack();
        perseguir();
        Dead();
        Player_Damage(); 
        Talk();
    }
}

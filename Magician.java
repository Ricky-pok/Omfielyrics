import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magician here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magician extends Player

{
    // Variables
    private int CoolDown = 50;
    int MaxMp = 20;
    int Hp = 50;
    int Mp = 20;
    int Speed = 3;
    int Dmg = 2;
    
    public void moving()
    {
        // Para moverse
        
        if (Greenfoot.isKeyDown("a")) {
            setLocation (getX() - Speed, getY());
        }
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation (getX() + Speed, getY());
        }
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation (getX() , getY() - Speed);
        }
        
        if (Greenfoot.isKeyDown("s")) {
            setLocation (getX() , getY() + Speed);
        }
        
    }
    
    
        // Animations
        GifImage MagicianWalk       = new GifImage("MagicianWalk.gif");
     
        GifImage MagicianAttack     = new GifImage("MagicianAttack.gif");
    
        GifImage MagicianWalkInvert = new GifImage("MagicianWalkInvert.gif");
    
        GifImage MagicianShield     = new GifImage("MagicianShield.gif");
        
        GifImage MagicianDamage     = new GifImage("MagicianDamage.gif");
        
     private void Animation()
    {
        // Cambia la animacion en fucnion de la direccion del jugador
        if (Greenfoot.isKeyDown("a")) {
            setImage(MagicianWalkInvert.getCurrentImage() );
            Speed = 3;
        }
        
        else {
            setImage(MagicianWalk.getCurrentImage() );
            Speed = 3;
        }
        
        // Te vuelve inbulnerable si precionas "E", de lo contrario, al tocar un enemigo, cambia el gif momentanea mente
        if (Greenfoot.isKeyDown("e")) {
            setImage(MagicianShield.getCurrentImage() );
            Speed = 0;
        } else if (getObjectsInRange(25, Enemy.class).size() > 0) {
            
            setImage(MagicianDamage.getCurrentImage() );
            
        } 
        
    }
    
    public void Attack()
    {
        
        
        if (CoolDown > 0) {
            CoolDown--;
        }
        
        // Mediante varias variables, resta mana y crea una esfera de ataque cada sierto tiempo
            if (getObjectsInRange(200, Enemy.class).size() > 0 && CoolDown <= 0 && Mp > 0 && Greenfoot.isKeyDown("J") && !(Greenfoot.isKeyDown("Q") ) && !(Greenfoot.isKeyDown("E") )  ) {
                Mp-- ;
                if (CoolDown != 50) {
                    CoolDown = 50;
                }
                getWorld().addObject(new Orb(), getX(), getY() );
            }
        
    }
    
    private void MpUp()
    {
        // Recupera mana
        if (Greenfoot.isKeyDown("Q") && Mp < MaxMp) {
            Mp++;
        }
    }
    
    private void HpDown() {
        // Resta vida en funcion de que enemigo lo golpea
        if(!(Greenfoot.isKeyDown("e")) )
        {   if( getObjectsInRange(22, Zombie_K.class).size() > 0 ){
            
                if (Inmortal <= 0) {
                    Hp = Hp - 3;
                    Inmortal = 5;
                }
            
            } else { Inmortal = 0; }
            
            if( getObjectsInRange(22, Orb_Zombie.class).size() > 0 ){
                            
                if (Inmortal <= 0) {
                    Hp = Hp - 2;
                    Inmortal = 30;
                }
            
            } else { Inmortal = 0; }
            
            if( getObjectsInRange(40, Spirit.class).size() > 0 ){
                            
                if (Inmortal <= 0) {
                    Hp = Hp - 1;
                    Inmortal = 30;
                }
            
            } else { Inmortal = 0; }
            
            
            if( getObjectsInRange(22, mini_slime.class).size() > 0 ){
                            
                if (Inmortal <= 0) {
                    Hp = Hp - 1;
                    Inmortal = 30;
                }
            
            } else { Inmortal = 0; } 
            
            if( getObjectsInRange(37, DragmaMB.class).size() > 0 ){
                
                if (Inmortal <= 0) {
                    Hp = Hp - 4;
                    Inmortal = 30;
                }
            
            } else { Inmortal = 0; }
            
            
            if( getObjectsInRange(40, Hand_Spectre.class).size() > 0 ){
                            
                if (Inmortal <= 0) {
                    Hp = Hp - 5;
                    Inmortal = 30;
                }
            
            } else { Inmortal = 0; }
            
                       
        }
        
        //daño del rayo del Admin
        if(isTouching(Attack_Rip.class ))
        {
            Hp--;
        }
        
        // De morir el jugador, muestra la pantalla de Game Over
        if (Hp <= 0){
            if(isTouching(Attack_Rip.class)){
                FinishGame();
            }else
            {
                endGame();
            }
            
        }
    }
    
    private void endGame(){
        // Cambia a la pantalla de Game Over
        Greenfoot.setWorld(new GameOver() );
    }
    
     private void FinishGame(){
        // Cambia a la pantalla de Game Over
        Greenfoot.setWorld(new Victory() );
    }
    
    public void act()
    {
        Animation();
        Moving();
        Attack();
        MpUp();
        Colition();
        HpDown();
        
        // Muestra la vida y Mana
        getWorld().showText("Vida "+ Hp, 20, 20);
        getWorld().showText("    Mp " + Mp + "  (Q)", 60, 20);
    }
}

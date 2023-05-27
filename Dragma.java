import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragma here.
 * 
 * @author (Joaquin) 
 * @version (24/5/22)
 */
public class Dragma extends Enemy
{   
    int Time = 2;
    int Fire = 0;
    int Counter = 0;
    int Vision = 200;
    int Hp = 5;
    //int Speed = 2;
    
    //agranda el tamaño de los objetos dragma
    public Dragma() {
        GreenfootImage Dragma = getImage();
        int alto = (int) Dragma.getHeight()*2;
        int ancho = (int) Dragma.getWidth()*2;
        Dragma.scale(ancho, alto);
    }
    
    //si vida es mayor que 0 y el objeto es tocado por la espada le reduce 10 de vida, si es orbe, le reduce 2 de vida
    private void Player_Damage() {
        
        if (Hp > 0) {
            
        if (isTouching (Sword.class) ) {
            Hp = Hp - 10; //new Warrior().Dmg;
            
        }
        
        if (isTouching(Orb.class) ) {
            Hp = Hp - 2; //new Magician().Dmg;
            
        }
        
        }
    }
    
    //mueve los objetos de clase dragma en el eje X de izquierda a derecha al llegar al limite del mapa
    private void movement(){
        if (getX() >= getWorld().getWidth() - 10){
            Time = -2;

        } if (getX() <= 10){
            Time = 2;
            move (2);
        } else{
            move(Time);
        }
    } 
    
    // llama al actor al mundo al obtener objetos en un rango de 100 y la variable counter es menor que 100 genera un nuevo orbe
     private void Attack()
    {
        Counter++;
        Actor player = getWorld().getObjects(Player.class).get(0);
        
        if (getObjectsInRange(100, Player.class).size() > 0 && Counter >= 0) {
          
          move (-Speed);
          if (Counter > 100) {
            getWorld().addObject(new Orb_Zombie(), getX(), getY());
            
            Counter = 0;
          }
        
        } 
    } 
    
    // velocidad para el movimiento, y vision se usa con el getObjectsInRange
    private void Stats(){
        Speed = 1;
        Vision = 200;
    }
    
    //si vida = 0 se retira el objeto del mapa
    private void Dead() {
        if  ( Hp <= 0 ) {
            
            getWorld().removeObject(this);
            
        }
    }
    
    public void act()
    {        
        movement();
        Player_Damage();
        Attack();
        Vision = 200;
        perseguir();
        Player_Damage();
        Dead();
    }   
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warrior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warrior extends Player

{
    //gif personaje
    
    GifImage WarriorShield 
    = new GifImage ("Warrior_Shield.png");
    GifImage WarriorAttack 
    = new GifImage ("Warrior.png");
    GifImage Warriorwalk    
    = new GifImage("Warrior_Sword_Shield_Walk.gif");
    GifImage Warriorwalkinvert
    = new GifImage("Warrior_Sword_Shield_Walk_Invert.gif");
    
    int Hp = 100; // vida
    int Dmg;  // daño
    int Timer = 0;  //  calcular tiempo que se elimina el objecto sword
    int CC; //  Tiempo en que se puede usar el ataque 
    Zone_Admin zone_Admin = (Zone_Admin) getWorld(); // variable de mundo
   
    
     /** Act - do whatever the Warrior wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Moving();
        Animation();
        Dat();
        Colition();
        HpDown();
        Game();
    }
    
    
    private void HpDown() {
        //sistema de daño
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
        
    }
    
    private void Dat(){
        // hace que no disminuyan las variable a un valor menor que 0
            if(CC > 0  ){   
            CC--;
        }
        if (Timer > 0){
            Timer--;        
        }
        
        //getWorld().showText("" + Timer, 280, 280);  
        
        getWorld().showText("Vida "+ Hp, 20, 20);
        getWorld().showText("    CC " + CC, 50, 20);
        
        
        // hacer que cuando se acabe el tiempo se elimine Attack
        if (Timer == 0){                
            getWorld().removeObjects
            (getWorld().getObjects(Attack.class));
                          
            }
        }
    
     private void Animation()
    {
        // animacion de caminar a la izquierda
        if (Greenfoot.isKeyDown("a")) {
            setImage(Warriorwalkinvert.getCurrentImage() );
                
        }
        
        else {
            setImage(Warriorwalk.getCurrentImage() );
        }
        
        //sistema de escudo
        if (Greenfoot.isKeyDown("e")) {
            setImage(WarriorShield.getCurrentImage() );
            Speed = 0;
            Hp = Hp;
            
            
            
        }
        if (!(Greenfoot.isKeyDown("e"))) {
            
            Speed = 2;
        }
             
        
        if(CC <= 0){
            if (!(Greenfoot.isKeyDown("e"))){
                if (Greenfoot.isKeyDown("j") &&
                getObjectsInRange(300, Enemy.class).size() > 0) {
                setImage(WarriorAttack.getCurrentImage() );
                Speed = 0;
                
                //se añade valor para despues eliminarlo el objeto Sword
                Timer = 10;
                
                //invoco Sword para crear area de daño
                getWorld().addObject (new Sword(), getX(), getY());
                
                //añado tiempo para no repetir la accion tan rapido 
                if (CC <= 0){
                    CC = 20;
                    }      
                }
            }
        }
            else{
            setImage(Warriorwalk.getCurrentImage());       
        }
    }
   
    //Game Over 
    private void Game(){
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
   
}
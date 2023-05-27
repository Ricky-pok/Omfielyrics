import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Umbreon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Umbreon extends Boss
{
    /**
     * Act - do whatever the Umbreon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        int Time = 2;
        int Roar = 100;
        
        //ataque
        int Ataca = 170;
        
        //vida
        int Vida = 250;
        
        //gif del umbreon
        GifImage Umbreon = new GifImage("UmbreonGif.gif");
        
        //este bloque hace la funcion de movimiento en el eje X, al llegar al limite izq, de devuelve a la derecha, y derecha a izq.
    private void movimiento(){
        if (getX() >= getWorld().getWidth() - 10){
            Time = -2;

        } if (getX() <= 10){
            Time = 2;
            move (2);
        } else{
            move(Time);
        }
    }
    
    //ete bloque hace que cuando la variable ataque sea = 0, el gif se inicie y se generen nuevos dragmas desde la posicion de umbreon
    private void SetAnimationAttack(){
        Ataca --;
        getWorld().showText("Umbreon   " + Vida , 30, 50);
        //getWorld().showText("" + Ataca, 170, 60);
        if (Ataca <= 0) {
            setImage(Umbreon.getCurrentImage() );
            Ataca = 105;
            Dragma dragma = new Dragma();
            getWorld().addObject(new DragmaMB(), getX(), getY() );
        
        } else {
            //setImage(new GreenfootImage("Umbreon.png") );
        }
    }
    
    //cuando la unidad umbreon toque a la clase jugador se le resta 1 vida 
    private void Cheat(){
        if(this.isTouching(Player.class)){
            if (Vida == 20){
                Vida = Vida - 1;
            }
        }
    }
    
    //cuando vida sea 0 se remueve el jefe(umbreon)
    private void morir()
    {
        if (Vida <= 0)
        {
            getWorld().addObject(new space_tp2(), 150, 10);
            
            getWorld().removeObject(this);
        }
    }
    
    //daño, si umbreon toca espada se le resta 10 de vida, si toca orbe se le resta 2 de vida
    private void Player_Damage() {
        
        if (Vida > 0) {
            
        if (isTouching (Sword.class) ) {
            Vida = Vida - 10; //new Warrior().Dmg;
            
        }
        
        if (isTouching(Orb.class) ) {
            Vida = Vida - 2; //new Magician().Dmg;
            removeTouching(Orb.class);
        }
        
        }
    }
    
    public void Rugir() {
        Roar --;
        if (Roar <= 0 ) {
            Greenfoot.playSound("Roar.mp3");
            Roar = 650;
        }
    }
    
    public void act()
    {
        movimiento();
        Player_Damage();
        SetAnimationAttack();
        morir();
        Rugir();
    }
}

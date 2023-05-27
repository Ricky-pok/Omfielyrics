import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Liche extends Boss
{
    // Status
    int Speed = 1;
    int Vision = 100;
    int Damage = 8;
    int Mp = 100;
    int Hp = 200;
    int Cool = 0;
    int Muf = 1;
    int Summon = 2;
    int Timers = 100;
    
    // Animations
    GifImage LicheWalk     = new GifImage("LicheMove.gif");
    GifImage LicheLoading  = new GifImage("LicheLoading.gif");
    GifImage LicheDead     = new GifImage("LicheLoading.gif");
    
    private void Movement() {
        
        setImage(LicheWalk.getCurrentImage() ); // Ejecuta el Gif de Caminar
        
        // Determina el getX y cambia el valor de Speed para que robote de una pared a otra
        if (getX() == 170)  
        {
            Speed = -1;
            move (Speed);
        } else if (getX() == 30) {
            Speed = 1;
            move(Speed);
        } else {
            move (Speed);
        }
        // Determina el getY y cambia el valor de Speed para que robote de una pared a otra        
        if (getY() == 170) {
            
            Speed = - Speed;
            
        } else if (getY() <= 30) {
            
            Speed = -Speed;
            
        } else {
            setLocation(getX(), getY() + Speed);
        }
        
        
        
    }
    
    
    public void Attack() {
        // Variables 
        int X = Greenfoot.getRandomNumber (70);
        int Attack = Greenfoot.getRandomNumber (50);
        getWorld().showText("Boss MP : " + Mp + "   Boss Hp :" + Hp , 30, 50);
        
        // Cambia el ataque en funcion de la vida restante
        if (Hp <= 150 && Hp > 100) {
            Muf = 2;
        } else if (Hp <= 50  ) {
            Muf = 3;
        } else if (Hp > 125) {
            Muf = 1;
        }
        
        // Cuando el mana esta bajo, empieza a cargarlo y se vuelve bulnerable
        if (Mp  < 30) {
            
            // Depea al medio del mapa y lo vuelve inmovil e imposible de defenderse
            if (Mp <= 20) {
                Speed = 0;
                setLocation(159, 120);
                Attack = 0;
            }
            
        } else {
            Attack = Greenfoot.getRandomNumber (50);
            Movement();
            
            //Tepea de manera randon al Liche siempre que no sea bulnerable
            if (X == 40 && Speed != 0) {
            
                setLocation(getX(), getY() + (Greenfoot.getRandomNumber(100) - 50 ) );
            
            } 
        
        }
        
        // Hace que carge el mana y empieza a cargar el mana
        if (Speed == 0) {
            Cool++;
            setImage(LicheLoading.getCurrentImage() );

            Attack = 0;
                if (Cool >= 5) {
                Mp++;
                Cool = 0;
                X = 0;
                
                // Cuando el mana vuelve al maximo, deja de ser bulnerable
                if (Mp == 100) {
                    
                    Speed = 1;
                        
                }
                        
            }
            }
        
            // Crea esferas para atacar siempre que se cumplan las condicion, resta mana y de forma random cambia el diseño de la esfera
        if (Attack == 20 && Mp >= 16 && Muf <= 2 ) {
            Orb_Zombie a = new Orb_Zombie();
            Orb_Zombie b = new Orb_Zombie();
            Mp = Mp - 6;
            
            getWorld().addObject(a, getX(), getY() + 50);
            
            getWorld().addObject(b, getX(), getY() - 50);
            
            if (Greenfoot.getRandomNumber (10) == 2) {
                Mp = Mp - 16;
                a.setImage("Attack Of Liche.png" );
                b.setImage("Attack Of Liche.png" );
            }
            
        }
        
        // Crea un zombie en una posicion random y resta mana
        if (Attack == 33 && Mp > 20 && Muf == 2 && Summon >= 1) {
            
            Mp = Mp - 20;
            Summon--;
            getWorld().addObject(new Zombie_K(), Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(200) );
            
        }
        
        // Crea un Ojo que, luego de un tiempo, se mueve hasta el Liche y lo cura
        if (Attack == 33 && Mp > 20 && Muf == 3) {
            
            Mp = Mp - 35;
            
            getWorld().addObject(new Eye(), Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(200) );
            
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
    
    private void Relife(){
        // Cuando toca al Eye, se cura y elimina el ojo en cuestion
        if(isTouching(Eye.class) ) {
            Hp = Hp + 25;
            removeTouching(Eye.class);
        }
        
    }
    
    private void ReDead() {
        // Cuando muere, crea su trofeo, se elimina y cambia complete_liche a true
        if (Hp <= 0) {
            Timers --;
            if (Timers <= 0) {
                getWorld().addObject(new Copa(), getX(), getY());
                Villa complete = new Villa();
                complete.complete_Liche = true;
                getWorld().removeObject(this);
            }
        }
    }
    
    public void act()
    {
        Movement();
        Attack();
        Player_Damage();
        Relife();
        ReDead();
    }
}

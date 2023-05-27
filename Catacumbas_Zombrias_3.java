import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Catacumbas_Zombrias_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catacumbas_Zombrias_3 extends World
{
    
    
    Player p = new Player();
    
    public Catacumbas_Zombrias_3()
    {    
        super(319, 240, 2); 
        prepare();
        new Menu().Mundo = 6 ;
        
    }
    
    private void prepare()
    {


        addObject(p,166,32);

        // ID
        C c = new C();
        addObject(c,166,7);

        C c2 = new C();
        addObject(c2,313,170);

        Utileria_D utileria_D = new Utileria_D();
        addObject(utileria_D,79,7);
        Utileria_D utileria_D2 = new Utileria_D();
        addObject(utileria_D2,239,7);
        Utileria_D D4 = new Utileria_D();
        addObject(D4,312,64);
        D4.setRotation(90);
        Utileria_D D3 = new Utileria_D();
        addObject(D3,7,64);
        D3.setRotation(90);
        Utileria_D D5 = new Utileria_D();
        addObject(D5,312,160);
        D5.setRotation(90);
        Utileria_D D6 = new Utileria_D();
        addObject(D6,79,232);
        Utileria_D D7 = new Utileria_D();
        addObject(D7,239,232);

        Utileria_D D8 = new Utileria_D();
        addObject(D8,7,220);
        D8.setRotation(90); 

        // Teleports
        // 3
        A a = new A();
        addObject(a,150,7);
        A a2 = new A();
        addObject(a2,166,7);
        A a3 = new A();
        addObject(a3,182,7);

        // 2
        B b = new B();
        addObject(b,312,97);
        B b2 = new B();
        addObject(b2,312,113);
        B b3 = new B();
        addObject(b3,312,129);

        Flor flor = new Flor();
        addObject(flor,100,77);
        Flor flor2 = new Flor();
        addObject(flor2,51,131);
        Flor flor3 = new Flor();
        addObject(flor3,95,184);
        Flor flor4 = new Flor();
        addObject(flor4,126,145);
        Flor flor5 = new Flor();
        addObject(flor5,173,112);
        Flor flor6 = new Flor();
        addObject(flor6,235,73);
        Flor flor7 = new Flor();
        addObject(flor7,182,185);
        Flor flor8 = new Flor();
        addObject(flor8,245,144);
        Utileria_A utileria_A = new Utileria_A();
        addObject(utileria_A,253,197);
        Utileria_A utileria_A2 = new Utileria_A();
        addObject(utileria_A2,46,205);
        Roca roca = new Roca();
        addObject(roca,59,86);
        Roca roca2 = new Roca();
        addObject(roca2,272,42);
        Arbol arbol = new Arbol();
        addObject(arbol,204,132);
        Zombie_M zombie_M = new Zombie_M();
        addObject(zombie_M,94,139);
    }
    
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Catacumbas_Zombrias_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catacumbas_Zombrias_4 extends World
{

    
    Player p = new Player();
    
    public Catacumbas_Zombrias_4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(319, 240, 2);  
        prepare();
        
        new Menu().Mundo = 7 ;
        
    }
    
    public void prepare() {


        addObject(p,166,32);

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
        B a = new B();
        addObject(a,150,7);
        B a2 = new B();
        addObject(a2,166,7);
        B a3 = new B();
        addObject(a3,182,7);

        // 2
        A b = new A();
        addObject(b,7,97);
        A b2 = new A();
        addObject(b2,7,113);
        A b3 = new A();
        addObject(b3,7,129);
        Arbol arbol = new Arbol();
        addObject(arbol,254,57);
        Arbol arbol2 = new Arbol();
        addObject(arbol2,123,142);
        Utileria_A utileria_A = new Utileria_A();
        addObject(utileria_A,61,40);
        Utileria_A utileria_A2 = new Utileria_A();
        addObject(utileria_A2,76,197);
        D d = new D();
        addObject(d,311,134);
        D d2 = new D();
        addObject(d2,311,150);

        D d3 = new D();
        addObject(d3,311,166);
        NPC_Z nPC_Z = new NPC_Z();
        addObject(nPC_Z,275,106);
    }
}

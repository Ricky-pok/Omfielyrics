import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Catacumbas_Zombrias_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catacumbas_Zombrias_2 extends World
{


    Player p = new Player();    
    public Catacumbas_Zombrias_2()
    {    
        super(319, 240, 2); 
        prepare();
        new Menu().Mundo = 5 ;
     
        
    }
    
    private void prepare()
    {


        addObject(p,32,113);

        // ID
        C c = new C();
        addObject(c,5,96);

        C c2 = new C();
        addObject(c2,214,233);


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

        // 2
        B b = new B();
        addObject(b,7,97);
        B b2 = new B();
        addObject(b2,7,113);
        B b3 = new B();
        addObject(b3,7,129);

        A a = new A();
        addObject(a,150,232);
        A a2 = new A();
        addObject(a2,166,232);
        A a3 = new A();
        addObject(a3,182,232);

        Zombie_K zombie_K = new Zombie_K();
        addObject(zombie_K,200,40);
        Zombie_K zombie_K2 = new Zombie_K();
        addObject(zombie_K2,163,184);
        Zombie_K zombie_K3 = new Zombie_K();
        addObject(zombie_K3,266,134);
        Arbol arbol = new Arbol();
        addObject(arbol,139,119);
        Utileria_A utileria_A = new Utileria_A();
        addObject(utileria_A,261,58);
        Utileria_A utileria_A2 = new Utileria_A();
        addObject(utileria_A2,290,104);
        Roca roca = new Roca();
        addObject(roca,48,194);
        Roca roca2 = new Roca();
        addObject(roca2,244,167);
        Roca roca3 = new Roca();
        addObject(roca3,91,45);
    }

}

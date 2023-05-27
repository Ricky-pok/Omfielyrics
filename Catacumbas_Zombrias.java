import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catacumbas_Zombrias extends World
{
    
    Player p = new Player();
    
    public Catacumbas_Zombrias()
    {
        super(319, 240, 2); 
        prepare();
        new Menu().Mundo =  4;
     
    }
    
    private void prepare()
    {
        
            // Enemys
            Zombie_M zombie_M = new Zombie_M();
            addObject(zombie_M,241,185);
            Zombie_K zombie_K = new Zombie_K();
            addObject(zombie_K,157,102);

            

            // Locations
            zombie_M.setLocation(154,112);
            zombie_M.setLocation(248,200);

            // Objetos
            Arbol arbol = new Arbol();
            addObject(arbol,120,59);
            Arbol arbol2 = new Arbol();

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
            Utileria_C utileria_C = new Utileria_C();
            addObject(utileria_C,7,216);
            Utileria_C utileria_C2 = new Utileria_C();
            addObject(utileria_C2,7,200);
            
            
            // Player
            addObject(p,15,163);
            
            
            arbol2.setLocation(272,47);
            addObject(arbol2,202,86);
            Arbol arbol3 = new Arbol();
            addObject(arbol3,264,158);
            Utileria_A utileria_A = new Utileria_A();
            addObject(utileria_A,114,209);
            Utileria_A utileria_A2 = new Utileria_A();
            addObject(utileria_A2,45,31);

            arbol.setLocation(109,71);
            arbol2.setLocation(269,38);
            arbol3.setLocation(232,158);

            Roca roca = new Roca();
            addObject(roca,162,21);
            Roca roca2 = new Roca();
            addObject(roca2,291,212);

            // Teleports
            // 3
            A a = new A();
            addObject(a,150,232);
            A a2 = new A();
            addObject(a2,166,232);
            A a3 = new A();
            addObject(a3,182,232);
            // 2
            B b = new B();
            addObject(b,312,97);
            B b2 = new B();
            addObject(b2,312,113);
            B b3 = new B();
            addObject(b3,312,129);

        
        

    }
    
}

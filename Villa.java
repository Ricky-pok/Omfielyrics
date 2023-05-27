import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ciudad_Hazbel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villa extends World
{
    //confirmar si complete un jefe
     static boolean complete_slime = false ;
     static boolean complete_Spectre = false ;
     static boolean complete_Liche = false ;
     
    /**
     * Constructor for objects of class Ciudad_Hazbel.
     * 
     */
    public Villa()
    {
        super(500, 300, 2); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        new Menu().Mundo = 1 ;
     
        Carretera carretera = new Carretera();
        addObject(carretera,259,289);
        Carretera carretera2 = new Carretera();
        addObject(carretera2,259,172);
        Carretera carretera3 = new Carretera();
        addObject(carretera3,259,62);

        NPC_B nPC_B = new NPC_B();
        addObject(nPC_B,353,70);

        NPC_A nPC_A = new NPC_A();
        addObject(nPC_A,340,280);

        NPC_C nPC_C = new NPC_C();
        addObject(nPC_C,166,188);

        Cartel cartel = new Cartel();
        addObject(cartel,156,22);
        Arbol_ciudad arbol_ciudad = new Arbol_ciudad();
        addObject(arbol_ciudad,390,172);
        Arbol_ciudad arbol_ciudad2 = new Arbol_ciudad();
        addObject(arbol_ciudad2,459,207);
        Arbol_ciudad arbol_ciudad3 = new Arbol_ciudad();
        addObject(arbol_ciudad3,464,140);
        Arbol_ciudad arbol_ciudad4 = new Arbol_ciudad();
        addObject(arbol_ciudad4,121,171);
        Arbol_ciudad arbol_ciudad5 = new Arbol_ciudad();
        addObject(arbol_ciudad5,43,198);
        Arbol_ciudad arbol_ciudad6 = new Arbol_ciudad();
        addObject(arbol_ciudad6,40,121);

        Radio radio = new Radio();
        addObject(radio,374,290);

        Tienda_de_campo_B tienda_de_campo_B = new Tienda_de_campo_B();
        addObject(tienda_de_campo_B,59,254);
        TIenda_de_campo_A tIenda_de_campo_A = new TIenda_de_campo_A();
        addObject(tIenda_de_campo_A,438,32);
        Roca roca = new Roca();
        addObject(roca,39,19);
        Roca roca2 = new Roca();
        addObject(roca2,88,51);
        Roca roca3 = new Roca();
        addObject(roca3,31,54);
        Roca roca4 = new Roca();
        addObject(roca4,117,82);
        Roca roca5 = new Roca();
        addObject(roca5,100,20);
        Tienda_de_campo_c tienda_de_campo_c = new Tienda_de_campo_c();
        addObject(tienda_de_campo_c,444,269);

        addObject(new Player(),62,279);
        Bosque bosque = new Bosque();
        addObject(bosque,255,12);
    }
}

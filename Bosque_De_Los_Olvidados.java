import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bosque_De_Los_Olvidados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bosque_De_Los_Olvidados extends World
{
    Villa complete = new Villa();
     
    /**
     * Constructor for objects of class Bosque_De_Los_Olvidados.
     * 
     */
    public Bosque_De_Los_Olvidados()
    {
        super(400, 300, 2); 
        prepare();
    }
    
    private void prepare()
    {
        new Menu().Mundo = 2 ;
     
        if(complete.complete_Spectre == true && complete.complete_Liche == true && complete.complete_slime == true){
        Pizo_Ardiente pizo_Ardiente = new Pizo_Ardiente();
        addObject(pizo_Ardiente,202,2);
    }
        Spectre spectre = new Spectre();
        addObject(spectre,73,86);
        Magician magician = new Magician();
        addObject(magician,112,125);
        removeObject(magician);

        //Camino hacia abajo
        addObject(new Camino(),200,150);
        addObject(new Camino(),200,175);
        addObject(new Camino(),200,200);
        addObject(new Camino(),200,225);
        addObject(new Camino(),200,250);
        addObject(new Camino(),200,275);

        //Camino hacia arriba
        addObject(new Camino(),200,125);
        addObject(new Camino(),200,100);
        addObject(new Camino(),200,75);
        addObject(new Camino(),200,50);
        addObject(new Camino(),200,25);

        //Camino hacia derecha
        addObject(new CaminoDerecha(),238,150);
        addObject(new CaminoDerecha(),267,150);
        addObject(new CaminoDerecha(),296,150);
        addObject(new CaminoDerecha(),325,150);
        addObject(new Camino(), 290,115);
        addObject(new Camino(), 290,86);
        addObject(new CaminoCerrado(), 290,58);
        addObject(new CaminoDerecha(), 323, 48);
        addObject(new CaminoDerecha(), 352, 48);

        //Camino hacia izquierda
        addObject(new CaminoIzquierda(),165,150);
        addObject(new CaminoIzquierda(),136,150);
        addObject(new CaminoIzquierda(),107,150);
        addObject(new CaminoIzquieraD(),79,149);
        addObject(new Camino(), 115,185);
        addObject(new Camino(), 115,214);
        addObject(new CaminoCerradoI(), 118, 241);
        addObject(new CaminoIzquierda(), 85, 252);
        addObject(new CaminoIzquierda(), 56, 252);

        //CaminoSpectre
        addObject(new Camino(), 115, 112);
        addObject(new Camino(), 115, 83);
            
        if(complete.complete_Spectre == false){
            addObject(new PortalFantasma(), 115, 67);
        }
        //CaminoCrossZombrio
        removeObject(spectre);

        //CaminoDerechaC caminoDerechaC = new CaminoDerechaC();
        //addObject(caminoDerechaC,270,151);
        
        if(complete.complete_Liche == false){
        PisoZombrio pisoZombrio = new PisoZombrio();
        addObject(pisoZombrio,382,42);
        PisoZombrio pisoZombrio2 = new PisoZombrio();
        addObject(pisoZombrio2,382,56);
    }
        
        
        ParedZombria paredZombria = new ParedZombria();
        addObject(paredZombria,392,8);
        ParedZombria paredZombria2 = new ParedZombria();
        addObject(paredZombria2,392,21);
        ParedZombria paredZombria3 = new ParedZombria();
        addObject(paredZombria3,392,36);
        ParedZombria paredZombria4 = new ParedZombria();
        addObject(paredZombria4,393,52);
        ParedZombria paredZombria5 = new ParedZombria();
        addObject(paredZombria5,393,68);
        ParedZombria paredZombria6 = new ParedZombria();
        addObject(paredZombria6,393,83);
        ParedZombria paredZombria7 = new ParedZombria();
        addObject(paredZombria7,393,99);
        ParedZombria paredZombria8 = new ParedZombria();
        addObject(paredZombria8,392,113);
        ParedZombria paredZombria9 = new ParedZombria();
        addObject(paredZombria9,392,129);
        ParedZombria paredZombria10 = new ParedZombria();
        addObject(paredZombria10,393,147);
        ParedZombria paredZombria11 = new ParedZombria();
        addObject(paredZombria11,393,161);
        ParedZombria paredZombria12 = new ParedZombria();
        addObject(paredZombria12,392,177);
        ParedZombria paredZombria13 = new ParedZombria();
        addObject(paredZombria13,392,192);
        ParedZombria paredZombria14 = new ParedZombria();
        addObject(paredZombria14,393,207);
        ParedZombria paredZombria15 = new ParedZombria();
        addObject(paredZombria15,393,222);
        ParedZombria paredZombria16 = new ParedZombria();
        addObject(paredZombria16,393,238);
        ParedZombria paredZombria17 = new ParedZombria();
        addObject(paredZombria17,393,254);
        ParedZombria paredZombria18 = new ParedZombria();
        addObject(paredZombria18,393,270);
        ParedZombria paredZombria19 = new ParedZombria();
        addObject(paredZombria19,393,286);
        ParedZombria paredZombria20 = new ParedZombria();
        addObject(paredZombria20,392,293);
        
        CaminoDerechaC caminoDerechaC = new CaminoDerechaC();
        addObject(caminoDerechaC,353,151);

        addObject(new ParedLaberinto(), 10,13);
        addObject(new ParedLaberinto(), 10,33);
        addObject(new ParedLaberinto(), 10,53);
        addObject(new ParedLaberinto(), 10,73);
        addObject(new ParedLaberinto(), 10,93);
        addObject(new ParedLaberinto(), 10,113);
        addObject(new ParedLaberinto(), 10,133);
        addObject(new ParedLaberinto(), 10,153);
        addObject(new ParedLaberinto(), 10,173);
        addObject(new ParedLaberinto(), 10,193);
        addObject(new ParedLaberinto(), 10,213);
        
        if(complete.complete_slime == false){
            addObject(new PisoLaberinto(), 35,236);
            addObject(new PisoLaberinto(), 35,249);
            addObject(new PisoLaberinto(), 35,265);
            addObject(new PisoLaberinto(), 20,236);
            addObject(new PisoLaberinto(), 20,249);
            addObject(new PisoLaberinto(), 20,265);
            addObject(new PisoLaberinto(), 5,236);
            addObject(new PisoLaberinto(), 5,249);
            addObject(new PisoLaberinto(), 5,265);
            }
        addObject(new ParedLaberinto(), 10,287);

        Arbol arbol = new Arbol();
        addObject(arbol,265,227);
        Arbol arbol2 = new Arbol();
        addObject(arbol2,343,259);
        Arbol arbol3 = new Arbol();
        addObject(arbol3,49,41);

        addObject(new Player(), 200, 290);

    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laberinto_pegajoso_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laberinto_pegajoso_2 extends World
{

    /**
     * Constructor for objects of class Laberinto_pegajoso_2.
     * 
     */
    public Laberinto_pegajoso_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(320, 300, 2); 
        prepare();
        
        new Menu().Mundo = 10;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //terreno
        Roca_laberinto roca_laberinto = new Roca_laberinto();
        addObject(roca_laberinto,14,13);

        Roca_laberinto roca_laberinto2 = new Roca_laberinto();
        addObject(roca_laberinto2,44,13);

        Roca_laberinto roca_laberinto3 = new Roca_laberinto();
        addObject(roca_laberinto3,74,13);

        Roca_laberinto roca_laberinto4 = new Roca_laberinto();
        addObject(roca_laberinto4,104,13);

        Roca_laberinto roca_laberinto5 = new Roca_laberinto();
        addObject(roca_laberinto5,134,13);

        Roca_laberinto roca_laberinto6 = new Roca_laberinto();
        addObject(roca_laberinto6,164,13);

        Roca_laberinto roca_laberinto7 = new Roca_laberinto();
        addObject(roca_laberinto7,194,13);

        Roca_laberinto roca_laberinto8 = new Roca_laberinto();
        addObject(roca_laberinto8,288,13);

        Roca_laberinto roca_laberinto9 = new Roca_laberinto();
        addObject(roca_laberinto9,311,13);

        Roca_laberinto roca_laberinto10 = new Roca_laberinto();
        addObject(roca_laberinto10,304,40);

        Roca_laberinto roca_laberinto11 = new Roca_laberinto();
        addObject(roca_laberinto11,304,68);

        Roca_laberinto roca_laberinto12 = new Roca_laberinto();
        addObject(roca_laberinto12,304,96);

        Roca_laberinto roca_laberinto13 = new Roca_laberinto();
        addObject(roca_laberinto13,304,124);

        Roca_laberinto roca_laberinto14 = new Roca_laberinto();
        addObject(roca_laberinto14,304,152);

        Roca_laberinto roca_laberinto15 = new Roca_laberinto();
        addObject(roca_laberinto15,304,180);

        Roca_laberinto roca_laberinto16 = new Roca_laberinto();
        addObject(roca_laberinto16,304,208);

        Roca_laberinto roca_laberinto17 = new Roca_laberinto();
        addObject(roca_laberinto17,304,236);

        Roca_laberinto roca_laberinto18 = new Roca_laberinto();
        addObject(roca_laberinto18,304,264);

        Roca_laberinto roca_laberinto19 = new Roca_laberinto();
        addObject(roca_laberinto19,304,291);

        Roca_laberinto roca_laberinto20 = new Roca_laberinto();
        addObject(roca_laberinto20,275,287);

        Roca_laberinto roca_laberinto21 = new Roca_laberinto();
        addObject(roca_laberinto21,246,287);

        Roca_laberinto roca_laberinto22 = new Roca_laberinto();
        addObject(roca_laberinto22,216,287);

        Roca_laberinto roca_laberinto23 = new Roca_laberinto();
        addObject(roca_laberinto23,187,287);

        Roca_laberinto roca_laberinto24 = new Roca_laberinto();
        addObject(roca_laberinto24,158,287);

        Roca_laberinto roca_laberinto25 = new Roca_laberinto();
        addObject(roca_laberinto25,129,287);

        Roca_laberinto roca_laberinto26 = new Roca_laberinto();
        addObject(roca_laberinto26,99,287);

        Roca_laberinto roca_laberinto27 = new Roca_laberinto();
        addObject(roca_laberinto27,70,287);

        Roca_laberinto roca_laberinto28 = new Roca_laberinto();
        addObject(roca_laberinto28,42,287);

        Roca_laberinto roca_laberinto29 = new Roca_laberinto();
        addObject(roca_laberinto29,13,287);

        Roca_laberinto roca_laberinto30 = new Roca_laberinto();
        addObject(roca_laberinto30,13,260);

        Roca_laberinto roca_laberinto31 = new Roca_laberinto();
        addObject(roca_laberinto31,13,233);

        Roca_laberinto roca_laberinto32 = new Roca_laberinto();
        addObject(roca_laberinto32,13,205);

        Roca_laberinto roca_laberinto33 = new Roca_laberinto();
        addObject(roca_laberinto33,13,177);

        Roca_laberinto roca_laberinto34 = new Roca_laberinto();
        addObject(roca_laberinto34,13,149);

        Roca_laberinto roca_laberinto35 = new Roca_laberinto();
        addObject(roca_laberinto35,13,122);

        Roca_laberinto roca_laberinto36 = new Roca_laberinto();
        addObject(roca_laberinto36,13,95);

        Roca_laberinto roca_laberinto37 = new Roca_laberinto();
        addObject(roca_laberinto37,13,67);

        Roca_laberinto roca_laberinto38 = new Roca_laberinto();
        addObject(roca_laberinto38,13,39);
        
        PisoLaberinto pisoLaberinto = new PisoLaberinto();
        addObject(pisoLaberinto,219,9);
        PisoLaberinto pisoLaberinto2 = new PisoLaberinto();
        addObject(pisoLaberinto2,234,7);
        PisoLaberinto pisoLaberinto3 = new PisoLaberinto();
        addObject(pisoLaberinto3,250,9);
        PisoLaberinto pisoLaberinto4 = new PisoLaberinto();
        addObject(pisoLaberinto4,265,7);
        
        //jugador
        Player player = new Player();
        addObject(player,240,33);
        removeObject(player);
        
        addObject(player,240,50);
    }
}

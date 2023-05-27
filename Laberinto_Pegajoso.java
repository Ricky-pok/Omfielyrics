import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laberinto_Pegajoso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laberinto_Pegajoso extends World
{

    /**
     * Constructor for objects of class Laberinto_Pegajoso.
     * 
     */
    public void act()
    {

    }

    public Laberinto_Pegajoso()
    {
        super(320, 300, 2); 
        prepare();
        
        new Menu().Mundo = 9;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Jugador
        addObject(new Player(),32,177);

        //terreno
        addObject(new Roca_laberinto(),13,138);
        addObject(new Roca_laberinto(),43,138);
        addObject(new Roca_laberinto(),73,138);
        addObject(new Roca_laberinto(),103,138); 
        addObject(new Roca_laberinto(),133,138);
        addObject(new Roca_laberinto(),163,138);
        addObject(new Roca_laberinto(),193,138);
        addObject(new Roca_laberinto(),275,138);
        addObject(new Roca_laberinto(),305,138);
        addObject(new Roca_laberinto(),73,230);
        addObject(new Roca_laberinto(),13,230);
        addObject(new Roca_laberinto(),43,230);
        addObject(new Roca_laberinto(),103,230);
        addObject(new Roca_laberinto(),133,230);
        addObject(new Roca_laberinto(),163,230);
        addObject(new Roca_laberinto(),193,230);
        addObject(new Roca_laberinto(),275,230);
        addObject(new Roca_laberinto(),305,230);
        addObject(new Roca_laberinto(),193,103);
        addObject(new Roca_laberinto(),193,75);
        addObject(new Roca_laberinto(),275,103);
        addObject(new Roca_laberinto(),275,75);
        addObject(new Roca_laberinto(),275,47);
        addObject(new Roca_laberinto(),275,19);
        addObject(new Roca_laberinto(),275,4);
        addObject(new Roca_laberinto(),304,103);
        addObject(new Roca_laberinto(),304,75);
        addObject(new Roca_laberinto(),304,47);
        addObject(new Roca_laberinto(),304,24);
        addObject(new Roca_laberinto(),304,12);
        addObject(new Roca_laberinto(),275,258);
        addObject(new Roca_laberinto(),305,258);
        addObject(new Roca_laberinto(),304,286);
        addObject(new Roca_laberinto(),275,286);     
        addObject(new Roca_laberinto(),193,258);
        addObject(new Roca_laberinto(),193,286);
        addObject(new Roca_laberinto(),163,258);
        addObject(new Roca_laberinto(),133,258);
        addObject(new Roca_laberinto(),163,286);
        addObject(new Roca_laberinto(),133,286);
        
        
        Roca_laberinto roca_laberinto41 = new Roca_laberinto();
        addObject(roca_laberinto41,103,258);

        Roca_laberinto roca_laberinto42 = new Roca_laberinto();
        addObject(roca_laberinto42,103,286);

        Roca_laberinto roca_laberinto43 = new Roca_laberinto();
        addObject(roca_laberinto43,73,258);

        Roca_laberinto roca_laberinto44 = new Roca_laberinto();
        addObject(roca_laberinto44,73,286);

        Roca_laberinto roca_laberinto45 = new Roca_laberinto();
        addObject(roca_laberinto45,43,258);

        Roca_laberinto roca_laberinto46 = new Roca_laberinto();
        addObject(roca_laberinto46,43,286);

        Roca_laberinto roca_laberinto47 = new Roca_laberinto();
        addObject(roca_laberinto47,13,257);

        Roca_laberinto roca_laberinto48 = new Roca_laberinto();
        addObject(roca_laberinto48,13,285);
       

        Puerta_laberinto puerta_laberinto = new Puerta_laberinto();
        addObject(puerta_laberinto,235,268);

        Puerta_laberinto_lado puerta_laberinto_lado = new Puerta_laberinto_lado();
        addObject(puerta_laberinto_lado,288,184);
        puerta_laberinto_lado.setRotation(180);
        
        Roca_laberinto roca_laberinto49 = new Roca_laberinto();
        addObject(roca_laberinto49,275,122);
        
        Roca_laberinto roca_laberinto50 = new Roca_laberinto();
        addObject(roca_laberinto50,305,123);
        
        Roca_laberinto roca_laberinto51 = new Roca_laberinto();
        addObject(roca_laberinto51,193,120);
        
    }
    
}

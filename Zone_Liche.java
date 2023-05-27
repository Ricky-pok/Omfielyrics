import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Zone_Liche extends World
{
    int P = 1;
    public Zone_Liche()
    {
        super(318, 240, 2);
        prepare();
        
        new Menu().Mundo = 8;
    }
    
    
    private void prepare()
    {
        Player p = new Player();      
        
        
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
        
        
        addObject(p,15,160);
        Liche liche = new Liche();
        addObject(liche,159,120);
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Admin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Admin extends Boss
{
    int entrada1 = 100; // creada para retrasar el comienzo de la ejecucion 
    int entrada2 = 450; // creada para tener el tiempo correcto en el dialogo del admin
    boolean orb_one; //creada para comprobar si hay una orbe en el mapa 
    boolean dialogo_one; //creada para comprobar si hay una dialogo en el mapa 
     
     // añadir gif 
    GifImage AdminGif    = new GifImage("The_Admin.gif");
    GifImage Admin_not_orb    = new GifImage("The_Admin_not_Orb.gif");
    
    /**
     * Act - do whatever the Admin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        inicio_pelea();
        entrada();
}

// uso la variable de entrada1 para crear una forma de retrasar
 //la ejecucion del codigo 
private void entrada()
{
    if(entrada1 > 0 ){
            //getWorld().showText("" +entrada1, 150, 50);
            entrada1--;
    }
    
}



//comienza la pelea con el jefe Admin

private void inicio_pelea(){ 

    //comprueba si el retraso de el bloque entrada() termino
    if(entrada1 == 0){   

    //crea un retraso que ayuda a que se ejecute el
    //bloque del dialogo en el tiempo correcto    
    if(entrada2 >= 0 ){
            //getWorld().showText("" +entrada2, 50, 50);
            entrada2--;
            
            if(dialogo_one == false){
            getWorld().addObject
                (new Dialogo_Admin(),150 , 100 );
                //añade valor a dialogo_one para que nose ejecute este bloque otra vez
            dialogo_one = true;
            }
       
        }   

        //normal
        
    if(entrada2 > 0){
            
            setImage(AdminGif.getCurrentImage());
        }
        
        //elimina el dialogo e inicia la pelea
        else{
        
            setImage(Admin_not_orb.getCurrentImage());
            
            getWorld().removeObjects
            (getWorld().getObjects(Dialogo_Admin.class));
            
            // comienza el ataque
            if(orb_one == false){
                
                
                getWorld().addObject
                (new Attack_Orb(), getX(), getY() + 100);
           
                orb_one = true;
          
                }
            }   
        } 
    }
}


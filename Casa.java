
public class Casa
{
    // instance variables - replace the example below with your own
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    Square puertas;
    Casa casa2;
    
    public Casa()
    {
        // initialise instance variables
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
        
    }

    
    public void dibujate()
    {
        // put your code here
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
    void muevete(int x)
    {
        //pared
        pared.changeColor("Black");
        pared.moveHorizontal(9+x);
        pared.changeSize(45);
        
        //puerta
        puerta.changeSize(15);
        puerta.moveHorizontal(25+x);
        puerta.moveVertical(30);
        
        //techo
        techo.moveHorizontal(40+x);
        techo.changeSize(40,60);
        
        //ventana.
        ventana.changeSize(20);
        ventana.moveHorizontal(60+x);
        ventana.moveVertical(-27);
        
    }
    
    void otraCasa()
    {
        casa2 = new Casa();
        
        casa2.dibujate();
        casa2.muevete(60);
    }
}

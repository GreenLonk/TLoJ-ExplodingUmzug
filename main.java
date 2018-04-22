import GLOOP.*;
public class main
{
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLBoden gras;
    private GLHimmel himmel;
    
    private Apfel apfel;
    //private Waschmaschine waschmaschine;
    
    private Jannes jannes;
    private Spielfläche boden;

    public main()
    {
        kamera = new GLEntwicklerkamera();
        licht = new GLLicht();
        gras = new GLBoden("Texturen/Grastextur.jpg");
        himmel = new GLHimmel("Texturen/Himmel.png");
        
        apfel = new Apfel(0,20,0,20);
        //waschmaschine = new Waschmaschine(0,0,0,100);
        
        boden = new Spielfläche(500);
        
        //fuehreAus();
    }
    
    public void fuehreAus(){
        Sys.warte(1000);
        for(int i = 0; i < 50; i++){
            //apfel.fallen();
            Sys.warte(100);
        }
    }
}

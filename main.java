import GLOOP.*;
public class main
{
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLBoden gras;
    private GLHimmel himmel;
    private GLNebel nebel;
    
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
        nebel = new GLNebel();
        nebel.setzeNebelbereich(1000,4000);
        boden = new Spielfläche(500);
                
        apfel = new Apfel(0,20,0,20);
        //waschmaschine = new Waschmaschine(0,0,0,100);
        
        jannes = new Jannes(100,0,0,40);
        
        nebel.setzeFarbe(0.4,0.7,1);
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

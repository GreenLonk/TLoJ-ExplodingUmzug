import GLOOP.*;
public class main
{
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private Apfel apfel;
    private Waschmaschine waschmaschine;
    private Jannes jannes;
    private Grundfläche boden;
    private GLBoden gras;
    public main()
    {
        kamera = new GLEntwicklerkamera();
        licht = new GLLicht();
        gras = new GLBoden("Grastextur.jpg");
        apfel = new Apfel(0,0,0,10);
        waschmaschine = new Waschmaschine(0,0,0,100);
        boden = new Grundfläche(1000);
        //fuehreAus();
    }
    
    public void fuehreAus(){
        Sys.warte(1000);
        for(int i = 0; i < 50; i++){
            apfel.fallen();
            Sys.warte(100);
        }
    }
}

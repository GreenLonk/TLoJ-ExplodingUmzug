import GLOOP.*;
public class main
{
    private GLSchwenkkamera kamera;
    private GLLicht licht;
    private Apfel apfel;
    private Waschmaschine waschmaschine;
    private Jannes jannes;
    public main()
    {
        kamera = new GLSchwenkkamera();
        licht = new GLLicht();
        apfel = new Apfel(0,0,0,10);
        waschmaschine = new Waschmaschine(0,0,0,100);
        
        fuehreAus();
    }
    
    public void fuehreAus(){
        Sys.warte(1000);
        for(int i = 0; i < 500; i++){
            apfel.fallen();
            Sys.warte(100);
        }
    }
}

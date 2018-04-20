import GLOOP.*;
public class main
{
    private GLSchwenkkamera kamera;
    private GLLicht licht;
    private Apfel apfel;
    private Jannes jannes;
    public main()
    {
        kamera = new GLSchwenkkamera();
        licht = new GLLicht();
        apfel = new Apfel(0,0,0,10);
        
        fuehreAus();
    }
    
    public void fuehreAus(){
        Sys.warte(1000);
        for(int i = 0; i < 50; i++){
            apfel.fallen();
            Sys.warte(100);
        }
    }
}

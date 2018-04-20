import GLOOP.*;
public class main
{
    private GLSchwenkkamera kamera;
    private GLLicht licht;
    private Apfel apfel;
    public main()
    {
        kamera = new GLSchwenkkamera();
        licht = new GLLicht();
        apfel = new Apfel(0,0,0,10);
    }
}

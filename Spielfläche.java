import GLOOP.*;
public class Spielfläche
{
    private GLQuader boden;
    private GLQuader zaunl, zaunr, zaunv, zaunh; //links, rechts, vorne, hinten
    
    /**
     * Erstellt eine quadratische Grundfläche mit den Maßen pLaenge
     */
    public Spielfläche(int pLaenge)
    {
        boden = new GLQuader(0,0,0,pLaenge,1,pLaenge);
        zaunl = new GLQuader((pLaenge/2),(pLaenge/20),0,(pLaenge/100),(pLaenge/10),pLaenge);
        boden.setzeTextur("Texturen/Spielfläche.jpg");
        zaunl.setzeTextur("Texturen/Zaun.jpg");
    }
}

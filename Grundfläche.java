import GLOOP.*;
public class Grundfläche
{
    private GLQuader boden;
    private GLQuader zaunl, zaunr, zaunv, zaunh; //links, rechts, vorne, hinten
    
    /**
     * Erstellt eine quadratische Grundfläche mit den Maßen pLaenge
     */
    public Grundfläche(int pLaenge)
    {
        boden = new GLQuader(0,0,0,pLaenge,1,pLaenge);
        zaunl = new GLQuader((pLaenge/2),0,0,10,(pLaenge/10),pLaenge);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  /**  public int sampleMethod(int y)
    {
        // put your code here
     return x + y;
    }*/
}

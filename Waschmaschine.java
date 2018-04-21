import GLOOP.*;
public class Waschmaschine extends Fallobst
{
    public Waschmaschine(double pX, double pY, double pZ, double breite)
    {
        objekt1 = new GLQuader(pX,pY,pZ,breite,breite*1.5,breite);
        objekt2 = new GLZylinder(pX,pY,pZ+(breite/2),breite/3,breite/4);
    }
}

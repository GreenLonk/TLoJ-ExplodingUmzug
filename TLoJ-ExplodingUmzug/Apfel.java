import GLOOP.*;
public class Apfel extends Fallobst
{
    public Apfel(double pX, double pY, double pZ, double radius)
    {
        objekt1 = new GLKugel(pX,pY,pZ,radius);
        objekt2 = new GLZylinder(pX,pY+radius,pZ,1,2);
        objekt2.drehe(90,0,0);
        
        objekt1.setzeFarbe(1,0,0);
        objekt2.setzeFarbe(0.75,0.55,0.07);
    }
}

import GLOOP.*;
public class Jannes
{ 
    //Karton
    private GLQuader boden,seite1,seite2,seite3,seite4;
    private GLZylinder bein1,bein2;
    
    //Brille
    private GLZylinder bügel1,bügel2;
    private GLTorus glas1,glas2;
    public Jannes(double pX,double pY,double pZ,double breite)
    {
        //Karton
        bein1 = new GLZylinder(pX+breite/3,pY+breite/4,pZ,breite/8,breite/2);
        bein2 = new GLZylinder(pX-breite/3,pY+breite/4,pZ,breite/8,breite/2);
        bein1.drehe(90,0,0);
        bein2.drehe(90,0,0);
        
        boden = new GLQuader(pX,pY+breite/2,pZ,breite,2,breite);
        seite1 = new GLQuader(pX+breite/2,pY+(7*breite)/8,pZ,2,(3*breite)/4,breite);
        seite2 = new GLQuader(pX-breite/2,pY+(7*breite)/8,pZ,2,(3*breite)/4,breite);
        seite3 = new GLQuader(pX,pY+(7*breite)/8,pZ+breite/2,breite,(3*breite)/4,2);
        seite4 = new GLQuader(pX,pY+(7*breite)/8,pZ-breite/2,breite,(3*breite)/4,2);
        
        //Brille
        bügel1 = new GLZylinder(pX+breite/2+2,pY+breite,pZ,2,breite);
        bügel2 = new GLZylinder(pX-breite/2-2,pY+breite,pZ,2,breite);
        
        glas1 = new GLTorus(pX+breite/4,pY+breite,pZ+breite/2+2,breite/4,2);
        glas2 = new GLTorus(pX-breite/4,pY+breite,pZ+breite/2+2,breite/4,2);
    }
}

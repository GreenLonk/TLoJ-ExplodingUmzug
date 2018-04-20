import GLOOP.*;
public abstract class Fallobst
{
    protected GLObjekt objekt1,objekt2;
    public void fallen(){
        objekt1.verschiebe(0,-1,0);
        objekt2.verschiebe(0,-1,0);
    }
}

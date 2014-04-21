package objets;

/** */
public abstract class Vol
{
    /** */
    private String numeroVol;
    
    /** */
    private String ville;
    
    /** */
    private int heure;
    
    /** */
    private int minute;
    
    /** */
    private String tempsBloquage;
    
    
    public Vol(String _numeroVol, int _h, int _m, String ville)
    {
    	this.numeroVol=_numeroVol;
    	this.heure=_h;
    	this.minute=_m;
    	this.ville=ville;
    	
    }
    
    public String getId()
    {
    	return this.numeroVol;
    }
    
    public String toString()
    {
    	return "\tNuméro\t:\t"+this.numeroVol+"\n\tVille\t:\t"+this.ville+"\n\tHeure\t:\t"+this.heure+"h"+this.minute;
    }
    
    public void afficher()
    {
    	System.out.println(this.toString());
    }
}

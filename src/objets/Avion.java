package objets;

import java.util.Hashtable;
import java.util.Iterator;

/** */
public abstract class Avion
{
    
    /** */
    private String nomAvion;
    
    /** */
    private String immatriculation;


    private Hashtable<String,Vol> vols;
    
    private static Hashtable<String, Avion> listeAvions = new  Hashtable<String, Avion>();
    
    public Avion(String _imma, String _nomAv)
    {
    	this.immatriculation=_imma;
    	this.nomAvion=_nomAv;
    	this.vols=new Hashtable<String,Vol>();
    	listeAvions.put(_imma, this) ;
    }
    
    public void ajoutVol(String _numeroVol, int _h, int _m, String ville)
    {
    	if(ville.equals(""))
    	{
    		this.vols.put(_numeroVol, new Vol_depart(_numeroVol, _h, _m, ville));
    	}
    	else
    	{
    		this.vols.put(_numeroVol, new Vol_arrive(_numeroVol, _h, _m, ville));
    	}
    }
    
    public String toString()
    {
    	String ch="\nImmatriculation\t\t:\t"+this.immatriculation+"\nNom\t\t\t:\t"+this.nomAvion;
   
    	ch+="\n\nVols associés\t\t:\n";
    	
		Iterator<Vol> it = this.vols.values().iterator();
		while (it.hasNext()) 
		{
			ch+=it.next().toString();
			ch+="\n\n";
		} 
		
    	return ch;
    }
    
    public void afficher()
    {
    	System.out.println(this.toString());
    	System.out.println("\n\n");
    }
    
    public static void afficherListeAvion()
    {
    	Iterator<Avion> it = listeAvions.values().iterator();
		while (it.hasNext()) 
		{
			it.next().afficher();
			System.out.println("\n\n");
		} 
    	
    	
    	System.out.println("\n\n");
    }

	public static Hashtable<String, Avion> getListeAvions() 
	{
		return listeAvions; 
	}

    
    
    
}


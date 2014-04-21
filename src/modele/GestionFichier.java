package modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;

import objets.Avion;
import objets.Grand_avion;
import objets.Petit_avion;

public final class GestionFichier 
{
	public static Hashtable<String,Avion> extractionAvions(String _chemin)
	{
		Hashtable<String,Avion> listeAvions=new Hashtable<String,Avion>();
		
		try
		{
			BufferedReader in=new BufferedReader(new FileReader(_chemin));
		    String line; // ligne courante du fichier contenant les infos sur les avions
		    String tmp[]; // tmp[0]=imma, tmp[1]=nom de l'avion
		    
		    while ((line = in.readLine()) != null) 
		    {
		    	tmp=line.split(" "); // segmentation de la ligne
		    	if(tmp[1].equals("AIRBUS-A380"))
		    	{
		    		listeAvions.put(tmp[0],new Grand_avion(tmp[0],tmp[1])); // ajout à la hashtable de l'avion courant
		    	}
		    	else
		    	{
		    		listeAvions.put(tmp[0],new Petit_avion(tmp[0],tmp[1])); // ajout à la hashtable de l'avion courant
		    	}
		    	
		    }
		   	in.close();
		   	return listeAvions;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	public static int extractionVols(String _chemin, Hashtable<String,Avion> _listeA)
	{
		try
		{
			BufferedReader in=new BufferedReader(new FileReader(_chemin));
		    String line; // ligne courante du fichier contenant les infos sur les avions
		    String tmp[]; // tmp[0]=imma, tmp[1]=nom de l'avion
		    
		    while ((line = in.readLine()) != null) 
		    {
		    	tmp=line.split("  | "); // segmentation de la ligne regexp : pour erreur de double space dans le fichier

		    	_listeA.get(tmp[4]).ajoutVol(tmp[0],Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]), tmp[3]);
		    	
		    	
		    }
		   	in.close();
		   	return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 1;
		}
	}
}


















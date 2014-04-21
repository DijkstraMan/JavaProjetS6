package vue;

import java.util.Hashtable;
import java.util.Iterator;

import objets.Avion;
import objets.Zone;
import modele.GestionFichier;



public class main
{

	public static void main(String[] args) 
	{
		//initialisation
		
		Hashtable<String,Zone> listeZones = new Hashtable<String,Zone>();
		
		listeZones.put("M1", new Zone("M1","Mike M1"));
		listeZones.put("M1", new Zone("M2","Mike M2"));
		listeZones.put("M1", new Zone("M3","Mike M3"));
		listeZones.put("M1", new Zone("M4","Mike M4"));
		
		listeZones.put("P1", new Zone("P1","Papa P1"));
		listeZones.put("P2", new Zone("P2","Papa P2"));
		listeZones.put("P4", new Zone("P4","Papa P4"));
		
		listeZones.put("R1", new Zone("R1","Romeo R1"));
		listeZones.put("R2", new Zone("R2","Romeo R2"));
		
		listeZones.put("S1", new Zone("S1","Sierra S4"));
		listeZones.put("S5", new Zone("S5","Sierra S5"));
		
		listeZones.put("T3", new Zone("T3","Tango T3"));
		listeZones.put("T7", new Zone("T7","Tango T7"));
		
		listeZones.put("U4", new Zone("U4","Uniform U4"));
		
		listeZones.put("V6", new Zone("V6","Victor V6"));
		listeZones.put("V7", new Zone("V7","Victor V7"));
		
		
		String chAvion="avionsFA-14-v1.txt"; // fichier infos avions
		String chProgVol="ProgrammeVolsFA-14-v1.txt"; // fichier infos programmation vol
	
		
		GestionFichier.extractionAvions(chAvion);
		GestionFichier.extractionVols(chProgVol, Avion.getListeAvions());
		
		
		Avion.afficherListeAvion();
		
		

	}

}

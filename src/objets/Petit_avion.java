package objets;

/** */
public class Petit_avion extends Avion
{
	public Petit_avion(String _imma, String _nomAv) 
	{
		super(_imma, _nomAv);
	}
	
	public String toString()
	{
		return "\n\t\tPetit Avion"+super.toString()+"\n";
	}
}

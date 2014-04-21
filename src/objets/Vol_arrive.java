package objets;

/** */
public class Vol_arrive extends Vol
{
	public Vol_arrive(String _numeroVol, int _h, int _m, String ville) 
	{
		super(_numeroVol, _h, _m, ville);
	}
	
	public String toString()
	{
		return "\n\t\tArrivé\n"+super.toString()+"\n";
	}
}

package objets;

/** */
public class Vol_depart extends Vol
{
	public Vol_depart(String _numeroVol, int _h, int _m, String ville) 
	{
		super(_numeroVol, _h, _m, ville);
	}
	
	public String toString()
	{
		return "\n\t\tD�part"+super.toString()+"\n";
	}
}

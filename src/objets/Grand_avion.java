package objets;

/** */
public class Grand_avion extends Avion
{
	public Grand_avion(String _imma, String _nomAv) 
	{
		super(_imma, _nomAv);
	}
	
	public String toString()
	{
		return "\n\t\tGrand Avion"+super.toString()+"\n";
	}
}

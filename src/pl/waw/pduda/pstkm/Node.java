package pl.waw.pduda.pstkm;

public class Node
{
    
	public static final int AP = 0;
    public static final int CABINET =1;
    public static final int CENTRAL =2;
    public static final int END =3;
	
    private String _id;
    private int _type;
    private int _instalationCost;

    public Node(int t, String i,int cost)
    {
        _type=t;
        _id = i;
        _instalationCost = cost;
    }
    public String getId()
    {
    	return this._id;
    }
    public int getInstalationCost()
    {
    	return this._instalationCost;
    }
    @Override
	public String toString() {
		return "Node [_id=" + _id + ", _type=" + _type + ", _instalationCost="
				+ _instalationCost + "]";
	}
}
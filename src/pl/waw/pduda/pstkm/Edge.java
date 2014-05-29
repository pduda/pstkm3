package pl.waw.pduda.pstkm;

public class Edge
{
    private int _instalationCost;
    private int _routingCost;
    private String _id;
    
    public Edge(int i_cost,int r_cost,String i)
    {
	_instalationCost = i_cost;
	_routingCost = r_cost;
	_id = i;
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
    public String toString()
    {
	return "Edge [_instalation_cost=" + _instalationCost
		+ ", _routing_cost=" + _routingCost + ", _id=" + _id + "]";
    }
    
}

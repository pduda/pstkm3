package pl.waw.pduda.pstkm;

import java.util.Hashtable;
import java.util.Map;

public class Path
{
    
	Pair<String, String> _demand;
    String _id;
    int _cost;
    Map<String,Node> _nodes = new Hashtable<String,Node>();
    Map<String,Edge> _edges = new Hashtable<String,Edge>();
    
    public Path(String id,int c,Pair<String, String> d)
    {
		this._demand = d;
		this._id = id;
		this._cost= c;
    }
    public int getCost()
    {
    	return this._cost;
    }
    public String getId()
    {
    	return this._id;
    }
    public boolean hasNode(Node n)
    {
    	return this._nodes.containsKey(n.getId());
    }
    public boolean hasEdge(Edge e)
    {
    	return this._edges.containsKey(e.getId());
    }
    @Override
	public String toString() 
    {
    	StringBuilder sb = new StringBuilder();
		
		for(Node v : _nodes.values())
		{
		    sb.append(v.getId()+" ");
		}
		return sb.toString();
	}
 
}

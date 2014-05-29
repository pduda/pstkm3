package pl.waw.pduda.heuristic;

public abstract class SimulatedAnnealing 
{
	SimulatedAnnealingSolutionSpace _solutions;
	SimulatedAnnealingSolution _best;
	SimulatedAnnealingSolution _current;
	double _temperature;
	
	protected abstract void _init();
	protected abstract boolean _stopCondition();
	protected abstract void _updateTemperature();
	
	private double acceptanceProbability(int energy, int newEnergy) 
	{
        if (newEnergy < energy) 
            return 1.0;

        return Math.exp((energy - newEnergy) / this._temperature);
    }
	
	public void start()
	{
		//ustawia temperature i warunki poczatkowe
		this._init();
        
        while (this._stopCondition()) 
        {
            // Create new neighbour tour
        	SimulatedAnnealingSolution temp = this._solutions.getNeighbour(this._current);
            
            // Get energy of solutions
            int currentEnergy = this._current.getCost();
            int neighbourEnergy = temp.getCost();

            // Decide if we should accept the neighbour
            if (acceptanceProbability(currentEnergy, neighbourEnergy) > Math.random()) 
                this._current = temp;

            // Keep track of the best solution found
            if (this._current.getCost() < this._best.getCost()) 
                this._best = this._current;
            
            // Cool system
            _updateTemperature();
        }
	}
}

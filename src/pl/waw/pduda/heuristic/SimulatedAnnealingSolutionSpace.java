package pl.waw.pduda.heuristic;

public interface SimulatedAnnealingSolutionSpace {
	public SimulatedAnnealingSolution getNeighbour(SimulatedAnnealingSolution current);
	public SimulatedAnnealingSolution getFirst();
}

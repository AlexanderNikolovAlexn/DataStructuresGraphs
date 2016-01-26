package roadgraph;

import java.util.HashSet;
import java.util.Set;

import geography.GeographicPoint;

public class MapNode {
	
	private GeographicPoint location;
	private Set<MapEdge> edges;
	
	public MapNode(GeographicPoint location, Set<MapEdge> edges) {
		this.location = location;
		this.edges = edges;
	}

	public MapNode(GeographicPoint location) {
		this(location, new HashSet<>());
	}

	public GeographicPoint getLocation() {
		return location;
	}

	public void setLocation(GeographicPoint location) {
		this.location = location;
	}

	public Set<MapEdge> getEdges() {
		return edges;
	}

	public void setEdges(Set<MapEdge> edges) {
		this.edges = edges;
	}
	
	public void addEdge(GeographicPoint to, String roadName,
			String roadType, double length) {
		MapEdge mapEdge = new MapEdge(to, roadName, roadType, length);
		if(!this.location.equals(to)){
			this.edges.add(mapEdge);
		}
	}
	
}

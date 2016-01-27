package roadgraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	
	private GeographicPoint location;
	private List<MapEdge> edges;
	
	public MapNode(GeographicPoint location, List<MapEdge> edges) {
		this.location = location;
		this.edges = edges;
	}

	public MapNode(GeographicPoint location) {
		this(location, new LinkedList<>());
	}

	public GeographicPoint getLocation() {
		return location;
	}

	public void setLocation(GeographicPoint location) {
		this.location = location;
	}

	public List<MapEdge> getEdges() {
		return edges;
	}

	public void setEdges(List<MapEdge> edges) {
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

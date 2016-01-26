package roadgraph;

import geography.GeographicPoint;

public class MapEdge {

	private GeographicPoint end;
	private String streetName;
	private String roadType;
	private double distance;
	
	public MapEdge(GeographicPoint end, String streetName, String roadType, double distance) {
		this.end = end;
		this.streetName = streetName;
		this.roadType = roadType;
		this.distance = distance;
	}
	
	public GeographicPoint getEnd() {
		return end;
	}
	public void setEnd(GeographicPoint end) {
		this.end = end;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
	
	
	
}

import java.util.LinkedHashMap;

<<<<<<< HEAD
/** 
 * Map Class - Graph representation of the current scenario. 
 * Acts as a "helper class" to FreightSystemAPI via the FreightSpace controller 
 * 
 * COMP2911 Assignment 2 - 2017 Semester 1 [UNSW CSE]
 * @author	Chris Joy
 * @date	05/05/17
 */
public class Map {
	/**
	 * Map contructor - basically a linear hashmap of towns (nodes) 
	 */
=======
public class Map {
	private LinkedHashMap<String, Town> towns = null;
	
>>>>>>> 40b20acef9692c0bb8c45368dbb0927549c31dcc
	public Map() {
		this.towns = new LinkedHashMap<String, Town>();
	}
	
<<<<<<< HEAD
	/**
	 * Get all the towns in the map.
	 * 
	 * @return all towns in the map
	 */
	public LinkedHashMap<String, Town> getTowns() {
		return this.towns;
	}
	
	/**
	 * Get a single town, given a name
	 * 
	 * @param town string name of the town
	 * @return the town object with given name
	 */
=======
	// get list of loaded towns
	public LinkedHashMap<String, Town> getTowns() {
		return this.towns;
	}
	// get single town
>>>>>>> 40b20acef9692c0bb8c45368dbb0927549c31dcc
	public Town getTown(String town) {
		return towns.get(town);
	}
	
<<<<<<< HEAD
	/**
	 * Add a town to the name
	 * 
	 * @param cost unloading cost
	 * @param name string name of the town
	 */
=======
	// add town to map
>>>>>>> 40b20acef9692c0bb8c45368dbb0927549c31dcc
	public void addTown(int cost, String name) {
		towns.put(name, new Town(cost, name));
	}
	
<<<<<<< HEAD
	/**
	 * number of towns in the map
	 * 
	 * @return the total number of towns in the map
	 */
	public int numTowns() {
		return towns.size();
	}

	private LinkedHashMap<String, Town> towns = null;
=======
	// number of towns in map
	public int numTowns() {
		return towns.size();
	}
>>>>>>> 40b20acef9692c0bb8c45368dbb0927549c31dcc
}

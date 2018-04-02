/**
 * 
 */
package com.anand.ds.graph;

import java.util.*;
/**
 * @author u45999
 *
 */
public class RoomDoorProblem {
	
	private Map<Integer,ArrayList<Integer>> adjRoomListMap;
	/**
	 * 
	 * @param numOfRooms
	 */
	public RoomDoorProblem(int numOfRooms){
		adjRoomListMap = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=1;i<=numOfRooms;i++){
			ArrayList<Integer> adjacentRooms = new ArrayList<Integer>();
			//create Empty list of adjacentRooms
			adjRoomListMap.put(i,adjacentRooms);
		}
	}
	/**
	 * 
	 * @param firstRoom
	 * @param secondRoom
	 */
	public void addDoor(int firstRoom , int secondRoom){
		if(firstRoom > adjRoomListMap.size() || secondRoom >  adjRoomListMap.size() ){
			System.out.println("I am here");
			return;
		}
		//Since Door open in both the direction
		(adjRoomListMap.get(firstRoom)).add(secondRoom);
		(adjRoomListMap.get(secondRoom)).add(firstRoom);
	}
	/**
	 * 
	 * @param roomNo
	 * @return
	 */
	public ArrayList<Integer> getAdjacentRooms(int roomNo){
		if(roomNo>adjRoomListMap.size()){
			return null;
		}
		return new ArrayList<Integer>(adjRoomListMap.get(roomNo));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 1, sourceRoom , destinationRoom;
		System.out.print("ENTER the Number of Rooms and Doors ");
		Scanner scan = new Scanner(System.in);
		int number_rooms = scan.nextInt();
		int number_doors = scan.nextInt();
		System.out.println("Number of Room => "+number_rooms+" Number of Doors => "+number_doors);
		RoomDoorProblem graphAdjacencyList = new RoomDoorProblem(number_rooms);
		System.out.println("Enter Room in format <source> <destination> , i.e. let say you want to reach out from Room 1 to Room 4 then enter 1 4");
		while(count<=number_doors){
			sourceRoom = scan.nextInt();
			destinationRoom = scan.nextInt();
			System.out.println("sourceRoom => "+sourceRoom+" DestinationRoom=> "+destinationRoom);
			graphAdjacencyList.addDoor(sourceRoom, destinationRoom);
			count++;
		}
		
		System.out.println("\n The GIVEN Adjancecy List for the graph is ");
		System.out.println("\n Below Shows \b ROOM ith => jth => kth => nth \b it means ROOM j,k,n are adjcent to Room i");
		for(int i=1;i<=number_rooms;i++){
			System.out.print("ROOM "+i+" => ");
			ArrayList<Integer> edgeList = graphAdjacencyList.getAdjacentRooms(i);
			if(null!=edgeList){
				for(int j=1;;j++){
					if(j!=edgeList.size()){
						System.out.print(edgeList.get(j-1)+"=> ");
					}else{
						//If Last Neighbour
						System.out.print(edgeList.get(j-1));
						break;
					}
				}
			}else{
				System.out.println("NULL for =>"+i);
			}
			System.out.println();
		}
	  System.out.println("DONE with drafting graph , Now Detect");
	  System.out.println("Tell me from which Room to which Room you want to travel in <sourceRoomNo> <destinationRoomNo> format");
	  int sourceeRoom = scan.nextInt();
	  int destinationeRoom = scan.nextInt();
	  graphAdjacencyList.detectPath(sourceeRoom,destinationeRoom,graphAdjacencyList);
	 // graphAdjacencyList.getAdjacentRooms(sourceeRoom).con

	}
	
	private  void detectPath(int srcRoom,int destRoom,RoomDoorProblem graphAdjacencyList){
		
	}

}

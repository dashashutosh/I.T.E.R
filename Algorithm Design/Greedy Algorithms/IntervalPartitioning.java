package GreeedyAlgorithms;

import java.io.*;
import java.util.*;

public class IntervalPartitioning {
	
	ArrayList<Lecture> lectures = new ArrayList<Lecture>();		

	public static void main(String[] args){
			IntervalPartitioning program = new IntervalPartitioning();
			program.intervalPartition();
		}

		public IntervalPartitioning(){		
			lectures.add(new Lecture(900, 1030, "A"));
			lectures.add(new Lecture(900, 1230, "B"));
			lectures.add(new Lecture(1100, 1230, "D"));
			lectures.add(new Lecture(900, 1030, "C"));
			lectures.add(new Lecture(1100, 1400, "E"));
			lectures.add(new Lecture(1300, 1430, "F"));
		}

		public void intervalPartition(){
			Collections.sort(lectures);		

			ArrayList<Room> allRooms = new ArrayList<Room>();	
			PriorityQueue<Room> roomsQueue = new PriorityQueue<Room>();		
			String outputMessage = "";		

			int roomCount =0;	

			Room firstRoom = new Room(lectures.get(0), ++roomCount);		
			roomsQueue.add(firstRoom);	
			allRooms.add(firstRoom);	
			outputMessage+=lectures.get(0)+"\tadded in room "+firstRoom.getId();

			for(int i=1; i<lectures.size(); i++){		
				Room currentRoom = roomsQueue.peek();		
				Lecture currentLecture = lectures.get(i);	

				if(currentLecture.getStartTime() >= currentRoom.getLastFinished()){		
					currentRoom.addLecture(currentLecture);		
					roomsQueue.remove();
					roomsQueue.add(currentRoom);	
					outputMessage+="\n"+currentLecture+"\tadded in room "+currentRoom.getId();
				}
				else{
					Room newRoom = new Room(currentLecture, ++roomCount);	
					roomsQueue.add(newRoom);	
					allRooms.add(newRoom);		
					outputMessage+="\n" + currentLecture + "\tadded in room " + newRoom.getId();
				}
			}
			
			outputMessage+="\n\nContents of Rooms";
			for(Room room: allRooms){
				outputMessage+= "\nRoom " + room.getId() + ": " + room.getLectures();
			}
			displayMessage(outputMessage);
			
		}

		
		private void displayMessage(String outputMessage) {		
			System.out.println(outputMessage);
			
			try (PrintWriter outputFile = new PrintWriter( new File("output.txt") ); ){
				outputFile.println(outputMessage);
			} catch (FileNotFoundException e) {
				System.out.println("Error! Couldn't create file");
			}
		}


		private class Room implements Comparable<Room>{
			private LinkedList<Lecture> lectures = new LinkedList<Lecture>();	
			private int lastFinished;	
			private int id;				

			public Room(Lecture lecture, int id){
				addLecture(lecture);		
				this.id = id;
			}

			public int getLastFinished(){
				return lastFinished;
			}

			public int getId(){
				return id;
			}

			public LinkedList<Lecture> getLectures(){	
				return lectures;
			}

			public Lecture getLastLecture(){
				return lectures.getLast();
			}

					public void addLecture(Lecture lecture){
				lectures.add(lecture);
				lastFinished = (lecture.getFinishTime());	
			}

			public int compareTo(Room otherRoom) {
				return this.getLastFinished() - otherRoom.getLastFinished();
			}
		}


		private class Lecture implements Comparable<Lecture>{
			private int startTime;
			private int finishTime;
			private String id;

			public Lecture(int startTime, int finishTime, String id){
				this.startTime = startTime;
				this.finishTime = finishTime;
				this.id = id;
			}

			public int getStartTime(){
				return startTime;
			}

			public int getFinishTime(){
				return finishTime;
			}
			
			public String getId(){
				return id;
			}

			public String getTimeFromInt(int intTime){
				String stringTime = intTime + "";		
				if(stringTime.length() == 3){		
					stringTime = stringTime.substring(0, 1) + ":" + stringTime.substring(1, 3);
				}
				else if(stringTime.length() == 4){	
					stringTime = stringTime.substring(0, 2) + ":" + stringTime.substring(2, 4);
				}
				return stringTime;
			}

			public int getIntFromTime(String stringTime){
				stringTime = stringTime.replace(":", "");
				return Integer.parseInt(stringTime);
			}


			public int compareTo(Lecture otherLecture) {
				return this.getFinishTime() - otherLecture.getFinishTime();
			}


			public String toString() {
				String strStartTime = getTimeFromInt( this.getStartTime() );
				String strFinishTime = getTimeFromInt( this.getFinishTime() );
				return "(\""+ getId() + "\"  " + strStartTime+" - "+strFinishTime+")";
			}
		}

}



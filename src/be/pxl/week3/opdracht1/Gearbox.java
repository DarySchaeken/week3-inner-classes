package be.pxl.week3.opdracht1;

import java.util.ArrayList;

public class Gearbox {
    private int maxGears;
    private boolean clutchIsIn;
    private Gear currentGear;
    private ArrayList<Gear> gears;
	
	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		gears = new ArrayList<>();
		gearBuilder();
		currentGear = gears.get(0);
	}
	
	public void operateClutch(boolean in){
		clutchIsIn = in;
	}
	
	public void changeGear(int gearNumber){
		if(clutchIsIn && gearNumber <= maxGears){
			currentGear = gears.get(gearNumber);
			System.out.printf("Gear %d selected\n", gearNumber);
		} else {
			currentGear = gears.get(0);
			System.out.println("GRrshnscush");
		}
	}
	
	public double wheelSpeed(int revs){
		if(clutchIsIn){
			System.out.println("Gnesfcsncsefsdfs");
			return 0;
		} else {
			return currentGear.driveSpeed(revs);
		}
	}
	
	private void gearBuilder(){
		for(int i = 0; i <= maxGears; i++){
			gears.add(new Gear(i));
		}
	}

	private class Gear {
		@SuppressWarnings("unused")
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber){
			this.gearNumber = gearNumber;
			ratio = gearNumber * 5.3;
		}
		
		public double driveSpeed(int revs){
			return ratio*revs;
		}
		
	}
}

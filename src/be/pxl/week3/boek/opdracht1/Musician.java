package be.pxl.week3.boek.opdracht1;

public class Musician {
	
	public Musician() {
		
	}
	
	public void play(){
		new Instrument().makeNoise();
	}
	
	public class Instrument{
		public void makeNoise(){
			System.out.println("Toeter toeter");
		}
	}

}

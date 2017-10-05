package be.pxl.week3.boek.opdracht2;

public class Musician {
	
	public Musician() {
		
	}
	
	public void play(){
		class Instrument{
			public void makeNoise(){
				System.out.println("Toeter toeter");
			}
		}
		
		new Instrument().makeNoise();
	}
	
	

}

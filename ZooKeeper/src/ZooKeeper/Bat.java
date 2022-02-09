package ZooKeeper;

public class Bat extends Mammal {

	public Bat() {
		// TODO Auto-generated constructor stub
		this.energyLevel = 300;
	}

	public void fly() {
		System.out.println("Woosh!");
		this.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("AAAAAHHHHHHHH!!!!!!!");
		this.setEnergyLevel(25);
	}
	
	public void attackTowns() {
		System.out.println("The town is burning!!!! CRAKLE CRAKLE");
		this.setEnergyLevel(-100);
	}
}

package ZooKeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		// TODO Auto-generated constructor stub
		super();		
		}
	public void throwSomething() {
		System.out.println("Gorilla has thrown something");
		setEnergyLevel(-5);		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla loves eating bananas!!!");
		setEnergyLevel(10);		
	}
	
	public void climb() {
		System.out.println("Up in the swinging tree");
		setEnergyLevel(-10);		
	}

}

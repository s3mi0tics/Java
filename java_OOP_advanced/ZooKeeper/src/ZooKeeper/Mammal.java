package ZooKeeper;


public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		// TODO Auto-generated constructor stub
		this.energyLevel = 100;
		
	}
	
	public int displayEnergyLevel() {
		System.out.println(getEnergyLevel());
		return getEnergyLevel();
	};

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}

}

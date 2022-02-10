package art.museum;

public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
			super(title, author, description);
			this.setMaterial(material);
		}
	
	@Override
	public void viewArt() {
		System.out.println("This sculpture: " + this.getTitle() + " made of: " + this.getMaterial() + " is by: " + this.getAuthor() + " Description: " + this.getDescription());
	
		
	}
	
	//GETTERS AND SETTERS
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}

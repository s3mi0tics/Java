package art.museum;

public class Museum {

	public static void main(String[] args) {
		Painting monet = new Painting("lkajds", "Monet", "jklsdflkj", "acrilic");
		Painting manet = new Painting("lkajds", "Manet", "jklsdflkj", "acrilic");
		Painting lucca = new Painting("lkajds", "Lucca", "jklsdflkj", "acrilic");
		
		monet.viewArt();
		
		Sculpture weston = new Sculpture("lkajds", "Weston", "jklsdflkj", "pottery");
		weston.viewArt();
	}

}

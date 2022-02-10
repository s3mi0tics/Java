package art.museum;

public class Painting extends Art {
		private String paintType;
		
		public Painting(String title, String author, String description, String paintType) {
			super();
			this.setPaintType(paintType) ;
			this.setTitle(title);
			this.setAuthor(author);
			this.setDescription(description);
		}
		
		@Override
		public void viewArt() {
			System.out.println("This painting: " + this.getTitle() + " using:" + this.getPaintType() + " is by: " + this.getAuthor() + " Description: " + this.getDescription());			
		}
		
//Getters and Setters
		
		public String getPaintType() {
			return paintType;
		}

		public void setPaintType(String paintType) {
			this.paintType = paintType;
		}		
		
}

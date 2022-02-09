public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;
    public static int numberOfItems;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
        numberOfItems++;
        this.index = numberOfItems;
    }
    // GETTERS & SETTERS  - for name and price
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getindex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }


    
}

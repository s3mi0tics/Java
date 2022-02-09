import java.util.ArrayList;

public class CoffeeKiosk {
    
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();
    
    public CoffeeKiosk(){

    }

    public void addMenuItem(String name, double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index); 
    }

    public void displayMenu(){
        for (Item item: menu){
            System.out.println(item.getindex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }
        public void newOrder() {
        
            // Shows the user a message prompt and then sets their input to a variable, name
            System.out.println("Please enter customer name for new order:");
            String name = System.console().readLine();
            System.out.println("Welcome " + name + "Please enter a menu item index or q to quit:");
            // Your code:
            // Create a new order with the given input string
            Order newOrder = new Order(name);
            // Show the user the menu, so they can choose items to add.
            displayMenu();
            // Prompts the user to enter an item number
            String itemNumber = System.console().readLine();
            // Write a while loop to collect all user's order items
            while(!itemNumber.equals("q")) {
                // Get the item object from the menu, and add the item to the order
                int i = Integer.parseInt(itemNumber);
                if (i<this.menu.size()){
                    Item orderItem = menu.get(i);
                    newOrder.addItem(orderItem);
                }
                else{
                    System.out.println("Sorry we dont have that");
                }
                // Ask them to enter a new item index or q again, and take their input
                System.out.println("Please enter an additional menu item index or q to quit:");
                itemNumber  = System.console().readLine();
            }
            // After you have collected their order, print the order details 
            // as the example below. You may use the order's display method.
            newOrder.display();
            this.orders.add(newOrder);
        }
            //NINJA Bonus
            public void addMenuItemByInput(){
                System.out.println("Please enter a new menu item name");
                String newItemName = System.console().readLine();
                System.out.println("Please enter a new menu item price");
                double newItemPrice = Double.valueOf(System.console().readLine());
                addMenuItem(newItemName, newItemPrice);
    }
}

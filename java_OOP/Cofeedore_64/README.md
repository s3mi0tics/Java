Coffeedore 64
So far we've modularized our original Cafe Java and Business Logic code so that the codebase stores data in a tidy way that is more analogous to real life. We now are storing specific types of things that can do stuff, or rather, object instances that can invoke class methods. Now we're going to make our interactions between these objects a bit more dynamic, by adding user interactivity! 

Objectives:
Be able to use multiple classes together
Instantiate object instances of classes within a different class.
Use class methods to manipulate object instances within a different class.
Use overloaded constructors
Implement user interactivity

Assignment
Now that you've shown the capabilities of your code, the Cafe Java owners want you to make it a full-fledged interactive app. However, they want it to be retro, like an old computer, an Apple II or Commodore 64, where users are shown some text questions in a terminal and can answer or press 'q' to quit. Here's an example of what it will look like:


We'll be using the code base we already have, but will be adding one member variable to the Item class, int index. Don't forget to give it a getter and setter.

To tie it all together and add some interactivity, you will create a new class called CoffeeKiosk

Adding a New CoffeeKiosk Class:
Member variables:

ArrayList<Item> menu
ArrayList<Order> orders
Constructors:

Constructor - no params, initializes items and orders to empty arrays.
Methods:

addMenuItem
The addMenuItem method should create a new item object with the given name and price.
Add the new Item object to the menu items array.
The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.
displayMenu
Now with an array of items you can display the menu without needing separate arrays of names and prices! 
The displayMenu method should display all of the items from the menu array like so:
0 banana -- $2.00 
1 coffee -- $1.50 
2 latte -- $4.50 
3 capuccino -- $3.00 
4 muffin -- $4.00
copy
newOrder
The newOrder method will take input from the user in the terminal to create a new order instance and add it to the orders array. We have given you some code to get you started.
Tips: 
The console input will be of type String, no matter what the user types into the console. 
You can use the built in String .equals() method to do string comparison, rather than the == comparison operator.
To cast the string to an integer, use the Integer.parseInt() method. 
Flex those Documentation reading skills!
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }copy
NINJA BONUS:

addMenuItemByInput
Create a method that lets an admin add menu items manually, using what you now know about getting user input.

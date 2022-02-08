Barista's Challenge
Objectives:
Adding methods to object-oriented classes (custom data types)
Implementing constructors
Implementing setters and getters
Practice how to use the private access modifier
Now that you have made the Order and Item classes, and the data is better organized and easier to manipulate, we're going to refactor your business logic even further to be able to perform some of that simulated functionality inside of the Order class by adding methods, constructors, setters and getters. 

Since we'll be doing the same sorts of actions with every order, we can define methods within the Order class that will work on any order, with distinct customer names, items and totals. Each time a method gets called, it will manipulate only the data stored for that particular order.


Item Class Set Up:
Private Member Variables:

Set the member variables to private instead of  public.
Constructor: 

Add a constructor to your Item class that takes a String name and  double price as arguments to set the name and price for that object on instantiation.
Accessors & Mutators (Getters and Setters):

Create getters and setters for all the member variables.
public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    
    // GETTERS & SETTERS  - for name and price
    
}copy
Order Class Set Up:
Private Member Variables:

Set the member variables to private instead of  public.
This time do not include the total member variable, as we will be using a method for getting the total.
Constructor: 

Add a constructor to your Order class that takes no arguments, but sets the name to "Guest" and initializes the items array to an empty ArrayList<Item> 
Overloaded Constructor: 

Add an overloaded constructor for Order that takes String name as an argument, so you can create an instance with a name.
Accessors & Mutators (Getters and Setters)

Create getters and setters for all the member variables, using good naming convention for boolean accessors.
import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
    
}
copy
Order Class Methods:
addItem

Create a method called addItem  that takes an Item object as an argument and adds the item to the order's items array. No need to return anything.

Hint: How do you get the price of a given item instance from outside the Item class?

getStatusMessage

Create a method called getStatusMessage that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."
getOrderTotal

Similar to the getOrderTotal method from the Cafe Business Logic assignment, create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount. 
Note: This time, you do not need to pass in a list of prices, because each item object in this order's items array has its own price, that you can access using a getter!

display

Similar to the displayMenu function from the Cafe Business Logic assignment, create a method called display that prints out the order information like so:
    Customer Name: Cindhuri
    drip coffee - $1.50
    capuccino - $3.50
    Total: $5.00copy
Implement the Order and Item classes as described above.

Create a testing file to complete the test cases for each method.

Create 2 orders for unspecified guests (without specifying a name);

Create 3 orders using the overloaded constructor to give each a name for the order.

Implement the addItem method within the Order class

Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);

Implement the getStatusMessage method within the Order class

Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());

Implement the getOrderTotal method within the Order class

Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());

Implement the display method within the Order class

Finally, call the display method on all of your orders, like so: order3.display();
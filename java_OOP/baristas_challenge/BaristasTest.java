public class BaristasTest{
    public static void main(String[] args){
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Jon");
        Order order4 = new Order("Chris");
        Order order5 = new Order("Tyler");
        
        Item item1 = new Item("cappucino", 5.5);
        Item item2 = new Item("Mocha", 6.5);
        Item item3 = new Item("Latte", 4.5);
        Item item4 = new Item("Drip Coffee", 5.0);

        order1.addItem(item4);
        order1.addItem(item3);
        
        order2.addItem(item2);
        order2.addItem(item1);
        
        order3.addItem(item1);
        order3.addItem(item3);
        
        order4.addItem(item2);
        order4.addItem(item2);
        
        order5.addItem(item4);
        order5.addItem(item1);

        System.out.println(order1.getStatusMessage());

        order2.setReady(true);
        order3.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        
        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
public class Coffeedore64Test {

    public static void main(String[] args){

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        coffeeKiosk.addMenuItem("cappucino", 5.5);
        coffeeKiosk.addMenuItem("Mocha", 6.5);
        coffeeKiosk.addMenuItem("Latte", 4.5);
        coffeeKiosk.addMenuItem("Drip Coffee", 5.0);

        // coffeeKiosk.displayMenu();
        // coffeeKiosk.newOrder();
        coffeeKiosk.addMenuItemByInput();
        coffeeKiosk.displayMenu();



    }
}

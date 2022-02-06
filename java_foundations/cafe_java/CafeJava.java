public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = " Your total is $";
        String displayNewTotalMessage = " Your new total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 3.0;
        double cappuccinoPrice = 3.5;

        
        
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        String readyCindhuri = isReadyOrder1 ? (customer1 + readyMessage) : (customer1 + pendingMessage);
        String readySam = isReadyOrder2 ? (customer2+ readyMessage) : (customer2+ pendingMessage);
        String readyJimmy = isReadyOrder3 ? (customer3 + readyMessage) : (customer3 + pendingMessage);
        String readyNoah = isReadyOrder4 ? (customer4 + readyMessage) : (customer4 + pendingMessage);
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + readyCindhuri + displayTotalMessage + dripCoffeePrice);
        System.out.println(generalGreeting + readyNoah + displayTotalMessage + cappuccinoPrice);
        System.out.println(generalGreeting + readySam + displayTotalMessage + (cappuccinoPrice *2));
        System.out.println(customer3 + displayNewTotalMessage + (lattePrice - dripCoffeePrice));
    }
}

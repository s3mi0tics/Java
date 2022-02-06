import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int after10Weeks = 0;
        int week = 1;
        while (week <= 10) {
            after10Weeks += week;
            week++;
        }
        return after10Weeks;
    }

    double getOrderTotal(double[] prices) {
        double priceTotal = 0;
        for (double price : prices) {
            priceTotal += price;
        }
        return priceTotal;
    }

    void displayMenu(ArrayList<String> menuItems){
        int index = 0; 
        for (String item : menuItems){
            System.out.println(index + " " + item);
            index += 1;
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        int numberOfCustomers = customers.size();
        System.out.println("There are " + numberOfCustomers + " people in front of you");
        customers.add(userName);
        // return customers;
    }

}

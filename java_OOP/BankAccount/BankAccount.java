public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts;
    public static double totalInAllAccounts;

    public BankAccount(){
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void deposit(double amount, String accountType){
        if(accountType == "checking"){
            this.checkingBalance+= amount;
            totalInAllAccounts+=amount;
        }
        if(accountType == "savings"){
            this.savingsBalance+= amount;
            totalInAllAccounts+=amount;
        }}

    public void withdrawl(double amount, String accountType){
        if(accountType == "checking" && amount<checkingBalance){
            this.checkingBalance-=amount;
            totalInAllAccounts-=amount;
        }
        if(accountType == "savings" && amount<savingsBalance){
            this.savingsBalance-=amount;
            totalInAllAccounts-=amount;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public void displayAccountBalance(){
        System.out.println("Your total ballance is " + (this.checkingBalance + this.savingsBalance));
    }
}
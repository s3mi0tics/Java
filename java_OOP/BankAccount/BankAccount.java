public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    // public static int numberOfAccounts;
    // public static double totalInAllAccounts;
    private static int numberOfAccounts;
    private static double totalInAllAccounts;

    public BankAccount(){
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        // numberOfAccounts ++;
        setNumberOfAccounts();
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
            // totalInAllAccounts+=amount;
            setTotalInAllAccounts(amount);
        }
        if(accountType == "savings"){
            this.savingsBalance+= amount;
            // totalInAllAccounts+=amount;
            setTotalInAllAccounts(amount);
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

        public static int getNumberOfAccounts(){
            return numberOfAccounts;
        }
        
        public static void setNumberOfAccounts(){
            numberOfAccounts +=1;
        }
        
        public static double getTotalInAllAccounts(){
            return totalInAllAccounts;
        }
        
        public static void setTotalInAllAccounts(double amount){
            totalInAllAccounts += amount;
        }
        
    }
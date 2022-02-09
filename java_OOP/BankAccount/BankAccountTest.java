public class BankAccountTest {
    public static void main(String[] arg){
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.deposit(30.5, "checking");
        System.out.println(bankAccount1.getCheckingBalance());
        bankAccount1.deposit(25, "savings");
        System.out.println(bankAccount1.getSavingsBalance());
        // System.out.println(BankAccount.totalInAllAccounts);
        // System.out.println(BankAclearccount.numberOfAccounts);
        System.out.println(BankAccount.getNumberOfAccounts());
       System.out.println(BankAccount.getTotalInAllAccounts());
   }
    }

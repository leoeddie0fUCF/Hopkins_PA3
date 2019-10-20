class SavingsAccount{

    private static double annualInterestRate;
    private double savingsBalance;

    public void setSavingsBalance(double balance){

        savingsBalance = balance;

    }

    public double calculateMonthlyInterest(){

        double interest = 0;

        interest = savingsBalance + (savingsBalance * (annualInterestRate / 12));

        return interest;

    }

    public static void modifyInterestRate(double newrate){

        annualInterestRate = newrate;

    }

}

public class Application {

    public static void main(String[] args){

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        System.out.printf("saver1's Balance: %.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("saver2's Balance: %.2f\n", saver2.calculateMonthlyInterest());

        System.out.println("Setting interest rate to 5%...");

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        System.out.printf("saver1's Balance: %.2f\n", saver1.calculateMonthlyInterest());
        System.out.printf("saver2's Balance: %.2f\n", saver2.calculateMonthlyInterest());

    }

}

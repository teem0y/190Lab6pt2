/**
 * Program Description:
 * Stores a savings account's balance and monthly interest rate and tracks
 * the total deposits, withdraws, and interest.
 * 1. Constructors set the starting balance and the monthly interest rate
 * 2. makeDeposit and makeWithdraw update the balance and totals
 * 3. calcInterest adds a month of interest only when the balance is >0
 * 4. Getters return the balance and each total
 *
 * @author Tobey Agapito
 * @version v1.0
 * @since 10/16/2026
 */

public class BankAccount {
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * No-arg constructor that sets monthlyIntRate to 4.4% divided by 12.
     * All other instance variables default to 0.
     */
    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
    }

    /**
     * Sets the starting balance in whole dollars and converts the annual
     * rate to a monthly rate.
     * @param inBalance starting balance in whole dollars
     * @param intRate annual interest rate, ie 4.4 for 4.4%
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate / 100 / 12;
    }

    /**
     * Sets the starting balance in dollars and cents and converts the annual
     * rate to a monthly rate.
     * @param inBalance starting balance in dollars and cents
     * @param intRate annual interest rate, ie 4.4 for 4.4%
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate / 100 / 12;
    }

    /**
     * Adds a deposit to the balance and the deposit total.
     * @param add the deposited amount in dollars and cents
     */
    public void makeDeposit(double add) {
        balance += add;
        deposit += add;
    }

    /**
     * Adds a deposit to the balance and the deposit total.
     * @param add the deposited amount in whole dollars
     */
    public void makeDeposit(int add) {
        balance += add;
        deposit += add;
    }

    /**
     * Subtracts a withdraw from the balance and adds it to the withdraw total.
     * @param sub the withdrawn amount in dollars and cents
     */
    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Subtracts a withdraw from the balance and adds it to the withdraw total.
     * @param sub the withdrawn amount in whole dollars
     */
    public void makeWithdraw(int sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Adds one month of interest to the balance and the interest total.
     * Interest is only calculated when the balance is above 0.
     */
    public void calcInterest() {
        double monthInterest;
        if (balance > 0){
            monthInterest = balance * monthlyIntRate;
            balance += monthInterest;
            interest += monthInterest;
        }
    }

    /**
     * Returns the current balance.
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the total deposited.
     * @return total deposits
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Returns the total withdrawn.
     * @return total withdraws
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * Returns the total interest earned.
     * @return total interest
     */
    public double getInterest() {
        return interest;
    }
}
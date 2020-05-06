package Accounts;

import java.util.*;

/**
 * 
 */
public abstract class Account {

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * 
     */
    public double  balance;


    /**
     * @param balance
     */
    public void Account(double balance) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double  getBalance() {
        // TODO implement here
        return null;
    }

    /**
     * @param amount 
     * @return
     */
    public boolean deposit(double amount) {
        // TODO implement here
        return false;
    }

    /**
     * @param amount 
     * @return
     */
    public abstract boolean  withdraw(double amount);

}
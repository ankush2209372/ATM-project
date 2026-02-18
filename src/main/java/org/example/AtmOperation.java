package org.example;

public class AtmOperation {
    Atm atm = new Atm();

    public double viewbalance() {
        System.out.println("the balance is" + atm.getBalance());
        if (atm.getBalance() == null) {
            atm.setBalance(Double.valueOf(0));
        }
        System.out.println("the balance is " + atm.getBalance());
        return atm.getBalance();
    }

    public void Deposit(Double amount) {
        if (atm.getBalance() == null) {
            atm.setBalance(Double.valueOf(0));
        }
        atm.setBalance((atm.getBalance() + amount));
        viewbalance();
    }

    public void withdraw(Double amount) {
        if (atm.getBalance() == null) {
            atm.setBalance(Double.valueOf(0));
        }
        atm.setBalance((atm.getBalance() - amount));
        viewbalance();
    }
}




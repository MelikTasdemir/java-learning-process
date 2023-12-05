package day18;

public class BankAcc {

public String AccountHolder;
public long AccountNumber;
public double Balance;

    public void setInfo(String accountHolder, long accountNumber) {
        AccountHolder = accountHolder;
        AccountNumber = accountNumber;
    }


    public String toString() {
        return "BankAcc{" +
                "AccountHolder='" + AccountHolder + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", Balance= $" + Balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Available Balance is; $" + Balance);
    }

    public void deposit(double amount) {
        if (amount < 1) {
            System.out.println("Insufficient amount" + amount);
            return;
        }
    Balance += amount;
    }

    public void wthdraw(double amount){
        if (amount < 0) {
            System.err.println("Insufficient amount" + amount);
            return;
        } else if (amount > Balance) {
            System.err.println("Insufficient amount" + amount);
            return;
        }

        Balance -= amount;
    }


}

/*
 Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount
 */
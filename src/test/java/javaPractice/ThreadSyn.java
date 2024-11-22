package javaPractice;

import java.util.Scanner;

class Account {
	int balance;

	Account(int b) {
		balance = b;
	}

	boolean isSufficientBal(int w) {
		if (balance > w) {
			return true;
		} else {
			return false;
		}
	}

	void withdraw(int amount, String g1) {
		balance = balance - amount;
		System.out.println("Transaction Successful.");
		System.out.println("Current Balance is " + balance);
	}
}

class Customer implements Runnable {
	String m1;
	Account x1;

	Customer(Account j1, String h1) {
		x1 = j1;
		m1 = h1;
	}

	public void run() {
		synchronized (x1) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter amount to withdraw for " + m1 + ":");
			int amount = s1.nextInt();
			if (x1.isSufficientBal(amount)) {
				x1.withdraw(amount, m1);
			} else {
				System.out.println("Insufficient Balance");
			}
		}
	}
}

public class ThreadSyn {
	public static void main(String[] args) {
		Account a1 = new Account(5000);
		Customer c1 = new Customer(a1, "amit");
		Customer c2 = new Customer(a1, "sumit");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}
package Besant.Corejavarohith;

import java.util.Scanner;

public class LoopsPract {
	
	public static void main(String[] args) {
		 LoopsPract TC = new LoopsPract();
		 TC.Transaction();
	 }


	public void Transaction() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Welcome to Pay Transactions!");
	
	    while (true) {
	        System.out.println("\nEnter the amount to send (if enter 0 program exit):");
	        int amountToSend = scanner.nextInt();
	
	        // Exit if the user enters 0
	        if (amountToSend == 0) {
	            break;
	        }
	
	        if (amountToSend < 1 || amountToSend > 100000) {
	            System.out.println("Invalid amount. Transactions can't be made!!");
	            continue; 
	        }
	
	        // Calculate the split amount
	        int splitAmount = amountToSend / 10;
	        int remainingAmount = amountToSend % 10;
	
	        // Distribute the remaining amount equally among the splits
	        for (int i = 0; i < 10; i++) {
	            int transactionAmount = splitAmount;
	            if (remainingAmount > 0) {
	                transactionAmount++;
	                remainingAmount--;
	            }
	            System.out.println("Transaction " + (i + 1) + ": Amount sent Rs. " + transactionAmount);
	        }
	    }
	
	    scanner.close();
	}
}

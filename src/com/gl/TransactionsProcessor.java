package com.gl;

import java.util.Scanner;

public class TransactionsProcessor {
	public int transactionsArraySize;
	public int transactionsArray[];
	public int transactionsSumArray[];
	public int numberOfTotalTargets;
	Scanner sc = new Scanner(System.in);

	public void implementationOfTransactionsProcessor() {

		System.out.println("Enter the size of transaction array");
		transactionsArraySize = sc.nextInt();
		transactionsArray = new int[transactionsArraySize];
		transactionsSumArray = new int[transactionsArraySize];
		System.out.println("Enter the values of transaction array");
		getTransactionsValues();
		// printValues();
		System.out.println("Enter the total no of targets that needs to be achieved");
		numberOfTotalTargets = sc.nextInt();
		calculateTargets();
	}

	public void getTransactionsValues() {
		for (int i = 0; i < transactionsArraySize; i++) {
			transactionsArray[i] = sc.nextInt();
			
			if (i == 0) {
				transactionsSumArray[i] = transactionsArray[i];
			} else {
				transactionsSumArray[i] = transactionsArray[i] + transactionsSumArray[i - 1];
			}
		}
	}

	public void printValues() {
		for (int i = 0; i < transactionsArraySize; i++) {
			System.out.println("Value at position " + i + " is:" + transactionsSumArray[i]);
		}
		System.out.println();
	}

	public void calculateTargets() {
		for (int i = 0; i < numberOfTotalTargets; i++) {
			int target = 0, flag = 0, j = 0;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			for (j = 0; j < transactionsArraySize; j++) {
				if (transactionsSumArray[j] >= target) {
					flag++;
					break;
				} else {
					continue;
				}
			}
			if (flag != 0)
				System.out.println("Target achieved after " + (j + 1) + " transactions");
			else {
				System.out.println("Given target is not achieved");
			}
		}

	}

	public static void main(String args[]) {
		TransactionsProcessor transactionsProcessor = new TransactionsProcessor();
		transactionsProcessor.implementationOfTransactionsProcessor();
	}

}

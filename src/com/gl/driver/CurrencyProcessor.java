package com.gl.driver;

import java.util.Scanner;

import com.gl.service.NotesCount;
import com.gl.service.QuickSortImplementaion;

public class CurrencyProcessor {

	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int sizeOfDenomination = sc.nextInt();
		int[] currencyDenominations = new int[sizeOfDenomination];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < sizeOfDenomination; i++) {
			currencyDenominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		QuickSortImplementaion quickSortImplementaion = new QuickSortImplementaion();
		quickSortImplementaion.quickSort(currencyDenominations, 0, (currencyDenominations.length - 1));
		
		NotesCount notesCount = new NotesCount();
		notesCount.notesCountImplementaion(amount, currencyDenominations);
	}
}

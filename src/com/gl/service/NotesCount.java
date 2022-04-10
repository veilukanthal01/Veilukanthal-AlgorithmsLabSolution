package com.gl.service;

public class NotesCount {

	public void notesCountImplementaion(int amount, int[] notes) {
		int[] notesCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}
			for (int i = 0; i < notes.length; i++) {
				if (notesCounter[i] != 0) {
					System.out.println(notes[i] + " : " + notesCounter[i]);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "Notes of denomination 0 is invalid");
		}

	}

}

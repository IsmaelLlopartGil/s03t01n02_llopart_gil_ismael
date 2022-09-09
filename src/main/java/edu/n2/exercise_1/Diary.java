package edu.n2.exercise_1;

import java.util.*;

public class Diary {  

	private ArrayList<Address> diaryAddress;
	private ArrayList<PhoneNumber> diaryPhoneNumber;
	
	
	public Diary() {
		diaryAddress = new ArrayList<Address>();
		diaryPhoneNumber = new ArrayList<PhoneNumber>();
	}
	
	public void addEntry (DiaryFactory diaryHandler) {		
		diaryAddress.add(diaryHandler.getAddress());
		diaryPhoneNumber.add(diaryHandler.getPhoneNumber());
		System.out.println("Desant les dades a l'agenda...");
	}
	
	public void callIndex (int index) {
		diaryPhoneNumber.get(index).call();
	}
	
	public void printAddressIndexOnLetter (int index) {
		diaryAddress.get(index).printAddressOnLetter();
	}
}

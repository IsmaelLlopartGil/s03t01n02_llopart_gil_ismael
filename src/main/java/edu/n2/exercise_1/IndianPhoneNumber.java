package edu.n2.exercise_1;

public class IndianPhoneNumber extends PhoneNumber {

	@Override
	public void requestPhoneData() {
		System.out.println("Demanant les dades del telèfon Indi a l`usuari...");
		System.out.println("Desant la informació rebuda en un string formatat.");
		phoneData = "dades del telèfon Indi";
	}

	@Override
	public void call() {
		System.out.print("Trucant a telèfon Indi: ");
		System.out.println(phoneData);
		
	}

}

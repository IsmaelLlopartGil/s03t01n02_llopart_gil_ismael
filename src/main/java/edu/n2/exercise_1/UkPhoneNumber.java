package edu.n2.exercise_1;

public class UkPhoneNumber extends PhoneNumber {

	@Override
	public void requestPhoneData() {
		System.out.println("Demanant les dades del telèfon Britànic a l`usuari...");
		System.out.println("Desant la informació rebuda en un string formatat.");
		phoneData = "dades del telèfon britànic";
	}

	@Override
	public void call() {
		System.out.print("Trucant a telèfon Britànic: ");
		System.out.println(phoneData);
		
	}
}

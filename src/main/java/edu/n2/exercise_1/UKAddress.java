package edu.n2.exercise_1;

public class UKAddress extends Address {

	@Override
	public void requestAddressData() {
		System.out.println("Demanant les dades de l'adreça Britànica a l'usuari...");
		System.out.println("Desant la informació rebuda en un string formatat.");
		addressData = "Dades de la direcció Britànica";
	}

	@Override
	public void printAddressOnLetter() {
		System.out.print("Imprimint adreça Britànica en una carta: ");
		System.out.println(addressData);
		
	}

}

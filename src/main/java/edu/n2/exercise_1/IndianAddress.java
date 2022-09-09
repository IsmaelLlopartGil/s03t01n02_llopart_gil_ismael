package edu.n2.exercise_1;

public class IndianAddress extends Address{

	@Override
	public void requestAddressData() {
		System.out.println("Demanant les dades de l'adreça Índia a l'usuari...");
		System.out.println("Desant la informació rebuda en un string formatat.");
		addressData = "Dades de la direcció Índia";
	}

	@Override
	public void printAddressOnLetter() {
		System.out.print("Imprimint adreça Índia en una carta: ");
		System.out.println(addressData);
	}
}

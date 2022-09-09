package edu.n2.exercise_1;

public class App {

	private void runScenario() {

		Diary diary = new Diary();
		
		diary.addEntry(new IndianDiaryFactory());
	
		diary.addEntry(new UKDiaryFactory());

		diary.printAddressIndexOnLetter(0);
		diary.callIndex(0);
		
		diary.printAddressIndexOnLetter(1);
		diary.callIndex(1);
		
	}

	public static void main(String[] args) {
		new App().runScenario();
	}

}

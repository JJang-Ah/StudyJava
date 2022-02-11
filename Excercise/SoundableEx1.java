package Excercise;

public class SoundableEx1 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.sound();
		printSound(new Dog());
		
		
		
		
		
	}

	
	
	
	private static void printSound(Soundable soundable) {
			System.out.println(soundable.sound());
	}

}

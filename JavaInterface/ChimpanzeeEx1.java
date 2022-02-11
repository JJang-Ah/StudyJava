package JavaInterface;

public class ChimpanzeeEx1 {

	public static void main(String[] args) {
		Chimpanzee mimi = new Chimpanzee();
		iAnimal iAni = mimi;
		iAni.eat();
		iAni.sleep();
		System.out.println("==================");
		Language lang = mimi;
		lang.talk();
		System.out.println("==================");

		AniLang aniLang = mimi;
		aniLang.eat();
		aniLang.sleep();
		aniLang.talk();
		

	}

}

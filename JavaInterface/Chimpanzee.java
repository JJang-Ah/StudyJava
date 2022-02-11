package JavaInterface;

public class Chimpanzee implements AniLang{

	@Override
	public void eat() {
		System.out.println("바나나를 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("나무에서 잡니당");
		
	}

	@Override
	public void talk() {
		System.out.println("오호오호 대화를 나눕니다.");
		
	}

	@Override
	public void group() {
		System.out.println("대장놈 한놈을 중심으로 무리를 짓습니다.");
		
	}
	

}

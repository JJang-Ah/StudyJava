package Javapro;

public class ForEx6 {

	public static void main(String[] args) {
		//문제) 족발 전문 식당 - 직영 농장(돼지, 타조)
		//직원 -저루에 (56)족이라고 써놓음 
		//영수증 17마리 - ?????원
		//돼지 몇마리 타조 몇마리 인지
		
		int pig;
		int tajo;
		for(pig=0;pig<=17;pig++) {
			tajo=17-pig;
			if((pig*4)+(tajo*2)==56) {
				System.out.println("돼지 : " + pig + "마리");
				System.out.println("타조 : " + tajo + "마리");
				break;
				
			}
		}
		//================여기까지는 내가 만든거===============
		
		int sum; //다리 수의 합
		for(int i=1; i<=17; i++) {
			for(int j=1; j<=17; j++) {
				sum=i*4+j*2;
				if(sum==56 && i+j==17) {
					System.out.println("돼지 마릿 수는 "+ i +"마리");
					System.out.println("타조 마릿 수는 " + j + "마리");
					
					
					
				}
			}
		}
	}

}

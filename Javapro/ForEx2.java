package Javapro;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.print("출력하고 싶은 단은? >> ");
		Scanner sc= new Scanner(System.in);
		int gugudan=sc.nextInt();
		System.out.println("**"+gugudan+"단**");

		for(int i=1;i<=19;i++) {
			System.out.println(gugudan+"*"+i+"="+gugudan*i);	
		}
	}

}

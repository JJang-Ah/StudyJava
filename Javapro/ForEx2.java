package Javapro;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.print("����ϰ� ���� ����? >> ");
		Scanner sc= new Scanner(System.in);
		int gugudan=sc.nextInt();
		System.out.println("**"+gugudan+"��**");

		for(int i=1;i<=19;i++) {
			System.out.println(gugudan+"*"+i+"="+gugudan*i);	
		}
	}

}

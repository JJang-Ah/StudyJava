package JavaCollection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		//hashtable >> ����ȭ �Ǿ��� ������ � �޼ҵ尡 �Ϻ��ϰ� ������ �Ǳ��������� ��������ʴ´�.
		
		map.put("hong", "12345"); //Ű(���̵�) �� ��(��й�ȣ)
		map.put("kimcs", "22222");
		map.put("young", "11111");
		map.put("chanho", "33333");
		map.put("sundal", "44444");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���̵� �Է� : ");
			String id = sc.next();
			System.out.print("��й�ȣ�� �Է� : ");
			String pass = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
				}
					
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

		
		
		
		
	}

}

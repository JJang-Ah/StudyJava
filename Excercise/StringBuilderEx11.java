package Excercise;

public class StringBuilderEx11 {

	public static void main(String[] args) {
		//11�� ��������
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i; //sum=sum+i
		}
		System.out.println(str);
		
		// ���ڵ�� �ۼ��ϸ� String ��ü�� 100���̻� �����ϱ� ������
		//�޸𸮸� ���� ��ƸԾ� ���� ���� �ڵ��
		
		//���� �ڵ�
		//StringBuilder ����ؼ� �����
		StringBuilder stb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			stb.append(i);
		}
		str=stb.toString();
		System.out.println(str);
		
		
	}

}

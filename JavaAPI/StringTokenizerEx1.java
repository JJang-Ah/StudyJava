package JavaAPI;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {

		String text = "ȫ�浿, ��ö��, �̿���, ����ȣ, �̵���";
		StringTokenizer st = new StringTokenizer(text,",");
		//new StringTokenizer(text); �����ھ��� ���� ������ �����ڷ� �̿��Ѵ�.

		int count = st.countTokens(); //�и��� ��ū�� ���� ���������� �����ش�.
		System.out.println(count);
		
		for(int i=0; i<count; i++){
			String name=st.nextToken();//�и��� ��ū�� �������� ������ �ش�.
			System.out.println(name);
		}
		
	}

}

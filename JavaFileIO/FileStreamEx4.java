package JavaFileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx4 {
	public static void main(String[] args) {
		

		
		try {
		FileOutputStream fileOutput = new FileOutputStream("C:/JavaFile/test.txt");
		String str = "���⿡ ���� ���� ����˴ϴ�. ��� ��� ȭ����";
		fileOutput.write(str.getBytes());
		fileOutput.close();
		
		} catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
		}
		
	}
}

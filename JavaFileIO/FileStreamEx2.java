package JavaFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamEx2 {

	public static void main(String[] args) {

		
		
		try {
			FileInputStream fileInput = new FileInputStream("C:/JavaFile/co.txt");
			byte[] data = new byte[fileInput.available()]; //������ ������ ũ�⸸ŭ �ҷ��´�.
			while((fileInput.read(data) != -1)) {
				System.out.write(data);
			}
//			System.out.println("======================================");
			//�̷� ������ε� �����ϴ�.
//			int data2;
//			while((data2=fileInput.read()) != -1) {
//				System.out.println(data2);
//			}
			fileInput.close(); //������ �ݾ�����Ѵ�.
		} catch (IOException e) {
			System.out.println("�����͸� �о� �� �� �����ϴ�.");
		}
		
		
		
	}

}

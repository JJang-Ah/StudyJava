package JavaFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamEx2 {

	public static void main(String[] args) {

		
		
		try {
			FileInputStream fileInput = new FileInputStream("C:/JavaFile/co.txt");
			byte[] data = new byte[fileInput.available()]; //파일의 정해진 크기만큼 불러온다.
			while((fileInput.read(data) != -1)) {
				System.out.write(data);
			}
//			System.out.println("======================================");
			//이런 방법으로도 가능하다.
//			int data2;
//			while((data2=fileInput.read()) != -1) {
//				System.out.println(data2);
//			}
			fileInput.close(); //무조건 닫아줘야한다.
		} catch (IOException e) {
			System.out.println("데이터를 읽어 올 수 없습니다.");
		}
		
		
		
	}

}

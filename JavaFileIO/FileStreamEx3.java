package JavaFileIO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamEx3 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C:/JavaFile/co.txt");
			int readNo;
			char[] ch = new char[20];
			while((readNo = fr.read(ch)) != -1) {
				String data = new String(ch, 0, readNo);
				System.out.println(data);				
			}
			
			
		} catch (IOException e) {
			System.out.println("파일을 읽어 올 수 없습니다.");
		}
	}

}

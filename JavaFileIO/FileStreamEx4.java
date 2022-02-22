package JavaFileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx4 {
	public static void main(String[] args) {
		

		
		try {
		FileOutputStream fileOutput = new FileOutputStream("C:/JavaFile/test.txt");
		String str = "여기에 쓰는 글이 저장됩니다. 모두 모두 화이팅";
		fileOutput.write(str.getBytes());
		fileOutput.close();
		
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다.");
		}
		
	}
}

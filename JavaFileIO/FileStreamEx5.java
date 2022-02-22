package JavaFileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamEx5 {

	public static void main(String[] args) {

		File file = new File("C:/JavaFile/memo.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("\n 오늘은 자바 마지막 수업일 \n 내일부터 풀스택 개발 시작~ \n"
					+ "(프론트 개발 ~> 백엔드 개발)");
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다.");
		}
		
		
		
	}

}

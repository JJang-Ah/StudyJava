package JavaFileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamEx5 {

	public static void main(String[] args) {

		File file = new File("C:/JavaFile/memo.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("\n ������ �ڹ� ������ ������ \n ���Ϻ��� Ǯ���� ���� ����~ \n"
					+ "(����Ʈ ���� ~> �鿣�� ����)");
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
		}
		
		
		
	}

}

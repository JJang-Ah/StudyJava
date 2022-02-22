package JavaFileIO;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStreamEx1 {

	public static void main(String[] args) {


		
		
		try {
			File folder = new File("C://JavaFile/html");
			File file1 = new File("C:/JavaFile/corona.txt");
			File file2 = new File("C:/JavaFile/back.txt");
			File file3 = new File(new URI("file:///C:/JavaFile/filetest.txt")); //�� ��ɾ� ���� try catch�� ����.
			if(folder.exists() == false) {
				folder.mkdir();
			}
			if(file1.exists() == false) {
				file1.createNewFile();
			}
			if(file2.exists() == false) file2.createNewFile();
			if(file3.exists() == false) file3.createNewFile();
			File dir = new File("C:/JavaFile");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			
			File[] contents = dir.listFiles(); 
			//dir �ּҿ� contents�� �迭�� ����� �ִ´�.     
			System.out.println("�̸�             ������ ��¥              ����       ũ��");
			System.out.println("===========================================");
			for(File file : contents) {
				System.out.print(file.getName() + "\t");
				if(file.isDirectory()) {
					System.out.print("\t");
				}
				System.out.print(sdf.format(new Date(file.lastModified())) + "  ");
				if(file.isDirectory()) { //file�� �����ΰ�?
					System.out.print("��������");
				}else {
					System.out.print("�ؽ�Ʈ ����");
				}
				System.out.println("  " + file.length());
			}
			
			
		}catch(Exception ew) {
			System.out.println("���� ó�� ���� ����!");
		}
//		catch (URISyntaxException e) { //�ּҾȿ� ������ ���� ��� ����
//			e.printStackTrace();
//		}
		
		
		
				
		
	}

}

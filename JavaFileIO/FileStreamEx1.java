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
			File file3 = new File(new URI("file:///C:/JavaFile/filetest.txt")); //이 명령어 땜에 try catch를 쓴다.
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
			//dir 주소에 contents란 배열을 만들어 넣는다.     
			System.out.println("이름             수정한 날짜              유형       크기");
			System.out.println("===========================================");
			for(File file : contents) {
				System.out.print(file.getName() + "\t");
				if(file.isDirectory()) {
					System.out.print("\t");
				}
				System.out.print(sdf.format(new Date(file.lastModified())) + "  ");
				if(file.isDirectory()) { //file이 폴더인가?
					System.out.print("파일폴더");
				}else {
					System.out.print("텍스트 문서");
				}
				System.out.println("  " + file.length());
			}
			
			
		}catch(Exception ew) {
			System.out.println("파일 처리 도중 에러!");
		}
//		catch (URISyntaxException e) { //주소안에 파일이 없을 경우 에러
//			e.printStackTrace();
//		}
		
		
		
				
		
	}

}

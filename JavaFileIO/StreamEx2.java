package JavaFileIO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("��¯��", 47), new Student("��ö��", 90)
				, new Student("�ͱ�", 89));
		
		Stream<Student> st = list.stream();
		System.out.println("**����ǥ**");
		st.forEach(stu -> {
			String name = stu.getName();
			int score = stu.getScore();
			System.out.println(name + " : " + score);
		});
		
	}

}

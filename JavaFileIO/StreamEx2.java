package JavaFileIO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("½ÅÂ¯±¸", 47), new Student("±èÃ¶¼ö", 90)
				, new Student("¸Í±¸", 89));
		
		Stream<Student> st = list.stream();
		System.out.println("**¼ºÀûÇ¥**");
		st.forEach(stu -> {
			String name = stu.getName();
			int score = stu.getScore();
			System.out.println(name + " : " + score);
		});
		
	}

}

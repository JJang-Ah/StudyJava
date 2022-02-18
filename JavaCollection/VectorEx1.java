package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		list.add(new Board("방가방가", "심심해서 해봣따~", "나는 김찰스"));
		list.add(new Board("코로나", "마스크 잘 쓰고 다니자~", "이영희"));
		list.add(new Board("주말하이", "해피해피주말 고고링", "고길동"));
		
		list.add(new Board("방가방가", "가나다라마바파", "나는 김찰스"));
		list.add(new Board("방가방가", "야야야ㅑㅇ이야이야", "이영희"));
		
		list.remove(2);
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + 
			board.content + "\t" + board.writer);
		}
		
		
				
	}

}

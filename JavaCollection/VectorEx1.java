package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		list.add(new Board("�氡�氡", "�ɽ��ؼ� �ؔf��~", "���� ������"));
		list.add(new Board("�ڷγ�", "����ũ �� ���� �ٴ���~", "�̿���"));
		list.add(new Board("�ָ�����", "���������ָ� ���", "��浿"));
		
		list.add(new Board("�氡�氡", "�����ٶ󸶹���", "���� ������"));
		list.add(new Board("�氡�氡", "�߾߾ߤ����̾��̾�", "�̿���"));
		
		list.remove(2);
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + 
			board.content + "\t" + board.writer);
		}
		
		
				
	}

}

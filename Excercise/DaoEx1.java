package Excercise;

public class DaoEx1 {

	public static void main(String[] args) {
		//8장 연습문제
		
		
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}

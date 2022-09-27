package str;

public class StringTest3 {

	public static void main(String[] args) {
		
		//스트링 버퍼를 써라 
		StringBuilder sql =new StringBuilder();

			System.out.println(sql.length() +":" + sql.capacity() + ":" + sql.toString());
			sql.append("안녕하세여");
			System.out.println(sql.length()+ ":" + sql.capacity() + ":" + sql.toString());
			sql.append("안녕하세여");
			System.out.println(sql.length()+ ":" + sql.capacity() + ":" + sql.toString());
			sql.append("안녕하세여");
			System.out.println(sql.length() +":" + sql.capacity() + ":" + sql.toString());
			sql.append("안녕하세여");
		
	}

}

package mymytest;

public class java06 {
	public static void main(String[] args) {

 
		//한방에 담음 
		/*String[] member = { "박정훈", "황현근", "한이람" };
		//조건문 루프
		for (int i = 0; i < member.length; i++) {
			
			System.out.println(member[i] + "이 상담 받았습니다" );
		}
		*/
		
		String[] member = { "박정훈", "황현근", "한이람" };
		//조건문 루프
		for (int i = 0; i < member.length; i++) {
			String members = member[i];
			System.out.println(members + "이 상담 받았습니다" );
		
	
	}
	
}
}
package operator;

import java.util.Scanner;

public class OpTest14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("n : " ); 
		int n=sc.nextInt();//킵드 가을 인ㄷ트 갑스 넣을건데 그거를 저장하겠어엉

		
		
	//int n=1;// n은 주민 7번째 숫자라고 가정 
	//System.out.println(n == 1 ? "남 : 여 ");
		
		System.out.println( n == 1 || n == 3 ? "남" :
			 				n == 2 || n == 4 ? "여" : "에러");
			}
}
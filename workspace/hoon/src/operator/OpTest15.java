package operator;

import java.util.Scanner;

public class OpTest15 {
	public static void main(String[] args) {

		//Scanner와 조건 연산 사용, 정수를 입력받아 짝수 홀수 판별.
		Scanner a = new Scanner(System.in);
		System.out.println("짝수 홀수 판별 :    " ); 
		int n=a.nextInt();
		
		
		System.out.println( n % 2 == 0 ? "짝수" : "홀수" );
		
			}
}
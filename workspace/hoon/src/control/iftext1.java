package control;

import java.util.Scanner;

public class iftext1 {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) {
		System.out.println("남자면1 여자면2");
	int n =sc.nextInt();
	
	 if (n == 1)
		 System.out.println("남");
	 System.out.println("종료");
	 //블럭?
	 if(n == 1) System.out.println("남");
	 else if (n == 2) System.out.println("여");
	 else System.out.println("입력오류");
	 System.out.println("종료");
		}
	}
}
//문제 Scanner로 이용해서 0~100정수를 입력받음. 90점 이상이면a , 80점이상이면 b,70이상이면c

(Scanner sc = new Scanner(System.in)) {
	System.out.println("점수 입력");
	int score =sc.nextInt();
	if(score >= 90) 
		System.out.println("A");
	if( 80 <= score <= 90)
		System.out.println("B");
	else if (70 >= score)
		System.out.println("F");
	 System.out.printf( );
	 
	 
	 ---------------
	 //방법2  -성능상 좋다 116pg
	 if		( 1 <= score <) System.out.println("a");
	 else if( 80 <= score && score <= 89) System.out.println("b");
	 else if( 70 <= score && score <= 78) System.out.println("c");
	 else if( 60 <= score && score <= 169) System.out.println("d");
	
	 
	 -------
	 //제어문 문제- 가위 바위 보 Math.random()을 이용해서 1~3사이의 난수 발생 
	 //1이면 가위 2면 바위 3이면 보
	 
	 
	 
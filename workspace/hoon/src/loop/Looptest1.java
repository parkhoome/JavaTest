package loop;

public class Looptest1 {
	public static void main(String[] args) {
// 
		for (int j =1 ; j <= 6; j++) {
			for (int i = 1; i<=j; i = i + 1) {

				System.out.print("*");
			}
			System.out.println();

		}
	}
}

//***** 1행은 5열까지 * 출력 =6
//****  2행은 4열까지 =6
//***   3행은 3열
//**
//*
//i +j =6   => j = 6-i

/*
 ***** 1행 1열부터 1,2,3,4,5,열 * 출력 2행2~5* 3행 3~5
 **
 *
 *
 * 행 <= 열 , i<=j
 */

/*
 * 1행 5열 =6 2행 4.5열 =6 3행 3.4.5 2.3.4.5 1.2.3.4.5 행<=열 6
 */
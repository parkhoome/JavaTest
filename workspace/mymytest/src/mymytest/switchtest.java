package mymytest;

import java.util.Scanner;

public class switchtest {
	public static void main(String[] args) {

		Scanner you = new Scanner(System.in);
		System.out.println("숫자을 입력하세요");
		int consol = you.nextInt();

		int n = consol;
		switch (n) {
		case 1:
			System.out.println("20");
			break;
		case 2:
			System.out.println("30");
			break;
		case 3:
			System.out.println("40");
			break;
		}
		
	}
}
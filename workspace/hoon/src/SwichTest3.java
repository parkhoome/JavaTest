import java.util.Scanner;

public class SwichTest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2 보는 3을 입력하세요>");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3 + 1);
		System.out.println(com);

		System.out.println("you " + you);
		System.out.println("com" + com);

		switch ((you - com + 3) % 3) {
		case 1:

		case 2:
		}
	}
}
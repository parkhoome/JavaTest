package FieldComponent;
//225p
public class A {

	int m = 3;
	int n = 4;

	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);

	}

	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		//메서드 호출 ]
		a.work1(); // 스택 메모리에 추가
	}
}

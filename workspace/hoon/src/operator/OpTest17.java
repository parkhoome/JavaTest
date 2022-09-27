package operator;

public class OpTest17 {
	public static void main(String[] args) {

		
		//형변환은 언제 사용?
	double d = 10;  //10.0 으로 저장됨 출력 10.0 (자동형변환 ,묵시적 형변환)
	System.out.println(d);
 	//실수타입을 정수타입 // 넓은 쪽에서 쫍은 쪽으로 이동할때 변함
	
	int i = (int )3.14;  //반올림이 아니고 버림으로 출력됨 3으로 (강제형변환)
	System.out.println(i);
			}
}
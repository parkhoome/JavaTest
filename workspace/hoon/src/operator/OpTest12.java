package operator;

public class OpTest12 {
	public static void main(String[] args) {

		byte a =10;   //0000 1010
		byte b =6;   //0000 0110  ,,1010 0110 이라면 
		byte c =-1;   //1111 1111  ,, 이라면 
		
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(~c);

	}
}
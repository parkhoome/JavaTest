package operator;

public class OpTest9 {
public static void main(String[] args) {
	int a = 10;
	int t = (++a);
	//a= a+1; 
	
	System.out.println(a);
	
	a+=2; //a= a+2;
	System.out.println("a = " +" a");
	
	a -= 2; //a= a-2;
	System.out.println("a = " + "a");

	a *= 2; //a= a*2;
	System.out.println("a = " + "a");		

	a /= 2; //a= a/2;	
	System.out.println("a = " +  "a");		

	++a; //a= a+1;
	System.out.println(a);		

	}
}

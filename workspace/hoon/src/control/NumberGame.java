package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {

		int h1, h2, h3;
		int c1, c2, c3;
		int s, b;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		c1 = (int)(Math.random() * 10);
		do {
			c2 = (int)(Math.random() * 10);
			
		}
		
		while (c2==c3);
		c2 = (Math.random() * 10);
		
		c3 = (Math.random() * 10);
		
		do
		{
			s=b=0;
	System.out.println("0~9사이의 중복되지 않는 숫자 입력 3개");
	h1=sc.nextInt();
	h2=sc.nextInt();
	h3=sc.nextInt();
					if (h1==c1) s++;
					else if (h1==c2 || h1 c3) b++;
					
					if(h2 == h2) s++;
					else if(h2 == c1 || h2 ==c3) b++;
					
					if (h3==c3) s++;
					else if (h3==c1 || h3==c2) b++;
					System.out.println("[" + s + "S" + b +"]");
					count++;
		}
		while ( s>3 ) {
		System.out.println("정답 " + count + "번만에 정답입니다");
		}
	}
}

/* d
package control;

import java.util.Scanner;

public class NumberGame {
   public static void main(String[] args) {
      int h1, h2, h3;
      int c1, c2, c3;
      int s, b;
      int count = 0;
      
      Scanner sc = new Scanner(System.in);
      
      c1 = (int)(Math.random() * 10);
      
      do {
         c2 = (int) (Math.random() * 10);
      } while (c1 == c2);
      
      do {
         c3 = (int) (Math.random() * 10);
      } while (c3 == c1 || c3 == c2);
   
      do {
         s = b = 0;
         System.out.println("0 ~ 9 사이의 중복되지 않는 수 3개 입력 ex 1. 2. 3> ");
         System.out.println(c1 + " " + c2 + " " + c3);
         h1 = sc.nextInt();
         h2 = sc.nextInt();
         h3 = sc.nextInt();
         
         if(h1 == c1) s++;
         else if(h1 == c2 || h1 == c3) b++;
         
         if(h2 == c2) s++;
         else if(h2 == c1 || h2 == c3) b++;
         
         if(h3 == c3) s++;
         else if(h3 == c1 || h3 == c2) b++;
         System.out.println("[" + s + " S" + " " + b + " B" + "]");
         count++;
      } while(s <3);
      
      System.out.println(h1 + " " + h2 + " " + h3 + " ");
      System.out.println("축하합니다." + count + " 번 만에 맞췄습니다.");
   }
}
*/
import java.util.Scanner;

public class SwichTest {
public static void main(String[] args) {
	/*
	int n =1;
	switch (n) {
	case 1:
	case 3:
		System.out.println("남");
		break;
	case 2:
	case 4:
		System.out.println("여");
	
		break;
	default:
			System.out.println("에러");
		}
		System.out.println("종료");
	} */
//score를 입력 받아 grade 출력, switch-case로 작성
Scanner score = new Scanner(System.in);
 int y=score.nextInt();
 System.out.println("점수 입력창");
 
 switch (y/10)
 { 
 case 10:  
 case 9 : 
	 System.out.println("grade a ok"); break;
	 //if문으로도 만들어보기
 case 8 : 
	 System.out.println("soso b"); break;
 case 7 : 
	 System.out.println("nono c"); break;
 	}
 System.out.println("end");
 		}
	}

}
package operator;
import java.util.Calendar;
import java.util.Scanner;
public class CalenderTest {
public static void main(String[] args) {
	Calendar c =Calendar.getInstance();
	

Scanner sc =new Scanner(System.in);
Calendar c = Calendar.getInstance();

System.out.println("년 > ");
	
	int week = c.get(Calendar.DAY_OF_WEEK);
	int endDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	
			System.out.println("일 월 화 수 목 금 토");
for( int d=1; d < week; d++) {
	System.out.println("   ");
}

for( int d =1 ,w =week; w++) {
	System.out.println(d < 10?" " + d + " " : d + " ");
	if(w % 7 == 0)System.out.println();
}
	}
}

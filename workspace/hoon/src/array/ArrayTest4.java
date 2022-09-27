package array;

public class ArrayTest4 {
	public static void main(String[] args) {
         //표행열 순서
		int[][][] score = { 
				{
							{ 100, 90, 80,70}, 
							{  90, 80, 70,60},
							{  80, 70, 60,50} 
				},
				{

							{ 100, 90, 80,70}, 
							{  90, 80, 70,60},
							{  80, 70, 60,50} 
				}
			};
		
		
		System.out.println("국어   영어   수학     총점   평균");
		
		for(int tab=0; tab < score.length; tab++) {
			for(int row =0; row<score[tab].length; row++)
			{
				//왜여기서 시작
				int sum=0;
				for(int col=0; col<score[tab][row].length; col++)
				{
					System.out.print(score[tab][row][col] + "\t");
					//썸 총점 출력
					sum +=score[tab][row][col]; //썸 총점 출력
				}
					
				System.out.println( ); //평점 평군
			}
			System.out.println();
		}

	}
}

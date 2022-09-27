package array;
//184실습
public class ReadArrayData {
	public static void main(String[] args) {
int[][] array1 = new int[2][3];
System.out.println(array1.length);
System.out.println(array1[0].length);
System.out.println(array1[1].length);
System.out.println();

int[][] array2 = new int[][] { {1,2,}, {3,4,5,}};
System.out.println(array2.length);
System.out.println(array2[0].length);
System.out.println(array2[1].length);
System.out.println();


System.out.println(array2[0][0] + "  ");
System.out.println(array2[0][1]+"  ");
System.out.println();
System.out.println(array2[1][0]+" ");

	}
}

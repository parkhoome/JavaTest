package str;

public class MathodsofString {

	public static void main(String[] args) {

		// 문자열 길이
		String str1 = "hello java";
		String str2 = "안녕하세요 반갑습니다";
		System.out.println(str1.length());
		System.out.println(str2.length());
	System.out.println();
	System.out.println();
	System.out.println();
//문자열 검색 .charAt(번째)
		System.out.println(str1.charAt(3));
		System.out.println(str2.charAt(4));
		System.out.println();
		System.out.println();
		System.out.println();
		
		
// 왜 대소문자 차이?   indexOf /lastIndexOf
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a' ,8 ));// 대소문자 차이 
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf("java"));
		System.out.println(str1.indexOf("하세요"));
		System.out.println(str1.lastIndexOf("하세요"));
	
		
		
	}

}

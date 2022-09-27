package basi;

import java.math.BigDecimal;

public class BigNumberTest {

		public static void main(String[] args) {
			System.out.println(2 - 1.1);
			
			BigDecimal b1 = new BigDecimal("2");
			BigDecimal b2 = new BigDecimal("1.1");
			System.out.println(b1.subtract(b2));
		}
}

//빅데시멀 사용방법


System.out.println(Integer.MIN);
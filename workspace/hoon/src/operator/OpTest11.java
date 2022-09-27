package operator;

import java.text.DecimalFormat;

public class OpTest11 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("####,###");
		double seedMoney = 1_000_000;
		int i = 1;
		for (int j = 1; j <= 50; j++) { 
			seedMoney += (seedMoney * 0.4);
			seedMoney -= (seedMoney * 0.3);

			System.out.printf("%3d : %s\n", (i * 2), df.format(seedMoney));

		}
	}
}
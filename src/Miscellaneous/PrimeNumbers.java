package Miscellaneous;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		for (i = 0; i <= 100; i++) {

			k = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				System.out.println(" Prime Numbers from 1 to 100 :" + i);
			}
		}
	}

}
